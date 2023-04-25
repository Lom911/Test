package com.example.demo.javacode.yandex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        int sum = 47650;
        if (atm.dispense(sum)) {
            System.out.println("Выдано " + sum);
        } else {
            System.out.println("Невозможно выдать " + sum);
        }
        System.out.println("В банкомате остались купюры :");
        for (Map.Entry<Integer, Integer> entry : atm.getBillCounts().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private Map<Integer, Integer> billCounts;

    public ATM() {
        billCounts = new HashMap<>();
        billCounts.put(50, 20);
        billCounts.put(100, 20);
        billCounts.put(500, 10);
        billCounts.put(1000, 7);
        billCounts.put(5000, 7);
    }

    public boolean dispense(int amount) {
        Map<Integer, Integer> billsDispensed = new HashMap<>();
        int remainingAmount = amount;

        for (int bill : new int[]{5000, 1000, 500, 100, 50}) {
            int billCount = billCounts.get(bill);
            int billsNeeded = remainingAmount / bill;

            int billsDispensedForThisDenomination = Math.min(billCount, billsNeeded);
            billsDispensed.put(bill, billsDispensedForThisDenomination);

            remainingAmount -= billsDispensedForThisDenomination * bill;
            if (remainingAmount == 0) {
                break;
            }
        }

        if (remainingAmount == 0) {
            for (int bill : billsDispensed.keySet()) {
                int countDispensed = billsDispensed.get(bill);
                billCounts.put(bill, billCounts.get(bill) - countDispensed);
            }
            return true;
        } else {
            return false;
        }
    }

    public Map<Integer, Integer> getBillCounts() {
        return new LinkedHashMap<>(billCounts);
    }
}