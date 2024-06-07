package com.culturalimmersionplanner.app.rest.Repo;

import com.culturalimmersionplanner.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }