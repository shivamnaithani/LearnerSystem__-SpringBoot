package org.airtribe.LearnerSystem.Controller;

import org.airtribe.LearnerSystem.Entity.Learner;
import org.airtribe.LearnerSystem.Service.LearnerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LearnerManagementController {

    @Autowired
    private LearnerManagementService learnerManagementService;

    @PostMapping("/learners")
    public Learner createLearner(@RequestBody Learner learner) {
        return learnerManagementService.createLearner(learner);
    }

    @GetMapping("/learners/{learnerId}")
    public Learner fetchLearnerById(@PathVariable("learnerId") Long learnerId) {
        return learnerManagementService.findLearnerById(learnerId);
    }

    @GetMapping("/learners")
    public List<Learner> fetchLearnerByName(@RequestParam(value = "learnerName", required = false) String learnerName) {
        if (learnerName == null) {
            return learnerManagementService.getAllLearners();
        }
        Learner learner = learnerManagementService.findLearnerByName(learnerName);
        return List.of(learner);
    }
}
