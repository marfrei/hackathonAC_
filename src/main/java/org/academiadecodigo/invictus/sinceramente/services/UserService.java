package org.academiadecodigo.invictus.sinceramente.services;

import org.academiadecodigo.invictus.sinceramente.persistence.model.Donation;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Rating;
import org.academiadecodigo.invictus.sinceramente.persistence.model.User;

import java.util.List;

public interface UserService {
    User get(Integer id);

    User save(User user);

    void delete(Integer id);

    List<User> list();

    List<Donation> listDonations(Integer id);

    Donation addDonation(Donation donation);

    Rating addRating(Rating rating);
}
