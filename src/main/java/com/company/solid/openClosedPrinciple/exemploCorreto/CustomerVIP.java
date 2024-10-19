package com.company.solid.openClosedPrinciple.exemploCorreto;

public class CustomerVIP implements Discount {

    @Override
    public double calculateDiscount(String customer, double originalPrice) {
        return originalPrice * 0.1;
    }
}
