package com.mandor.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mandor.domain.UnitOfMeasure;

/**
 * 
 * @author ridwan
 *
 */

public interface UnitOfMeasureRepository 
				extends CrudRepository<UnitOfMeasure, Long>{
	
	Optional<UnitOfMeasure> findByDescription (String description);
}