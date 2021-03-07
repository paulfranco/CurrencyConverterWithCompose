package com.example.currencyconverter_compose.data

import com.example.currencyconverter_compose.model.ConvertCurrency
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val currencyRatesApi: CurrencyRatesApi) {

    suspend fun getExchangeRates(queries: Map<String, String>): Response<ConvertCurrency>{
        return currencyRatesApi.getExchangeRates(queries)
    }
}