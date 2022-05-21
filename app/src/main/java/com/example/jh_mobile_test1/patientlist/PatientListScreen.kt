package com.example.jh_mobile_test1.patientlist

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.jh_mobile_test1.data.model.PatientListEntry

@Composable
fun PatientListScreen(navController: NavController) {
    Surface(color = Color.Green, modifier = Modifier.fillMaxSize()) {
        Column {
            Spacer(modifier = Modifier.height(20.dp))

        }
    }
}

@Composable
fun PatientListEntry(
    entry: PatientListEntry,
    navController: NavController,
    modifier: Modifier = Modifier,
    viewModel: PatientListViewModel = hiltViewModel()
) {
    Box(modifier = modifier
        .shadow(5.dp)
        .aspectRatio(1f)
        .clickable {
            navController.navigate("patient_screen/${entry.id}")
        }) {
        Column {
            Text(text = entry.name, fontSize = 20.sp, textAlign = TextAlign.Center)
        }
    }
}

