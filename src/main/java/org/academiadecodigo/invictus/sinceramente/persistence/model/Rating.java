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
    private Float rate;
    private String opinion;


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

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "user=" + user +
                ", institution=" + institution +
                ", rate=" + rate +
                ", description='" + opinion + '\'' +
                '}';
    }
}
