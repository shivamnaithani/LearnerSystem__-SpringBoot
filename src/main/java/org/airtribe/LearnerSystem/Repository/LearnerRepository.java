package org.airtribe.LearnerSystem.Repository;

import org.airtribe.LearnerSystem.Entity.Learner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LearnerRepository extends JpaRepository<Learner ,Long>
{
   // @Query("SELECT l1_0 FROM learner l1_0 WHERE l1_0.name = :learnerName")
    Learner findLearnerByName(String learnerName);
}
