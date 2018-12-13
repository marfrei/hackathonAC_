package org.academiadecodigo.invictus.sinceramente.persistence.services;

import org.academiadecodigo.invictus.sinceramente.persistence.dao.RatingDao;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RatingServiceImp implements RatingService {

    private RatingDao ratingDao;

    @Transactional
    @Override
    public void save(Rating rating){
        ratingDao.saveOrUpdate(rating);
    }


    @Override
    public Rating get (Integer id){
        return ratingDao.findById(id);
    }

    public RatingDao getRatingDao() {
        return ratingDao;
    }

    @Autowired
    public void setRatingDao(RatingDao ratingDao) {
        this.ratingDao = ratingDao;
    }
}
