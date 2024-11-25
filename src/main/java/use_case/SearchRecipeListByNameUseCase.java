package use_case;

import entity.Ingredient;
import entity.Recipe;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SearchRecipeListByNameUseCase {
    private final List<Recipe> recipeList;

    public SearchRecipeListByNameUseCase(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public List<Recipe> searchRecipes(String name) {
        final List<Recipe> results = new ArrayList<>();
        for (Recipe recipe : recipeList) {
            if (recipe.getName().contains(name)) {
                results.add(recipe);
            }
        }
        return results;
    }
}
