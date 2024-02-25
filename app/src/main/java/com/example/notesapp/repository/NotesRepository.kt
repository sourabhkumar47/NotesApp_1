package com.example.notesapp.repository

import com.example.notesapp.database.NoteDatabase
import com.example.notesapp.model.Note

class NotesRepository(private val db: NoteDatabase) {

    suspend fun insertNote(note: Note) {
        db.getNoteDao().insertNote(note)
    }

    suspend fun updateNote(note: Note) {
        db.getNoteDao().updateNote(note)
    }

    suspend fun deleteNote(note: Note) {
        db.getNoteDao().deleteNote(note)
    }

    fun getAllNotes() {
        db.getNoteDao().getAllNotes()
    }
}