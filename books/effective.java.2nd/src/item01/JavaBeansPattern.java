package item01;


public class JavaBeansPattern {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCalories(27);

        System.out.println(cocaCola);
    }


}

//javabeans pattern - allows inconsitency, mandates mutability
class NutritionFacts{
    //Parameters initialized to default values(if any)
    private int servingSize = -1;//Required;
    private int servings    = -1;
    private int calories    = 0;
    private int fat         = 0;
    private int sodium      = 0;
    private int carbohydrate = 0;

    public NutritionFacts() { }
    //setters

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}

