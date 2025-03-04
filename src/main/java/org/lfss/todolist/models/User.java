package org.lfss.todolist.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_google_uid", nullable = false, length = 64)
    public String userGoogleUid;

    public User(){}
}