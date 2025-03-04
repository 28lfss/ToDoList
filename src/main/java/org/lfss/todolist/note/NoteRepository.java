package org.lfss.todolist.note;

import jakarta.transaction.Transactional;
import org.lfss.todolist.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {
    @Query(value = "SELECT * FROM notes WHERE user_uid = :userUid", nativeQuery = true)
    List<Note> findUserNotes(@Param("userUid") String userUid);

    @Query(value = "SELECT * FROM notes WHERE id = :noteId",nativeQuery = true)
    Optional<Note> findNote(@Param("noteId") String noteId);

    @Transactional
    @Modifying
    @Query(value = "UPDATE notes SET note_title = :noteTitle WHERE id = :noteId",nativeQuery = true)
    void updateNoteTitle(@Param("noteId") int noteId, @Param("noteTitle") String noteTitle);

    @Transactional
    @Modifying
    @Query(value = "UPDATE notes SET note_content = :noteContent WHERE id = :noteId", nativeQuery = true)
    void updateNoteContent(@Param("noteId") int noteId, @Param("noteContent") String noteContent);
}
