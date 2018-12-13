package org.academiadecodigo.invictus.sinceramente.persistence.service;

import org.academiadecodigo.invictus.sinceramente.persistence.model.Donation;

import java.util.List;

public interface DonationService {

    List<Donation> findAll();
}
