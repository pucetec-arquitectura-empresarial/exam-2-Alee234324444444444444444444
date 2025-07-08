package com.pucetec.exam2.repositories

import com.pucetec.exam2.models.entities.Floor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FloorRepository : JpaRepository<Floor, Long> {

}