package com.akeel.mytaskmanager.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity("tasks")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val description: String,
    val priority: Long = 1,
    val isCompleted: Boolean = false,
    val createdAt: Long = Date().time

) {
    fun getPriorityColour(): Int {
        return when (priority) {
            3L -> android.graphics.Color.RED // red for high
            2L -> android.graphics.Color.YELLOW // yellow for medium
            else -> android.graphics.Color.GREEN // green for low

        }
    }

    fun getPriorityText(): String {
        return when (priority) {
            3L -> "High"
            2L -> "Medium"
            else -> "Low"
        }

    }
}
