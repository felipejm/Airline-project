package br.com.joffer.airline.features.itineraries.model

import com.google.gson.annotations.SerializedName

data class RequestIteneraries(@SerializedName("country")val country: String,
                              @SerializedName("currency")val currency: String,
                              @SerializedName("locale")val locale: String,
                              @SerializedName("locationSchema")val locationSchema: String,
                              @SerializedName("originplace")val originPlace: String,
                              @SerializedName("destinationplace")val destinationPlace: String,
                              @SerializedName("outbounddate")val outBoundDate: String,
                              @SerializedName("inbounddate")val inBoundDate: String,
                              @SerializedName("adults")val adults: Int,
                              @SerializedName("children")val children: Int,
                              @SerializedName("infants")val infants: Int,
                              @SerializedName("apiKey")val apiKey: String)