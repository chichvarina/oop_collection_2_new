import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RecipeStorage {
    private final Set<Recipe> recipeSet;

    public RecipeStorage() {
        recipeSet = new HashSet<>();
    }

    public void addRecipe(Recipe recipe) throws Exception {
        //Рецепты не могут иметь одинаковое название
        // — при попытке добавить рецепт с уже занятыми названием необходимо выбросить исключение.
        if(! recipeSet.add(recipe)){
            //класс Set сам по себе не принимает дубли
            //в классе рецептов сравнение происходит только по имени
            //поэтому два рецепта равны если их названия равны
            throw new Exception("Рецепт "+recipe.getNameRecipe()+" уже добавлен");
        }
    }

    public void removeRecipe(Recipe recipe){
        recipeSet.remove(recipe);
    }

    public Set<Recipe> getRecipeSet() {
        return recipeSet;
    }

    @Override
    public String toString() {
        return Arrays.toString(recipeSet.toArray());
    }
}
