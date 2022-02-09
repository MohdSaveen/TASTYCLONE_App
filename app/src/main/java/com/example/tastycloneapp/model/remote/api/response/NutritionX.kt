package com.example.tastycloneapp.model.remote.api.response

data class NutritionX(
    val calories: Int,
    val carbohydrates: Int,
    val fat: Int,
    val fiber: Int,
    val protein: Int,
    val sugar: Int,
    val updated_at: String
)