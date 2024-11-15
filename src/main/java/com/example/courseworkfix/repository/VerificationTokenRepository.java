package com.example.courseworkfix.repository;

import com.example.courseworkfix.model.authEntity.User;
import com.example.courseworkfix.model.authEntity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByUserAndTokenAndUsedFalse(User user, String token);
}
