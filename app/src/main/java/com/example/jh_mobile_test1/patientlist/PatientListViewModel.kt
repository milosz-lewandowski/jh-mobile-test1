package com.example.jh_mobile_test1.patientlist

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jh_mobile_test1.Resource
import com.example.jh_mobile_test1.data.model.PatientListEntry
import com.example.jh_mobile_test1.repository.PatientRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PatientListViewModel @Inject constructor(
    private val repository: PatientRepository
)  : ViewModel() {

    var patientList = mutableStateOf<List<PatientListEntry>>(listOf())
    var loadError = mutableStateOf("")

    fun getPatientList() {
        viewModelScope.launch {
            val result = repository.getPatientList()
            when(result){
                is Resource.Success -> {
                    //TODO
                }
                is Resource.Error -> {
                    //TODO
                }
            }
        }
    }

}