package com.recipebook.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.recipebook.app.entity.Recipe;

@Service
@SessionScope
public class RecipeService {
	List<Recipe> recipeList = new ArrayList<>();
	public Recipe saveRecipe(Recipe recipe) {
		recipeList.add(recipe);
		System.out.println("RecipeService: " + recipe.toString());
		return recipe;
	}
}
