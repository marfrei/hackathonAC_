package org.academiadecodigo.invictus.sinceramente.services;

import org.academiadecodigo.invictus.sinceramente.persistence.dao.UserDao;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Donation;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Rating;
import org.academiadecodigo.invictus.sinceramente.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private InstitutionService institutionService;

    @Override
    public User get(Integer id) {
        return userDao.findById(id);
    }

    @Transactional
    @Override
    public User save(User user) {
        return userDao.saveOrUpdate(user);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }

    @Override
    public List<User> list() {

        return userDao.findAll();
    }

    @Override
    public List<Donation> listDonations(Integer id) {
        User user = userDao.findById(id);
        return user.getDonations();
    }

    @Override
    public Donation addDonation(Donation donation) {
        User user = userDao.findById(donation.getUser().getId());
        user.addDonation(donation);
        institutionService.addDonation(donation);
        return null;
    }

    @Override
    public Rating addRating(Rating rating) {
        /// FIXME: 13/12/2018
        return null;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setInstitutionService(InstitutionService institutionService) {
        this.institutionService = institutionService;
    }
}
