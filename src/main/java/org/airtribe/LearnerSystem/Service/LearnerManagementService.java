package org.airtribe.LearnerSystem.Service;

import org.airtribe.LearnerSystem.Entity.Learner;
import org.airtribe.LearnerSystem.Repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearnerManagementService {

    @Autowired
    private LearnerRepository learnerRepository;

    public Learner createLearner(Learner learner) {
        return learnerRepository.save(learner);
    }

    public List<Learner> getAllLearners() {
        return learnerRepository.findAll();
    }

    public Learner findLearnerById(Long learnerId) {
        return learnerRepository.findById(learnerId).get();
    }
}
