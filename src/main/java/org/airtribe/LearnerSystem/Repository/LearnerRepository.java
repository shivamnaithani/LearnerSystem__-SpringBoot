package org.airtribe.LearnerSystem.Repository;

import org.airtribe.LearnerSystem.Entity.Learner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LearnerRepository extends JpaRepository<Learner ,Long>
{
    @Query("SELECT l FROM Learner l WHERE l.name = :learnerName")
    Learner findName( String learnerName);
    //Learner findName(String learnerName);
}
