package org.academiadecodigo.invictus.sinceramente.services;

import org.academiadecodigo.invictus.sinceramente.persistence.model.Donation;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Institution;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Rating;
import org.academiadecodigo.invictus.sinceramente.persistence.model.User;

import java.util.List;

public interface InstitutionService {
    Institution get(Integer id);

    Institution save(Institution institution);

    void delete(Integer id);

    List<Institution> list();

    List<Donation> listDonations(Integer id);

    void addDonation(Donation donation);

    Rating addRating(Rating rating);
}
