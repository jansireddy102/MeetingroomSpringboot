package entity

import jakarta.persistence.*
import java.time.LocalTime

@Entity
data class Reservation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    val startTime: LocalTime,
    val endTime: LocalTime
)
