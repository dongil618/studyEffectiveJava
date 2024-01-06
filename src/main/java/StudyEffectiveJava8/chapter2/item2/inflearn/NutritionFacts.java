package StudyEffectiveJava8.chapter2.item2.inflearn;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Slf4j
public class NutritionFacts {

    private final int servingSize;      // 필수
    private final int servings;         // 필수
    private final int calories;         // 옵션
    private final int fat;              // 옵션
    private final int sodium;           // 옵션
    private final int carbohydrate;     // 옵션

    public NutritionFacts(int servingSize, int servings) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = 0;
        this.fat = 0;
        this.sodium = 0;
        this.carbohydrate = 0;
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = 0;
        this.sodium = 0;
        this.carbohydrate = 0;
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = 0;
        this.carbohydrate = 0;
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = 0;
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts(1, 1, 200);
        log.info("nutritionFacts={}", nutritionFacts.toString());
    }
}