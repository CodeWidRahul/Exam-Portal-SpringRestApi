package com.examportal.repo;

import com.examportal.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StateMasterRepository extends JpaRepository<State, Integer> {

	@Query("select s.stateId,s.stateName from State s where s.countryId=:countryId")
	public List<Object[]> findAllByCountryId(Integer countryId);

}
