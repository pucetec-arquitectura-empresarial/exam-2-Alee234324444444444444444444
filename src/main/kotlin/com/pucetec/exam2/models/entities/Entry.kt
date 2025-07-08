package com.pucetec.exam2.models.entities

import jakarta.persistence.Entity
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import java.time.LocalDateTime
import java.time.LocalTime

@Entity
@Table("Entry")
data class Entry(
    var id: Long,
    @OneToMany(mappedBy)

    var floor_id: Long,
    var assigned_floor: Long,
    var entry_time: LocalDateTime,
    var exit_time: LocalDateTime


)
