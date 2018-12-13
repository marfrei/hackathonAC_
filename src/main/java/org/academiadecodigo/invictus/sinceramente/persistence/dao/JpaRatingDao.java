package org.academiadecodigo.invictus.sinceramente.persistence.dao;

import org.academiadecodigo.invictus.sinceramente.persistence.model.Rating;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class JpaRatingDao extends GenericDao<Rating> implements RatingDao {


    public JpaRatingDao() {
        super(Rating.class);
    }

    @Override
    public List<Rating> listRatings(Integer institutionId) {
        return em.createQuery("SELECT * FROM rating WHERE institution.id= :institutionId" , Rating.class).getResultList();
    }

}
