package org.lfss.todolist.user;

import org.lfss.todolist.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM users WHERE user_google_uid = :userUid", nativeQuery = true)
    Optional<User> findByUid(@Param("userUid") String userUid);
}