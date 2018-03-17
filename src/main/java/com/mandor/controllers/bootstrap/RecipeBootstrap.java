package com.mandor.controllers.bootstrap;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mandor.domain.Recipe;
import com.mandor.domain.UnitOfMeasure;
import com.mandor.repositories.CategoryRepository;
import com.mandor.repositories.RecipeRepository;
import com.mandor.repositories.UnitOfMeasureRepository;

/**
 * 
 * @author ridwan
 *
 */

public class RecipeBootstrap {

	private final CategoryRepository categoryRepository;
	private final RecipeRepository recipeRepository;
	private final UnitOfMeasureRepository unitOfMeasureRepository;
	
	public RecipeBootstrap(CategoryRepository categoryRepository, RecipeRepository recipeRepository,
			UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.recipeRepository = recipeRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}
	
	private List<Recipe> getRecipes() {
		
		List<Recipe> recipes = new ArrayList<>(2);
		
		Optional <UnitOfMeasure> eachUomOptional = unitOfMeasureRepository.findByDescription("each");
		
		if (!eachUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional <UnitOfMeasure> tableSpoonUomOptional = unitOfMeasureRepository.findByDescription("Tablespoon");
		
		if (!tableSpoonUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional <UnitOfMeasure> teasSpoonUomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
		
		if (!teasSpoonUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional <UnitOfMeasure> dashUomOptional = unitOfMeasureRepository.findByDescription("Dash");
		
		if (!dashUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional <UnitOfMeasure> pintUomOptional = unitOfMeasureRepository.findByDescription("Pint");
		
		if (!pintUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
		
		Optional <UnitOfMeasure> cupsUomOptional = unitOfMeasureRepository.findByDescription("Pint");
		
		if (!cupsUomOptional.isPresent()) {
			throw new RuntimeException("Expected UOM not found");
		}
	}
}