package com.company.solid.openClosedPrinciple.exemploIncorreto;

//Problema: Se você precisar adicionar um novo tipo de cliente (por exemplo, "Premium"),
//terá que modificar o método calculateDiscount, o que quebra o princípio OCP, já que a classe
//deve estar fechada para modificação.

public class DiscountService {

    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.05; // 5% de desconto para clientes regulares
        } else if (customerType.equals("VIP")) {
            return amount * 0.1;  // 10% de desconto para clientes VIP
        }
        return 0;
    }
}
