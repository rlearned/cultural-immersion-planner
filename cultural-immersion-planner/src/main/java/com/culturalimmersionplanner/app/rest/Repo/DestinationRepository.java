package com.culturalimmersionplanner.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.culturalimmersionplanner.app.rest.Models.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Long> { }