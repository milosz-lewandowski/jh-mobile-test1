package com.example.jh_mobile_test1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.jh_mobile_test1.repository.PatientRepository
import com.example.jh_mobile_test1.ui.theme.Jhmobiletest1Theme
import com.example.jh_mobile_test1.viewmodel.MainViewModel
import com.example.jh_mobile_test1.viewmodel.MainViewModelFactory
import java.util.*

class MainActivity : ComponentActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val repository = PatientRepository()
            val viewModelFactory = MainViewModelFactory(repository)
            viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
            viewModel.getPatient()
            viewModel.myResponse.observe(this, Observer { response ->
            })

            }
        }
    }
}

@Composable
fun GetPatient() {
    lateinit var viewModel: MainViewModel
    val patientRepository = PatientRepository()
    val viewModelFactory = MainViewModelFactory(patientRepository)
    viewModel = viewModelFactory.create(MainViewModel::class.java)
    viewModel.getPatient()
    Text(text = viewModel.myResponse.value?.id.toString())
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Jhmobiletest1Theme {
        GetPatient()
    }
}