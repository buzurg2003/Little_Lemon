package app.programmer_2003.littlelemon.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun BottomButton(
  buttonText: String,
  onClick: () -> Unit
) {
  Box(
    modifier = Modifier
      .fillMaxSize()
      .padding(16.dp)
  ) {
    Button(
      onClick = onClick,
      modifier = Modifier
        .align(
          Alignment.BottomCenter
        )
        .fillMaxWidth(),
      colors = ButtonDefaults.buttonColors(
        containerColor = Color.Yellow,
        contentColor = Color.Black
      ),
      shape = RoundedCornerShape(10.dp),
      border = BorderStroke(1.3.dp, Color.Red)
    ) {
      Text(
        text = buttonText,
        fontWeight = FontWeight.Bold
      )
    }
  }
}