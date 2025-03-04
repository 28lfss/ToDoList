CREATE TABLE IF NOT EXISTS notes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    note_title VARCHAR(32) NOT NULL,
    note_content TEXT NOT NULL,
    user_uid VARCHAR(64) NOT NULL,
    CONSTRAINT user_notes FOREIGN KEY (user_uid) REFERENCES users(user_google_uid) ON DELETE CASCADE
);