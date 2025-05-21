interface MealPlan{
    String getPlanDetails();
}
class vegetarianMeal implements MealPlan{
    public String getPlanDetails(){
        return "Vegetarian Meal Plan";
    }
}
class veganMeal implements MealPlan{
    public String getPlanDetails(){
        return "Vegan Meal Plan";
    }
}
class ketoMeal implements MealPlan{
    public String getPlanDetails(){
        return "Keto Meal Plan";
    }
}
class Meal<T extends MealPlan>{
    private T mealplan;
    public Meal(T mealplan){
        this.mealplan=mealplan;
    }
    public T getMealplan(){
        return mealplan;
    }
}
class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(T plan){
        System.out.println("Generaed paln: "+plan.getPlanDetails());
    }
}
class MealPlanSystem{
    public static void main(String[] args){
        vegetarianMeal veg =new vegetarianMeal();
        ketoMeal keto =new ketoMeal();
        veganMeal vegan=new veganMeal();
        MealPlanGenerator.generateMealPlan(veg);
        MealPlanGenerator.generateMealPlan(keto);
        MealPlanGenerator.generateMealPlan(vegan);
    }
}