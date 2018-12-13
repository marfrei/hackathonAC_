package org.academiadecodigo.invictus.sinceramente.persistence.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "donation")
public class Donation extends AbstractModel {


    private User user;
    private Institution institution;
    private Integer amount;

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
