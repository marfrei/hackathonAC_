package org.academiadecodigo.invictus.sinceramente.persistence.model;

import com.sun.tools.internal.xjc.model.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name = "rating")
public class Rating extends AbstractModel{

    private User user;
    private Institution institution;
    private Integer rate;
    private String description;


    public User getUser() {
        return user;
    }

    @OneToOne
    public void setUser(User user) {
        this.user = user;
    }

    public Institution getInstitution() {
        return institution;
    }

    @OneToOne
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "user=" + user +
                ", institution=" + institution +
                ", rate=" + rate +
                ", description='" + description + '\'' +
                '}';
    }
}
