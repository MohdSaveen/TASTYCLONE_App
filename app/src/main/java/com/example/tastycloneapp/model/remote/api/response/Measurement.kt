package com.example.tastycloneapp.model.remote.api.response

import com.example.tastycloneapp.model.remote.api.response.Unit

data class Measurement(
    val id: Int,
    val quantity: String,
    val unit: Unit
)