package org.academiadecodigo.invictus.sinceramente.converters;

import org.academiadecodigo.invictus.sinceramente.command.DonationDto;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Donation;
import org.academiadecodigo.invictus.sinceramente.services.InstitutionService;
import org.academiadecodigo.invictus.sinceramente.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DonationDtoToDonation extends AbstractConverter<DonationDto, Donation>{

    private InstitutionService institutionService;
    private UserService userService;

    @Override
    public Donation convert(DonationDto donationDto){
        Donation donation = new Donation();
        donation.setAmount(donationDto.getAmount());
        donation.setInstitution(institutionService.get(donationDto.getInstitutionId()));
        donation.setUser(userService.get(donationDto.getUserId()));
        return donation;
    }

    @Autowired
    public void setInstitutionService(InstitutionService institutionService) {
        this.institutionService = institutionService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
