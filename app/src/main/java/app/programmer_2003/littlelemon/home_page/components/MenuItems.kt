package app.programmer_2003.littlelemon.home_page.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.programmer_2003.littlelemon.R

@Preview(
  showBackground = true
)
@Composable
fun MenuItems() {
  Row(
    horizontalArrangement = Arrangement.spacedBy(8.dp),
    modifier = Modifier.fillMaxWidth()
  ) {
    OutlinedCard(
      onClick = { /* Handle click */ },
      modifier = Modifier.weight(1f),
      colors = CardDefaults.outlinedCardColors(
        containerColor = Color.LightGray
      ),
    ) {
      // Column for centering the text vertically and horizontally
      Column(
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth(),
      ) {
        Text(
          stringResource(R.string.menu_item_starters),
          modifier = Modifier.padding(5.dp),
          fontSize = 16.sp,
          color = Color.DarkGray
        )
      }
    }

    OutlinedCard(
      onClick = { /* Handle click */ },
      modifier = Modifier.weight(1f),
      colors = CardDefaults.outlinedCardColors(
        containerColor = Color.LightGray
      )
    ) {
      Column(
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
      ) {
        Text(
          stringResource(R.string.menu_item_mains),
          modifier = Modifier.padding(5.dp),
          fontSize = 16.sp,
          color = Color.DarkGray
        )
      }
    }

    OutlinedCard(
      onClick = { /* Handle click */ },
      modifier = Modifier.weight(1f),
      colors = CardDefaults.outlinedCardColors(
        containerColor = Color.LightGray
      )
    ) {
      Column(
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
      ) {
        Text(
          stringResource(R.string.menu_item_desserts),
          modifier = Modifier.padding(5.dp),
          fontSize = 16.sp,
          color = Color.DarkGray
        )
      }
    }

    OutlinedCard(
      onClick = { /* Handle click */ },
      modifier = Modifier.weight(1f),
      colors = CardDefaults.outlinedCardColors(
        containerColor = Color.LightGray
      )
    ) {
      Column(
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
      ) {
        Text(
          stringResource(R.string.menu_item_drinks),
          modifier = Modifier.padding(5.dp),
          fontSize = 16.sp,
          color = Color.DarkGray
        )
      }
    }
  }
}
