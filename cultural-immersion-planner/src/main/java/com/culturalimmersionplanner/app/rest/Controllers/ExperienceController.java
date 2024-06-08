package com.culturalimmersionplanner.app.rest.Controllers;

import com.culturalimmersionplanner.app.rest.Repo.ExperienceRepository;
import com.culturalimmersionplanner.app.rest.Models.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experiences")
public class ExperienceController {

    @Autowired
    private ExperienceRepository experienceRepository;

    @PostMapping
    public Experience createExperience(@RequestBody Experience experience) {
        return experienceRepository.save(experience);
    }

    @DeleteMapping("/{id}")
    public void deleteExperience(@PathVariable Long id) {
        experienceRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Experience getExperience(@PathVariable Long id) {
        return experienceRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Experience not found"));
    }

//    @PutMapping("/{id}")
//    public void updateExperience(@PathVariable Long id) {
//        experienceRepository.
//    }

    @GetMapping
    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }
}
