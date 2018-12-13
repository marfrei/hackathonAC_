package org.academiadecodigo.invictus.sinceramente.persistence.dao;

import org.academiadecodigo.invictus.sinceramente.persistence.model.Donation;
import org.springframework.stereotype.Repository;

@Repository
public class JpaDonationDao extends GenericDao<Donation> implements DonationDao{

    public JpaDonationDao() {
        super(Donation.class);
    }



}
