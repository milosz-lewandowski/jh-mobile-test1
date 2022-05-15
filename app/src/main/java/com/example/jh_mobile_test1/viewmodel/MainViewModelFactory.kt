package com.example.jh_mobile_test1.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jh_mobile_test1.repository.PatientRepository

class MainViewModelFactory(private val repository: PatientRepository): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}