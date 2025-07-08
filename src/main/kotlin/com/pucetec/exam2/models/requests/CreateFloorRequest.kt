package com.pucetec.exam2.models.requests

data class CreateFloorRequest(
     var floor: Long,
     var totalCapacity: Long,
     var occupiedSpots: Long
    )
