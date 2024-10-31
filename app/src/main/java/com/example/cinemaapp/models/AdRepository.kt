package com.example.cinemaapp.models

import com.example.cinemaapp.network.NetworkAPI

interface AdRepository {
    /** Fetches list of MarsPhoto from marsApi */
    suspend fun fetchAd(): List<AdModel>
}

class AdvertisementRepository (private val api: NetworkAPI): AdRepository {
    override suspend fun fetchAd() = api.getAds()
}