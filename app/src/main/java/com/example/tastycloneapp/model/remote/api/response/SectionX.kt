package com.example.tastycloneapp.model.remote.api.response

import java.io.Serializable

data class SectionX(
    val components: List<ComponentX>,
    val name: Any,
    val position: Int
):Serializable