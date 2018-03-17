package com.mandor.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mandor.domain.Category;

/**
 * 
 * @author ridwan
 *
 */

public interface CategoryRepository extends CrudRepository<Category, Long>{
	
	Optional<Category> findByDescription(String description);
}