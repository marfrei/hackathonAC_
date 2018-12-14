package org.academiadecodigo.invictus.sinceramente.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends AbstractModel {

    private String username;
    private String password;
    private String name;
    private String email;

    @OneToMany(
            cascade =  {CascadeType.ALL},

            orphanRemoval = false,

            mappedBy = "user",

            fetch = FetchType.LAZY
    )

    private List<Donation> donations = new ArrayList<>();

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addDonation(Donation donation) {
        donations.add(donation);
        donation.setUser(this);
    }

    public void removeDonation(Donation donation) {
        donations.remove(donation);
        donation.setUser(null);
    }

    public List<Donation> getDonations() {
        return donations;
    }

    public void setDonations(List<Donation> donations) {
        this.donations = donations;
    }
}
