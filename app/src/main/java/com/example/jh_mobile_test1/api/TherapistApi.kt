package com.example.jh_mobile_test1.api

import com.example.jh_mobile_test1.model.Therapist
import retrofit2.http.GET

interface TherapistApi {

    @GET
    suspend fun getTherapist(): Therapist
}