package org.academiadecodigo.invictus.sinceramente.command;

import javax.validation.constraints.NotNull;

public class DonationDto {

    @NotNull(message = "No user ser")
    private Integer userId;

    @NotNull(message = "No institution set")
    private Integer institutionId;

    @NotNull(message = "Amount is required")
    private Integer amount;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
