package org.academiadecodigo.invictus.sinceramente.services;

import org.academiadecodigo.invictus.sinceramente.persistence.model.Rating;

public interface RatingService {

    void save(Rating rating);
    Rating get(Integer id);
}
