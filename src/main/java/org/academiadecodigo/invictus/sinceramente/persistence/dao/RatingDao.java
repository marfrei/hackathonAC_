package org.academiadecodigo.invictus.sinceramente.persistence.dao;

import org.academiadecodigo.invictus.sinceramente.persistence.model.Rating;

import java.util.List;

public interface RatingDao extends Dao<Rating> {

    List<Rating> listRatings (Integer institutionId);
}
