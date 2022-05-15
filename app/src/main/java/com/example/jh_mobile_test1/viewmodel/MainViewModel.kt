package com.example.jh_mobile_test1.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jh_mobile_test1.model.Patient
import com.example.jh_mobile_test1.repository.PatientRepository
import kotlinx.coroutines.launch

class MainViewModel(private val patientRepository: PatientRepository) : ViewModel() {

    val myResponse: MutableLiveData<Patient> = MutableLiveData()

    fun getPatient() {
        viewModelScope.launch {
            val response: Patient = patientRepository.getPatient()
            myResponse.value = response
        }
    }
}