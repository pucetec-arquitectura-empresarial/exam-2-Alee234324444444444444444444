package com.pucetec.exam2.models.responses

data class FloorResponse(
    var id: Long,
    var floor: Long,
    var level: Long,
    var totalCapacity: Long,
    var accupieds_pots: Boolean
)
