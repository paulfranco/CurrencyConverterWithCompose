package com.example.currencyconverter_compose.data

import com.example.currencyconverter_compose.model.ConvertCurrency
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface CurrencyRatesApi {

    @GET("latest")
    suspend fun getExchangeRates(@QueryMap queries: Map<String, String>): Response<ConvertCurrency>

}

interface CurencyRatesApi {
}