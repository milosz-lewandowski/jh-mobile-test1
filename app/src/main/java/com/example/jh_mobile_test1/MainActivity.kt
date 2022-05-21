package com.example.jh_mobile_test1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jh_mobile_test1.patientlist.PatientListScreen
import com.example.jh_mobile_test1.ui.theme.Jhmobiletest1Theme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "patient_list_screen")
            {
                composable("patient_list_screen"){
                    PatientListScreen(navController = navController)
                }
                composable("patient_screen/{patientId}",
                    arguments = listOf(
                        navArgument("patientId"){
                            type = NavType.IntType
                        }
                    )) {
                    val patientId = remember {
                        it.arguments?.getInt("patientId")

                    }
                }

            }

        }
    }
}



@Composable
fun GetPatient() {

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