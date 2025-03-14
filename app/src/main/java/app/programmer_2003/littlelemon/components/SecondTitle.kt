package app.programmer_2003.littlelemon.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun SectionTitle(title: String) {
  Text(
    text = title,
    fontWeight = FontWeight.Bold,
    modifier = Modifier
      .padding(
        bottom = 50.dp
      )
  )
}