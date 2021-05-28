package com.examportal.repo;

import com.examportal.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CountryMasterRepository extends JpaRepository<Country, Serializable> {

}
