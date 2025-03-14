package app.programmer_2003.littlelemon.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InputField(
  label: String,
  textState: MutableState<String>
) {
  Text(label)
  OutlinedTextField(
    value = textState.value,
    onValueChange = {
      textState.value = it
    },
    modifier = Modifier
      .fillMaxWidth()
      .padding(
        bottom = 16.dp
      ),
    singleLine = true,
    shape = RoundedCornerShape(10.dp),
  )
}