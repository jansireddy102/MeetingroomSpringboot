package entity

import jakarta.persistence.*
import org.springframework.data.annotation.Id

data class MeetingRoom(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?=null,
    val name: String,
    val capacity:Int

)
