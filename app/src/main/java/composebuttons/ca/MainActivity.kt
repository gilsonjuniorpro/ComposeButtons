package composebuttons.ca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import composebuttons.ca.ui.theme.ComposeButtonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeButtonsTheme {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                    Alignment.Center
                ){
                    Column {
                        Text(text = "Compose Buttons")

                        Spacer(modifier = Modifier.height(16.dp))

                        Button(onClick = {}) {
                            Text(text = "Button Now")
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        OutlinedButton(onClick = {  }) {
                            Text(text = "Button Now")
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        TextButton(onClick = { }) {
                            Text(text = "Button learn more")
                        }

                        Spacer(modifier = Modifier.height(16.dp))

                        IconButton(onClick = { }) {
                            Icon(Icons.Default.Search, contentDescription = null)
                        }
                    }
                }
            }
        }
    }
}
