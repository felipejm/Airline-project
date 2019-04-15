package br.com.joffer.airline.features.itineraries.model

import com.google.gson.annotations.SerializedName


data class ItenerariesModel(val legs: List<ItenerariesLegModel>): Iteneraries.Model{



}