package org.airtribe.LearnerSystem.Repository;

import org.airtribe.LearnerSystem.Entity.Learner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearnerRepository extends JpaRepository<Learner ,Long>
{
}
