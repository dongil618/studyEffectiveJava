package StudyEffectiveJava8.chapter2.item2.inflearn;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * 리팩토링 1 : 점층적 생성자 패턴
 * - 생성자 체이닝
 * - 매개변수가 적은쪽에서 많은 쪽으로 this 호출
 */
@Slf4j
@ToString
public class NutritionFactsRefactor1 {

    private final int servingSize;      // 필수
    private final int servings;         // 필수
    private final int calories;         // 옵션
    private final int fat;              // 옵션
    private final int sodium;           // 옵션
    private final int carbohydrate;     // 옵션

    public NutritionFactsRefactor1(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFactsRefactor1(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFactsRefactor1(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFactsRefactor1(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFactsRefactor1(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFactsRefactor1 nutritionFacts = new NutritionFactsRefactor1(1, 1, 200);
        log.info("nutritionFacts={}", nutritionFacts.toString());
    }
}
