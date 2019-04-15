package br.com.joffer.airline.features.itineraries.model

import io.reactivex.Observable

interface Iteneraries{
    interface Model {}
    interface Interactor {
        companion object {
            val instance: Interactor by lazy { ItenerariesInteractorImpl() }
        }

        fun fetch(): Observable<List<ItenerariesModel>>
    }
    interface Repository {
        companion object {
            val instance: Repository  by lazy { ItenerariesRepositoryImpl() }
        }

        fun fetch(
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
        ): Observable<List<ItenerariesModel>>
    }
}
