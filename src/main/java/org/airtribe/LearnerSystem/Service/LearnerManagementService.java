package org.airtribe.LearnerSystem.Service;

import org.airtribe.LearnerSystem.Entity.Learner;
import org.airtribe.LearnerSystem.Repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LearnerManagementService {

    @Autowired
    private LearnerRepository learnerRepository;

    public Learner createLearner(Learner learner) {
        return learnerRepository.save(learner);
    }
}
