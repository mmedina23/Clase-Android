package com.pmd.claseandroid.data.model

import com.google.gson.annotations.SerializedName

data class Vehiculo(
    @SerializedName("cambios")
    val cambios: String,
    val carroceria: String,
    val color: String,
    val disponible: Boolean,
    val id: Int,
    val marca: String,
    val plazas: Int,
    val tipoCombustible: String,
    val valorDia: Int
)