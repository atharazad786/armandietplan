
package com.armandiet.app

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.armandiet.app.data.AppDatabase
import com.armandiet.app.data.Meal
import java.io.InputStreamReader

object DataSeeder {
    fun seed(context: Context) {
        val db = AppDatabase.get(context)
        val mealDao = db.mealDao()
        // Read meals.json from assets
        val am = context.assets
        val isr = InputStreamReader(am.open("meals.json"), "UTF-8")
        val listType = object : TypeToken<List<Meal>>() {}.type
        val gson = Gson()
        val meals: List<Meal> = gson.fromJson(isr, listType)
        mealDao.insertAll(meals)
    }
}
