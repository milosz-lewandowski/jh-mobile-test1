package com.example.jh_mobile_test1

import android.os.Bundle
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

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jhmobiletest1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
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
    Text(text = viewModel.myResponse.toString())
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