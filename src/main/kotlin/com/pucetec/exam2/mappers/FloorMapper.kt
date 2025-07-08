package com.pucetec.exam2.mappers

import com.pucetec.exam2.models.entities.Floor
import com.pucetec.exam2.models.requests.CreateFloorRequest
import com.pucetec.exam2.models.responses.FloorResponse
import kotlin.Long

class FloorMapper {

    fun toEntity(request: CreateFloorRequest): Floor{
        return Floor(
            floor = request.floor,
            totalCapacity = request.totalCapacity

        )
    }

    fun toResponse(floor: Floor): FloorResponse{
        return FloorResponse(
            id = floor.id,
            level = floor.level,
            totalCapacity = floor.totalCapacity,
            accupieds_spots = floor.accupied_spots




        )
    }
}