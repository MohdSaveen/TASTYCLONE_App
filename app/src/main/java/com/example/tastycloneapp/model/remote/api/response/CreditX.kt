package com.example.tastycloneapp.model.remote.api.response

import java.io.Serializable

data class CreditX(
    val id: Int,
    val image_url: String,
    val name: String,
    val slug: String,
    val type: String
):Serializable