package com.shuham.spring_boot_crash_course.database.repository

import com.shuham.spring_boot_crash_course.database.model.Note
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.Optional


interface NoteRepository : MongoRepository<Note, ObjectId> {

    fun findByOwnerId(ownerId: ObjectId): List<Note>
}

