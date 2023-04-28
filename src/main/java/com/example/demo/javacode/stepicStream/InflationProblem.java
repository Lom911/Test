package com.example.demo.javacode.stepicStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Известно, что с каждым годом: овощи дорожают в 3 раза;
 * фрукты становятся дороже в 4 раза;
 * молочные продукты дорожают в 2 раза.
 * Вы только что купили продукты в продуктовом магазине и хотите предсказать цену своей покупки через N лет.
 * Цена каждой категории бакалейных товаров (овощи, фрукты, молочные продукты) зависит от ее цены в предыдущем году.
 * Вы можете рассчитать цену за N лет по следующей формуле: priceInNYears = initialPrice pow(times, numberOfYears)
 * Категории продуктов представлены перечислением Category, а информация о продуктах хранится в объектах класса Grocery.
 * Вам нужно реализовать метод, который вычисляет общую стоимость списка продуктов за N лет.
 * Если количество лет равно 0, результат должен быть таким же, как если бы мы рассчитывали цену без учета инфляции.
 */
class InflationProblem {

    public static long calculateTotalPriceInFuture(int numberOfYears, List<Grocery> groceries) {
        Map<Category, Integer> map = new HashMap<>();
        map.put(Category.VEGETABLES, 3);
        map.put(Category.DAIRY, 2);
        map.put(Category.FRUITS, 4);


//        priceInNYears = initialPrice * pow(times, numberOfYears)
        return groceries.stream()
                .map(x -> x.getCost() * (long) Math.pow(map.get(x.getCategory()), numberOfYears))
                .reduce(Long::sum).get();

    }

    public static void main(String[] args) {
        List<Grocery> groceries = List.of(
                new Grocery(15, Category.VEGETABLES),
                new Grocery(30, Category.VEGETABLES),
                new Grocery(10, Category.FRUITS),
                new Grocery(20, Category.DAIRY)
        );
        long totalPriceInFuture = calculateTotalPriceInFuture(1, groceries);

        System.out.println(totalPriceInFuture); //215

    }
}

enum Category {
    VEGETABLES,
    FRUITS,
    DAIRY

}

class Grocery {
    private final long cost;
    private final Category category;

    // Imagine that this class has some other fields, but they are skipped for simplicity

    public Grocery(long cost, Category category) {
        this.cost = cost;
        this.category = category;
    }

    public long getCost() {
        return cost;
    }

    public Category getCategory() {
        return category;
    }
}
