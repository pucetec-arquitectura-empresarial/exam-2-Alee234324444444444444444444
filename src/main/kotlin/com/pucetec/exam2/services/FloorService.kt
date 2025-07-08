package com.pucetec.exam2.services

import com.pucetec.exam2.models.requests.CreateFloorRequest
import com.pucetec.exam2.models.responses.FloorResponse
import com.pucetec.exam2.repositories.FloorRepository

class FloorService(
    private val floorService: FloorService,
    private val floorRepository: FloorRepository
) {

    fun createFloor(request: CreateFloorRequest): FloorResponse {
        val floor = floorMapper.toEntity(request)
        val savedFloor = floorRepository.save(floor)
        return floorMapper.toResponse(savedFloor)
    }
}