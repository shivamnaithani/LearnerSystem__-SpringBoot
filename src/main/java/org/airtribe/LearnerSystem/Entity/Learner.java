package org.airtribe.LearnerSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Learner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long learnerID;
    private String name;
    private String username;
    private String password;
    public Learner(Long learnerID, String name, String username, String password) {
        this.learnerID = learnerID;
        this.name = name;
        this.username = username;
        this.password = password;

    }

    public Long getLearnerID() {
        return learnerID;
    }

    public void setLearnerID(Long learnerID) {
        this.learnerID = learnerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
