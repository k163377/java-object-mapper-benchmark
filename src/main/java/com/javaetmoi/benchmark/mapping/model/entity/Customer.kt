package com.javaetmoi.benchmark.mapping.model.entity

import com.javaetmoi.benchmark.mapping.model.Data

@Data
data class Customer(
        var name: String,
        var shippingAddress: Address?,
        var billingAddress: Address
)
