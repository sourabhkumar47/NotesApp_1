package com.example.notesapp.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u0006J\u0019\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/notesapp/repository/NotesRepository;", "", "db", "Lcom/example/notesapp/database/NoteDatabase;", "(Lcom/example/notesapp/database/NoteDatabase;)V", "deleteNote", "", "note", "Lcom/example/notesapp/model/Note;", "(Lcom/example/notesapp/model/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotes", "insertNote", "updateNote", "app_debug"})
public final class NotesRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.notesapp.database.NoteDatabase db = null;
    
    public NotesRepository(@org.jetbrains.annotations.NotNull
    com.example.notesapp.database.NoteDatabase db) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertNote(@org.jetbrains.annotations.NotNull
    com.example.notesapp.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateNote(@org.jetbrains.annotations.NotNull
    com.example.notesapp.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull
    com.example.notesapp.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void getAllNotes() {
    }
}