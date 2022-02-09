package com.example.tastycloneapp.model.remote.api.response

import com.example.tastycloneapp.model.remote.api.response.IngredientX
import com.example.tastycloneapp.model.remote.api.response.MeasurementX

data class ComponentX(
    val extra_comment: String,
    val id: Int,
    val ingredient: IngredientX,
    val measurements: List<MeasurementX>,
    val position: Int,
    val raw_text: String
)