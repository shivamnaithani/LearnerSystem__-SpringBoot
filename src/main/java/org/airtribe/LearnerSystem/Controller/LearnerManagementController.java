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

    @GetMapping("/learners")
    public List<Learner> getLearners() {
        return learnerManagementService.getAllLearners();
    }

    @GetMapping("/learners/{learnerId}")
    public Learner fetchLearnerById(@PathVariable("learnerId") Long learnerId) {
        return learnerManagementService.findLearnerById(learnerId);
    }

    @GetMapping("/learners/{learnerName}")
    public Learner fetchLearnerByName(@PathVariable("learnerName") String learnerName) {
        return learnerManagementService.findLearnerByName(learnerName);
    }
}
