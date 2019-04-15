package br.com.joffer.airline.features.itineraries.model

import io.reactivex.Observable

class ItenerariesInteractorImpl : Iteneraries.Interactor {

    private val repository = Iteneraries.Repository.instance

    override fun fetch(): Observable<List<ItenerariesModel>> {
        return repository.fetch(
            country = "UK",
            currency = "GBP",
            locale = "en-GB",
            locationSchema = "iata",
            originPlace = "EDI",
            destinationPlace = "LHR",
            outBoundDate = "2017-05-30",
            inBoundDate = "2017-06-02",
            adults = 1,
            children = 0,
            infants = 0
        )
    }
}