package com.kakakpo.taco_cloud.model

data class TacoOrder(
    val deliveryName: String,
    val deliveryStreet: String,
    val deliveryState: String,
    val deliveryZip: String,
    val ccNumber: String,
    val ccExpiration: String,
    val ccCVV: String,
    val tacos: List<Taco>
)
