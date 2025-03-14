package app.programmer_2003.littlelemon.home_page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import app.programmer_2003.littlelemon.R
import app.programmer_2003.littlelemon.home_page.components.HeroSection
import app.programmer_2003.littlelemon.home_page.components.ListItems
import app.programmer_2003.littlelemon.home_page.components.MenuItems

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(
  navController: NavController,
) {
  Scaffold(
    topBar = {
      CenterAlignedTopAppBar(
        title = {
          Text(stringResource(R.string.app_name))
        },
        actions = {
          IconButton(
            onClick = {
              navController.navigate(
                "onboarding"
              )
            }
          ) {
            Icon(
              imageVector = Icons.Filled.AccountCircle,
              contentDescription = stringResource(R.string.onboarding_page),
            )
          }
        }
      )
    },
  ) { paddingValues ->
    Column(
      modifier = Modifier
        .padding(
          paddingValues
        )
        .verticalScroll(
          rememberScrollState()
        )
    ) {
      HeroSection()
      Text(
        stringResource(R.string.order_for_delivery),
        modifier = Modifier
          .padding(
            vertical = 16.dp
          ),
        fontWeight = FontWeight.Bold,
      )
      MenuItems()
      HorizontalDivider(
        modifier = Modifier.padding(
          vertical = 20.dp
        ),
        thickness = 1.dp,
        color = Color.Gray
      )
      ListItems()
    }
  }
}