package com.example.jh_mobile_test1.api

import com.example.jh_mobile_test1.utils.Constants.Companion.LOCALHOST_IP
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(LOCALHOST_IP)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val therapistApi: TherapistApi by lazy {
        retrofit.create(TherapistApi::class.java)
    }

    val patientApi: PatientApi by lazy {
        retrofit.create(PatientApi::class.java)
    }
}