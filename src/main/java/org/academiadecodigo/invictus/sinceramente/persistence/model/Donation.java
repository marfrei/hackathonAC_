package org.academiadecodigo.invictus.sinceramente.persistence.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "donation")
public class Donation extends AbstractModel {

    @OneToOne
    private User user;

    @OneToOne
    private Institution institution;

    private Integer amount;

    public User getUser() {
        return user;
    }

    @Autowired
    public void setUser(User user) {
        this.user = user;
    }

    public Institution getInstitution() {
        return institution;
    }

    @Autowired
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Donation{" +
                "user=" + user +
                ", institution=" + institution +
                ", amount=" + amount +
                '}';
    }
}
