package com.example.jh_mobile_test1.repository

import com.example.jh_mobile_test1.api.RetrofitInstance
import com.example.jh_mobile_test1.model.Therapist

class TherapistRepository {

    suspend fun getTherapist(): Therapist {
        return RetrofitInstance.therapistApi.getTherapist()
    }
}