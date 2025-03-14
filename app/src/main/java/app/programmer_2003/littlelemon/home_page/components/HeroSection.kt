package app.programmer_2003.littlelemon.home_page.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.programmer_2003.littlelemon.R

@Preview(
  showBackground = true
)
@Composable
fun HeroSection() {
  ElevatedCard(
    elevation = CardDefaults.cardElevation(
      defaultElevation = 6.dp
    ),
    modifier = Modifier
      .fillMaxWidth(),
    colors = CardDefaults.elevatedCardColors()
  ) {
    Column(
      modifier = Modifier
        .padding(16.dp)
    ) {
      Text(
        text = stringResource(R.string.app_name),
        style = TextStyle(
          fontSize = 25.sp,
          color = Color.Yellow
        ),
        textAlign = TextAlign.Center,
      )
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
            text = stringResource(
              R.string.home_page_hero_section_state
            ),
            style = TextStyle(fontSize = 18.sp)
          )
          Text(
            text = stringResource(
              R.string.home_page_hero_section_description
            ),
            modifier = Modifier.padding(top = 8.dp),
            style = TextStyle(fontSize = 15.sp)
          )
        }
        Image(
          painter = painterResource(
            id = R.drawable.little_lemon
          ),
          contentDescription = stringResource(
            R.string.home_page_hero_section_image
          ),
          modifier = Modifier
            .size(120.dp)
            .align(Alignment.CenterVertically)
        )
      }
      val textState = remember { mutableStateOf("") }
      OutlinedTextField(
        value = textState.value,
        onValueChange = { textState.value = it },
        label = {
          Text(
            stringResource(
              R.string.home_page_hero_section_search_text_field
            )
          )
        },
        modifier = Modifier
          .fillMaxWidth(),
        singleLine = true,
        leadingIcon = {
          Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = stringResource(
              R.string.home_page_hero_section_search_icon
            ),
            modifier = Modifier.padding(start = 8.dp)
          )
        },
        shape = RoundedCornerShape(10.dp),
      )
    }
  }
}
