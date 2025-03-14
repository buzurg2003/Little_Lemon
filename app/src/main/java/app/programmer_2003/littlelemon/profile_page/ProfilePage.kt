package app.programmer_2003.littlelemon.profile_page

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
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

@Composable
fun ProfilePage(navController: NavController) {
  Scaffold() { paddingValues ->
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
        stringResource(R.string.logout),
        onClick = {
          navController.navigate("home")
        }
      )
    }
  }
}
