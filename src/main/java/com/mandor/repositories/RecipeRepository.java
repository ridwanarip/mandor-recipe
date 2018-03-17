package com.mandor.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mandor.domain.Recipe;

/**
 * 
 * @author ridwan
 *
 */

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}