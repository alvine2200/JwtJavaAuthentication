package com.security.Repository;

import com.security.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    // In your UserRepository interface
    Optional<User> findByEmail(String email);

}
