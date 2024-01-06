package StudyEffectiveJava8.chapter2.item2.inflearn;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class NutritionFactsRefactor2 {

    private int servingSize;      // 필수
    private int servings;         // 필수
    private int calories;         // 옵션
    private int fat;              // 옵션
    private int sodium;           // 옵션
    private int carbohydrate;     // 옵션

    public NutritionFactsRefactor2() {}

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

    public static void main(String[] args) {
        NutritionFactsRefactor2 nutritionFacts = new NutritionFactsRefactor2();
        nutritionFacts.setServingSize(1);
        nutritionFacts.setServings(1);
        nutritionFacts.setCalories(200);

        log.info("nutritionFacts={}", nutritionFacts.toString());
    }
}
