package org.academiadecodigo.invictus.sinceramente.persistence.dao;

import org.academiadecodigo.invictus.sinceramente.persistence.model.Institution;
import org.springframework.stereotype.Repository;

@Repository
public class JpaInstitutionDao extends GenericDao<Institution> implements InstitutionDao{

    public JpaInstitutionDao() {
        super(Institution.class);
    }
}