package org.academiadecodigo.invictus.sinceramente.persistence.services;

import org.academiadecodigo.invictus.sinceramente.persistence.dao.DonationDao;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Donation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationServiceImp implements DonationService {

    private DonationDao donationDao;


    @Override
    public List<Donation> findAll(){
        return donationDao.findAll();
    }

    @Autowired
    public void setDonationDao(DonationDao donationDao) {
        this.donationDao = donationDao;
    }
}



