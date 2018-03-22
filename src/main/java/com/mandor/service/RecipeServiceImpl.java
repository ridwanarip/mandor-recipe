package com.mandor.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.mandor.domain.Recipe;
import com.mandor.repositories.RecipeRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Ridwan
 *
 */

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

	private final RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

	@Override
	public Set<Recipe> getRecipes() {
		log.debug("I'm in the service");
		
		Set<Recipe> recipeSet = new HashSet<>();
		recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		return recipeSet;
	}
}