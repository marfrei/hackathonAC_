package org.academiadecodigo.invictus.sinceramente.converters;

import org.academiadecodigo.invictus.sinceramente.command.DonationDto;
import org.academiadecodigo.invictus.sinceramente.persistence.model.Donation;
import org.springframework.stereotype.Component;

@Component
public class DonationToDonationDto extends AbstractConverter<Donation, DonationDto>{

    @Override
    public DonationDto convert(Donation donation){
        DonationDto donationDto = new DonationDto();
        donationDto.setAmount(donationDto.getAmount());
        donationDto.setInstitutionId(donation.getInstitution().getId());
        donationDto.setUserId(donation.getUser().getId());
        return donationDto;
    }
}
