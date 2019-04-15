package br.com.joffer.airline.features.itineraries.model

import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import retrofit2.http.Query

interface ItenerariesApi{

    @POST
    @FormUrlEncoded
    fun fetchIteneraries(@Body body: RequestIteneraries): Observable<List<ItenerariesModel>>

}