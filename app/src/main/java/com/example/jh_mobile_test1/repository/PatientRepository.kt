package com.example.jh_mobile_test1.repository

import com.example.jh_mobile_test1.api.RetrofitInstance
import com.example.jh_mobile_test1.model.PatientList

class PatientRepository {

    suspend fun getPatientList(): PatientList {
        return RetrofitInstance.patientApi.getPatients()
    }
}