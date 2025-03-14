package app.programmer_2003.littlelemon.home_page.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.programmer_2003.littlelemon.R

@Preview(
  showBackground = true
)
@Composable
fun ListItems() {
  Column(
    modifier = Modifier
      .padding(
        bottom = 16.dp
      )
  ) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(top = 8.dp),
      horizontalArrangement = Arrangement.SpaceBetween,
      verticalAlignment = Alignment.Top
    ) {
      Column(
        modifier = Modifier.weight(1f)
      ) {
        Text(
          text = stringResource(R.string.greek_salad),
          style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
          )
        )
        Text(
          text = stringResource(R.string.greek_salad_description),
          modifier = Modifier.padding(top = 8.dp),
          style = TextStyle(
            fontSize = 15.sp,
            color = Color.DarkGray
          )
        )
        Text(
          text = stringResource(R.string.greek_salad_price),
          modifier = Modifier.padding(top = 8.dp),
          style = TextStyle(
            fontSize = 15.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold
          )
        )
      }
      Image(
        painter = painterResource(id = R.drawable.greek_salad),
        contentDescription = stringResource(R.string.restaurant_image),
        modifier = Modifier
          .size(120.dp)
          .align(Alignment.CenterVertically)
      )
    }

    Spacer(modifier = Modifier.height(20.dp))
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(top = 8.dp),
      horizontalArrangement = Arrangement.SpaceBetween,
      verticalAlignment = Alignment.Top
    ) {
      Column(
        modifier = Modifier.weight(1f)
      ) {
        Text(
          text = stringResource(R.string.brushetta),
          style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
          )
        )
        Text(
          text = stringResource(R.string.brushetta_description),
          modifier = Modifier.padding(top = 8.dp),
          style = TextStyle(
            fontSize = 15.sp,
            color = Color.DarkGray
          )
        )
        Text(
          text = stringResource(R.string.brushetta_price),
          modifier = Modifier.padding(top = 8.dp),
          style = TextStyle(
            fontSize = 15.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.Bold
          )
        )
      }
      Image(
        painter = painterResource(id = R.drawable.bruschetta),
        contentDescription = stringResource(R.string.restaurant_image),
        modifier = Modifier
          .size(120.dp)
          .align(Alignment.CenterVertically)
      )
    }
  }
}