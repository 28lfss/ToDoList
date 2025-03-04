package org.lfss.todolist.note;

import org.lfss.todolist.models.Note;
import org.lfss.todolist.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {
    @Autowired
    private NoteService noteService;

    @PostMapping("/note")
    public String createNote(@RequestBody Note note) {
        return noteService.createNote(note);
    }

    @DeleteMapping("/note")
    public String deleteNote(@RequestParam Integer noteId) {
        return noteService.deleteNote(noteId);
    }

    @GetMapping("/note")
    public List<Note> userNotes(@RequestParam String userUid) {
        return noteService.getUserNotes(userUid);
    }

    @PutMapping("/note/title")
    public String updateNoteTitle(@RequestParam int noteId, @RequestBody Note note) {
        return noteService.updateNoteTitle(noteId, note);
    }

    @PutMapping("/note/content")
    public String updateNoteContent(@RequestParam int noteId, @RequestBody Note note) {
        return noteService.updateNoteContent(noteId, note);
    }
}
