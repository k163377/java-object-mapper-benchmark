package com.javaetmoi.benchmark.mapping.model.dto

import com.javaetmoi.benchmark.mapping.model.Data

@Data
data class OrderDTO(
        var products: List<ProductDTO>?,
        var customerName: String?,
        var shippingStreetAddress: String?,
        var shippingCity: String?,
        var billingStreetAddress: String?,
        var billingCity: String?
)
