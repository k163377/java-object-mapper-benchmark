package com.javaetmoi.benchmark.mapping.mapper.kmapper

import com.javaetmoi.benchmark.mapping.model.dto.OrderDTO
import com.javaetmoi.benchmark.mapping.model.dto.ProductDTO
import com.javaetmoi.benchmark.mapping.model.entity.Customer
import com.javaetmoi.benchmark.mapping.model.entity.Product
import com.mapk.kmapper.BoundKMapper

private val productMapper: BoundKMapper<Product, ProductDTO> = BoundKMapper(::ProductDTO, Product::class)
fun toDto(customer: Customer?, products: List<Product>?): OrderDTO {
    return OrderDTO(
            products?.map { productMapper.map(it) },
            customer?.name,
            customer?.shippingAddress?.street,
            customer?.shippingAddress?.city,
            customer?.billingAddress?.street,
            customer?.billingAddress?.city
    )
}
