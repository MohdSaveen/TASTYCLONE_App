package com.example.tastycloneapp.model.remote.api.response

import com.example.tastycloneapp.model.remote.api.response.UnitX

data class MeasurementX(
    val id: Int,
    val quantity: String,
    val unit: UnitX
)