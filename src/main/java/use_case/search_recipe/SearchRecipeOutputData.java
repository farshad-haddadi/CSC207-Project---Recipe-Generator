package use_case.search_recipe;

import entity.Recipe;

import java.util.List;

public class SearchRecipeOutputData {
    private final List<Recipe> recipes;

    public SearchRecipeOutputData(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }
}
