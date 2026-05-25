package com.lionix.jobapplicationportal.repo;

import com.lionix.jobapplicationportal.entity.LoginRequest;
import com.lionix.jobapplicationportal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
}
