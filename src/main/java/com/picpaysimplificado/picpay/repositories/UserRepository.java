package com.picpaysimplificado.picpay.repositories;

import com.picpaysimplificado.picpay.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(Long id);
}
