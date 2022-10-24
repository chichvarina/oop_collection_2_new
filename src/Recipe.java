import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Recipe {
    private final String nameRecipe;
    private Set<Product> productSet;
    private float priceSummary;

    public Recipe(String nameRecipe, Set<Product> productSet) {
        this.nameRecipe = nameRecipe;
        if(productSet==null) {
            this.productSet = new HashSet<Product>();
        }else{
            this.productSet = productSet;
        }
        calculateSummary();
    }

    private void calculateSummary(){
        this.priceSummary=0f;
        Iterator<Product> iterator = productSet.iterator();
        while(iterator.hasNext()){
            this.priceSummary = this.priceSummary + iterator.next().getPrice();
        }
        //System.out.println("priceSummary="+priceSummary);
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public float getPriceSummary() {
        return priceSummary;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }else if(obj==null){
            return false;
        }else if(this.getClass()!=obj.getClass()){
            return false;
        }
        Recipe anyRecipe = (Recipe) obj;
        return this.nameRecipe.equals(anyRecipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return nameRecipe.hashCode();
    }

    @Override
    public String toString() {
        return nameRecipe;
    }
}
