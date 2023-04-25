package com.example.demo.javacode.stepicStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * It is known that every year:
 *
 * vegetables become 3 times more expensive;
 * fruits become 4 times more expensive;
 * dairy groceries become 2 times more expensive.
 * You just got some groceries from a grocery store and you want to predict the price of your purchase after N years.
 * The price of each category of groceries (vegetables, fruits, dairy) depends on its price in the previous year.
 * You can calculate the price in N years using the following formula:
 *
 * priceInNYears = initialPrice * pow(times, numberOfYears)
 * The categories of groceries are presented by the Category enum and the information about groceries is stored in objects of the Grocery class.
 * You need to implement the method that calculates the total price of a list of groceries in N years.
 * If the number of years equals to 0, the result must be the same as if we calculate the price without inflation.
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
