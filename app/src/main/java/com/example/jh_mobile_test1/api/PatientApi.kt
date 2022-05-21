package com.example.jh_mobile_test1.api

import com.example.jh_mobile_test1.data.remote.response.PatientList
import com.example.jh_mobile_test1.data.remote.response.Patient
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PatientApi {

    @GET("patients")
    suspend fun getPatientList(
//        @Query
//        @Query
    ): PatientList

    @GET("patients/{}")
    suspend fun getPatient(
        @Path("id") id: Int
    ): Patient
}