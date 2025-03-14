package app.programmer_2003.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import app.programmer_2003.littlelemon.home_page.HomePage
import app.programmer_2003.littlelemon.onboarding_page.OnboardingPage
import app.programmer_2003.littlelemon.profile_page.ProfilePage
import app.programmer_2003.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      LittleLemonTheme {
        val navController = rememberNavController()
        Scaffold() { paddingValues ->
          Column(
            modifier = Modifier
              .fillMaxSize()
              .padding(
                horizontal = 16.dp
              )
          ) {
            NavHost(
              navController = navController,
              startDestination = "home"
            ) {
              composable("home") {
                HomePage(navController)
              }
              composable("profile") {
                ProfilePage(navController)
              }
              composable("onboarding") {
                OnboardingPage(navController)
              }
            }
          }
        }
      }
    }
  }
}