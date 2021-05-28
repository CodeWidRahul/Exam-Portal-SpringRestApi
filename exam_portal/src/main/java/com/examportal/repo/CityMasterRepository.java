package com.examportal.repo;

import com.examportal.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityMasterRepository extends JpaRepository<City, Integer> {

	@Query("select c.cityId,c.cityName from City c where c.stateId=:stateId")
	public List<Object[]> findAllByStateId(Integer stateId);
}
