package com.example.jh_mobile_test1.api

import com.example.jh_mobile_test1.model.PatientList
import com.example.jh_mobile_test1.model.Patient
import retrofit2.http.GET

interface PatientApi {

    @GET("patients")
    suspend fun getPatientList(): PatientList

    @GET("patients/1")
    suspend fun getPatient(): Patient
}