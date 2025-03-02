CREATE TABLE IF NOT EXISTS notes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    note_title VARCHAR(32) NOT NULL,
    note_text TEXT,
    user_id INT NOT NULL,
    CONSTRAINT user_notes FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);