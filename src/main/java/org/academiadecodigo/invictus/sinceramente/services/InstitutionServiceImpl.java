package org.academiadecodigo.invictus.sinceramente.services;

import org.academiadecodigo.invictus.sinceramente.persistence.dao.InstitutionDao;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Donation;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Institution;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InstitutionServiceImpl implements InstitutionService {

    private InstitutionDao institutionDao;

    @Override
    public Institution get(Integer id) {
        return institutionDao.findById(id);
    }

    @Transactional
    @Override
    public Institution save(Institution institution) {
        return institutionDao.saveOrUpdate(institution);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        institutionDao.delete(id);
    }

    @Override
    public List<Institution> list() {
        return institutionDao.findAll();
    }

    @Override
    public List<Donation> listDonations(Integer id) {
        return institutionDao.findById(id).getDonations();
    }

    @Override
    public void addDonation(Donation donation) {
        institutionDao.findById(donation.getInstitution().getId()).addDonation(donation);
    }

    @Override
    public Rating addRating(Rating rating) {
        return null;
    }

    @Autowired
    public void setInstitutionDao(InstitutionDao institutionDao) {
        this.institutionDao = institutionDao;
    }
}
