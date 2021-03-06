package com.example.tastycloneapp.model.remote.api.response

import com.example.tastycloneapp.model.remote.api.response.IngredientXX
import com.example.tastycloneapp.model.remote.api.response.MeasurementXX

data class ComponentXX(
    val extra_comment: String,
    val id: Int,
    val ingredient: IngredientXX,
    val measurements: List<MeasurementXX>,
    val position: Int,
    val raw_text: String
)