package com.pucetec.exam2.controllers

import com.pucetec.exam2.constants.Routes
import com.pucetec.exam2.models.requests.CreateFloorRequest
import com.pucetec.exam2.models.responses.FloorResponse
import com.pucetec.exam2.services.FloorService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(Routes.FLOORS)
class FloorController (
    private val floorService: FloorService
)
{
    @PostMapping
    fun createFloor(@RequestBody request: CreateFloorRequest): FloorResponse =
        floorService.createFloor(request)

    @GetMapping
    fun listFloor(): List<FloorResponse> =
        floorService.listFloors()

    fun getFloorById(@PathVariable id: Long): FloorResponse =
        floorService.getfloorById(id)


}




