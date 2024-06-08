package com.culturalimmersionplanner.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.culturalimmersionplanner.app.rest.Models.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long> { }