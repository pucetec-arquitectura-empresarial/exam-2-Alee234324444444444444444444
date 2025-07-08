package com.pucetec.exam2.models.entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Floor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var floor : Long,
    var totalCapacity: Long,
    var occupied_spots: Boolean
)
