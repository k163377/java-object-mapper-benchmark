package com.javaetmoi.benchmark.mapping.mapper.kmapper

import com.javaetmoi.benchmark.mapping.mapper.OrderMapper
import com.javaetmoi.benchmark.mapping.model.dto.OrderDTO
import com.javaetmoi.benchmark.mapping.model.entity.Order
import com.mapk.kmapper.KMapper as Mapper

class KMapperMapper : OrderMapper {
    override fun map(source: Order): OrderDTO = orderMapper.map(source)

    companion object {
        private val orderMapper: Mapper<OrderDTO> = Mapper(::toDto)
    }
}
