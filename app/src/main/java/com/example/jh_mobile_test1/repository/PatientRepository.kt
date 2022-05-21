package com.example.jh_mobile_test1.repository

import com.example.jh_mobile_test1.Resource
import com.example.jh_mobile_test1.api.PatientApi
import com.example.jh_mobile_test1.api.RetrofitInstance
import com.example.jh_mobile_test1.data.remote.response.PatientList
import com.example.jh_mobile_test1.data.remote.response.Patient
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PatientRepository @Inject constructor(
    private val api: PatientApi
){



    suspend fun getPatientList(): Resource<PatientList> {
        val response = try {
             api.getPatientList()
        } catch (e: Exception) {
            return Resource.Error(e.toString())
        }
        return Resource.Success(response)
    }

    suspend fun getPatient(id: Int): Resource<Patient> {
        val response = try {
            api.getPatient(id)
        } catch (e: Exception) {
            return Resource.Error(e.toString())
        }
        return Resource.Success(response)
    }
}