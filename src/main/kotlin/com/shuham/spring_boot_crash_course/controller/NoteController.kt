package com.shuham.spring_boot_crash_course.controller

import com.shuham.spring_boot_crash_course.database.model.Note
import com.shuham.spring_boot_crash_course.database.repository.NoteRepository
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

@RestController
@RequestMapping("/notes")
class NoteController(private val noteRepository: NoteRepository) {

    data class NoteRequest(
        val id: String?,
        val title: String,
        val content: String,
        val color: Long,
    )

    data class NoteResponse(
        val id: String,
        val title: String,
        val content: String,
        val color: Long,
        val createdAt: Instant,
    )

    @PostMapping
    fun saveNote(
        @RequestBody body: NoteRequest
    ): NoteResponse {
        val note = noteRepository.save(
            Note(
                id = body.id?.let { ObjectId(it) } ?: ObjectId.get(),
                title = body.title,
                content = body.content,
                color = body.color,
                createdAt = Instant.now(),
                ownerId = ObjectId(),
            )
        )
        return NoteResponse(
            id = note.id.toHexString(),
            title = note.title,
            content = note.content,
            color = note.color,
            createdAt = Instant.now(),
        )
    }

    @GetMapping
    fun findByOwnerId(
        @RequestParam(required = true) ownerId: String
    ): List<NoteResponse> {
        return noteRepository.findByOwnerId(ObjectId(ownerId)).map {
            it.toResponse()

        }
    }

    @DeleteMapping(path = ["/{id}"])
    fun deleteById(@PathVariable id: String) {
        noteRepository.deleteById(ObjectId(id))
    }


}

private fun Note.toResponse(): NoteController.NoteResponse {
    return NoteController.NoteResponse(
        id = id.toHexString(),
        title = title,
        content = content,
        color = color,
        createdAt = createdAt,
    )
}