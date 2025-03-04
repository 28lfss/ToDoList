package org.lfss.todolist.note;

import org.lfss.todolist.models.Note;
import org.lfss.todolist.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    String createNote(Note note) {
        noteRepository.save(note);
        return "Note created";
    }

    String deleteNote(Integer noteId) {
        if (noteRepository.existsById(noteId)) {
            noteRepository.deleteById(noteId);
            return "Note deleted";
        }
        else { return "Note not found"; }
    }

    List<Note> getUserNotes(String userUid) {
       return noteRepository.findUserNotes(userUid);
    }

    String updateNoteTitle(int noteId, Note note) {
        noteRepository.updateNoteTitle(noteId, note.title);
        return "Title updated";
    }

    String updateNoteContent(int noteId, Note note) {
        noteRepository.updateNoteContent(noteId, note.content);
        return "Content updated";
    }
}
