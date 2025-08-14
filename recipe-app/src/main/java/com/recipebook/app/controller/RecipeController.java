package com.recipebook.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.recipebook.app.entity.Recipe;
import com.recipebook.app.service.RecipeService;

@RestController
public class RecipeController {
	@Autowired
	private RecipeService recipeService;
	
	//curl -H 'Content-Type: application/json' -d '{ "name":"coconut rice", "description":"coconut cooked rice", "type":"main dish"}' -X POST http://localhost:8080/saveRecipe
	@PostMapping("/saveRecipe{recipe}")
	public ResponseEntity<Recipe> saveRecipe(@RequestBody Recipe recipe) {
		System.out.println("RecipeController.saveRecipe() " + recipe);

		recipeService.saveRecipe(recipe);
		// Return the created resource with a 201 (created) status code
		recipe.setName(recipe.getName() + "Done");
		
		return ResponseEntity.status(HttpStatus.OK).body(recipe);
	}
}
