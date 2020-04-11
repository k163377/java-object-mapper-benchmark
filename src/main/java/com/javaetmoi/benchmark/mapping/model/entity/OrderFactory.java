package com.javaetmoi.benchmark.mapping.model.entity;

import java.util.Arrays;
import java.util.Collections;

public class OrderFactory {

    public static Order buildOrder() {
        Address shippingAddress = new Address("1234 West Townsend", "Boston");
        Address billingAddress = new Address("1234 Market Street", "San Fran");

        Customer customer = new Customer("Joe Smith", shippingAddress, billingAddress);

        return new Order(
                customer, Arrays.asList(new Product("socks"), new Product("shoes"))
        );
    }

    public static Order buildPartialOrder() {
        Address billingAddress = new Address("93 Newcastle Dr.", null);

        Customer customer = new Customer("John Doe", null, billingAddress);

        return new Order(customer, Collections.emptyList());
    }
}
