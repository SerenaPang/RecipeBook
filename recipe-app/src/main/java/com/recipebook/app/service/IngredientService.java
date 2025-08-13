package com.recipebook.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import com.recipebook.entity.Ingredient;

@Service
@ApplicationScope
public class IngredientService {
	List<Ingredient> ingredients = new ArrayList<>();
	public Ingredient addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
		return ingredient;
	}

}
