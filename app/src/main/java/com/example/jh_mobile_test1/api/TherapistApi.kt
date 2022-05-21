package com.example.jh_mobile_test1.api

import com.example.jh_mobile_test1.data.remote.response.Therapist
import retrofit2.http.GET

interface TherapistApi {

    @GET("therapists/1")
    suspend fun getTherapist(): Therapist
}