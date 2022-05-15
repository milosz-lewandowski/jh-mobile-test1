package com.example.jh_mobile_test1.repository

import com.example.jh_mobile_test1.api.RetrofitInstance
import com.example.jh_mobile_test1.model.PatientList
import com.example.jh_mobile_test1.model.Patient

class PatientRepository {

    suspend fun getPatientList(): PatientList {
        return RetrofitInstance.patientApi.getPatientList()
    }

    suspend fun getPatient(): Patient {
        return RetrofitInstance.patientApi.getPatient()
    }
}