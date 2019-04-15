package br.com.joffer.airline.features.itineraries.model

import br.com.joffer.airline.BuildConfig
import br.com.joffer.airline.infra.RetrofitService
import io.reactivex.Observable

class ItenerariesRepositoryImpl : Iteneraries.Repository {

    private val service by lazy { RetrofitService(ItenerariesApi::class.java, BuildConfig.BASE_URL).apiService }

    override fun fetch(
        country: String,
        currency: String,
        locale: String,
        locationSchema: String,
        originPlace: String,
        destinationPlace: String,
        outBoundDate: String,
        inBoundDate: String,
        adults: Int,
        children: Int,
        infants: Int
    ): Observable<List<ItenerariesModel>> {

        val request = RequestIteneraries(
            country = country,
            currency = currency,
            locale = locale,
            locationSchema = locationSchema,
            originPlace = originPlace,
            destinationPlace = destinationPlace,
            outBoundDate = outBoundDate,
            inBoundDate = inBoundDate,
            adults = adults,
            children = children,
            infants = infants,
            apiKey = BuildConfig.API_KEY
        )

        return service.fetchIteneraries(request)
    }
}