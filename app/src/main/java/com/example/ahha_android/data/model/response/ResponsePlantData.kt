package com.example.ahha_android.data.model.response
import com.google.gson.annotations.SerializedName


data class ResponsePlantData(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("message")
    val message: String
)

data class Data(
    @SerializedName("id")
    val id: Int,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("level")
    val level: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("ordinalNumber")
    val ordinalNumber: Int,
    @SerializedName("score")
    val score: Int
)