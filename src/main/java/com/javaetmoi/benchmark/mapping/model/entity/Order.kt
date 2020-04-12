package com.javaetmoi.benchmark.mapping.model.entity

import com.javaetmoi.benchmark.mapping.model.Data

@Data
data class Order(
        var customer: Customer?,
        var products: List<Product>?
)
