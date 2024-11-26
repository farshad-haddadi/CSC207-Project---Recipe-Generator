package view;

import java.util.List;

import entity.Recipe;
import entity.User;

import javax.swing.*;
// import interface_adapter.BookmarkController;

// implements ActionListener removed for now
public class RecentlyViewedView extends RecipeListView {

    public RecentlyViewedView(User user) {
        super(user);
        setTitle(user.getUsername() + "'s Recently Viewed");
        final JButton clearButton = new JButton("Clear Recently Viewed");
        clearButton.addActionListener(e -> {
            userDAO.clearRecentlyViewed(user.getUsername());
            recipeList.setModel(listModel);
        });
        add(clearButton);
    }

    @Override
    protected List<Recipe> getRecipeList(User user1) {
        return userDAO.getRecentlyViewedFromFile(user1.getUsername());
    }
}
