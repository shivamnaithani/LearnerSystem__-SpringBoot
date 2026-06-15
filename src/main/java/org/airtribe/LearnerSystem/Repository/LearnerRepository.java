package org.airtribe.LearnerSystem.Repository;

import org.airtribe.LearnerSystem.Entity.Learner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface LearnerRepository extends JpaRepository<Learner,Long>
{
}
