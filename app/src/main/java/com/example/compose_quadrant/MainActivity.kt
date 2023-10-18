package com.example.compose_quadrant


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_quadrant.ui.theme.Compose_QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantMain()
                }
            }
        }
    }
}

@Composable
fun QuadrantMain(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        QuadrantRowUp()
        QuadrantRowDown()
    }
}

@Composable
fun QuadrantRowUp(modifier: Modifier = Modifier) {
    val colorLeft = Color(0xFFEADDFF)
    val colorRight = Color(0xFFD0BCFF)
    Row{
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxHeight(0.5f)
                .background(colorLeft)
                .padding(16.dp)
                .weight(1f)
        ) {
            Text(
                text = stringResource(R.string.text_composable),
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .padding(bottom = 16.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = stringResource(R.string.description_text_composable),
                textAlign = TextAlign.Justify,
                modifier = modifier
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxHeight(0.5f)
                .background(colorRight)
                .padding(16.dp)
                .weight(1f)
        ) {
            Text(
                text = stringResource(R.string.image_composable),
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .padding(bottom = 16.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = stringResource(R.string.description_image_composable),
                textAlign = TextAlign.Justify,
                modifier = modifier
            )
        }
    }
}

@Composable
fun QuadrantRowDown(modifier: Modifier = Modifier) {
    val colorLeft = Color(0xFFB69DF8)
    val colorRight = Color(0xFFF6EDFF)
    Row {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxHeight()
                .background(colorLeft)
                .padding(16.dp)
                .weight(1f)
        ) {
            Text(
                text = stringResource(R.string.row_composable),
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .padding(bottom = 16.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = stringResource(R.string.description_row_composable),
                textAlign = TextAlign.Justify,
                modifier = modifier
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxHeight()
                .background(colorRight)
                .padding(16.dp)
                .weight(1f)
        ) {
            Text(
                text = stringResource(R.string.column_composable),
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .padding(bottom = 16.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = stringResource(R.string.description_column_composable),
                textAlign = TextAlign.Justify,
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    Compose_QuadrantTheme {
        QuadrantMain()
    }
}