
package com.armandiet.app.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "meals")
data class Meal(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val dayIndex: Int,
    val week: Int,
    val mealTime: String,
    val text: String
)
