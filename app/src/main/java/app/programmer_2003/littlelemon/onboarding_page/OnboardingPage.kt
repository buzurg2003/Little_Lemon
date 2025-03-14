package app.programmer_2003.littlelemon.onboarding_page

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import app.programmer_2003.littlelemon.R
import app.programmer_2003.littlelemon.components.BottomButton
import app.programmer_2003.littlelemon.components.InputField
import app.programmer_2003.littlelemon.components.SectionTitle
import app.programmer_2003.littlelemon.onboarding_page.components.HeroSection

@OptIn(ExperimentalMaterial3Api::class)
@Composable()
fun OnboardingPage(
  navController: NavController,
) {
  Scaffold(
    topBar = {
      CenterAlignedTopAppBar(
        title = {
          Text(stringResource(R.string.onboarding_page))
        },
        navigationIcon = {
          IconButton(
            onClick = {
              navController.popBackStack()
            }
          ) {
            Icon(
              imageVector = Icons.Default.ArrowBack,
              contentDescription = stringResource(R.string.back)
            )
          }
        }
      )
    },
  ) { paddingValues ->
    Box(
      modifier = Modifier
        .padding(paddingValues)
        .fillMaxSize()
    ) {
      Column(
        modifier = Modifier
          .verticalScroll(
            rememberScrollState()
          )
      ) {
        HeroSection()
        SectionTitle(
          stringResource(R.string.personal_information)
        )
        InputField(
          stringResource(R.string.first_name),
          remember {
            mutableStateOf("") }
        )
        InputField(
          stringResource(R.string.last_name),
          remember {
            mutableStateOf("")
          }
        )
        InputField(
          stringResource(R.string.email),
          remember {
            mutableStateOf("")
          }
        )
      }

      BottomButton(
        stringResource(R.string.register),
        onClick = {
          navController.navigate("profile")
        }
      )
    }
  }
}