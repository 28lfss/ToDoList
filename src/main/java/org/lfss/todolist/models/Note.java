package org.lfss.todolist.models;

import jakarta.persistence.*;

@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(name = "note_title", nullable = false, length = 32)
    public String title;

    @Column(name = "note_content", nullable = false)
    public String content;

    @Column(name = "user_uid", nullable = false)
    public String userUid;

    public Note(){}
}