
package com.armandiet.app.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MealDao {
    @Query("SELECT * FROM meals WHERE week = :week ORDER BY dayIndex")
    fun getMealsForWeek(week: Int): List<Meal>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(meals: List<Meal>)
}
