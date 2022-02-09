package com.example.tastycloneapp.model.remote.api.response

import java.io.Serializable

data class UserRatingsX(
    val count_negative: Int,
    val count_positive: Int,
    val score: Double
):Serializable