package com.javaetmoi.benchmark.mapping.mapper.dozer

import com.javaetmoi.benchmark.mapping.mapper.OrderMapper
import com.javaetmoi.benchmark.mapping.mapper.kmapper.BoundKMapperMapper
import com.javaetmoi.benchmark.mapping.mapper.kmapper.KMapperMapper
import com.javaetmoi.benchmark.mapping.mapper.kmapper.PlainKMapperMapper

class KMapperTest : AbstractMapperTest() {
    override fun testedOrderMapper(): OrderMapper = KMapperMapper()
}

class PlainKMapperTest : AbstractMapperTest() {
    override fun testedOrderMapper(): OrderMapper = PlainKMapperMapper()
}

class BoundKMapperTest : AbstractMapperTest() {
    override fun testedOrderMapper(): OrderMapper = BoundKMapperMapper()
}
