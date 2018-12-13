package org.academiadecodigo.invictus.sinceramente.command;

import javax.validation.constraints.NotNull;

public class RatingDto {
    @NotNull(message = "No user set")
    private Integer userId;

    @NotNull(message = "No institution set")
    private Integer institutionId;

    @NotNull(message = "Rating is mandatory")
    private Float rate;

    private String description;

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

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
