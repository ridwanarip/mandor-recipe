package com.mandor.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mandor.domain.Category;
import com.mandor.domain.UnitOfMeasure;
import com.mandor.repositories.CategoryRepository;
import com.mandor.repositories.UnitOfMeasureRepository;

/**
 * 
 * @author ridwan
 *
 */

@Controller
public class IndexController {
	
	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;

	public IndexController(CategoryRepository categoryRepository,
			UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}

	@RequestMapping({"", "/", "index"})
	public String getIndexPage() {
		
		Optional<Category> categoryOptional = categoryRepository.
				findByDescription("American");
		Optional<UnitOfMeasure> unitOfMeasureOptional = 
		unitOfMeasureRepository.findByDescription("Teaspoon");
		
		System.out.println("Cat is: " + categoryOptional.get().getId());
		System.out.println("UOM is: " + unitOfMeasureOptional.get().getId());
		
		return "index";
	}
}