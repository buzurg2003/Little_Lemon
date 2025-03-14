package app.programmer_2003.littlelemon.onboarding_page.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.programmer_2003.littlelemon.R

@Preview
@Composable
fun HeroSection() {
  ElevatedCard(
    elevation = CardDefaults.cardElevation(
      defaultElevation = 6.dp
    ),
    modifier = Modifier
      .fillMaxWidth()
      .padding(
        bottom = 50.dp
      ),
    colors = CardDefaults.elevatedCardColors()
  ) {
    Column(
      modifier = Modifier
        .padding(40.dp)
        .fillMaxWidth()
    ) {
      Text(
        text = stringResource(
          R.string.onboarding_page_hero_section_title
        ),
        style = TextStyle(
          fontSize = 25.sp,
          color = Color.White
        ),
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
      )
    }
  }
}