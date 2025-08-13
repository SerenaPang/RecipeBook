package com.recipebook.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import com.recipebook.entity.Recipe;

@Service
@ApplicationScope
public class RecipeService {
	List<Recipe> recipeList = new ArrayList<>();
	public Recipe saveRecipe(Recipe recipe) {
		recipeList.add(recipe);
		return recipe;
	}
}
