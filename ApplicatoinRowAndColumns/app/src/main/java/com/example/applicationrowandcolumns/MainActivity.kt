package com.example.applicationrowandcolumns

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.applicationrowandcolumns.ui.theme.ApplicationRowAndColumnsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApplicationRowAndColumnsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RowAndColumnDemoList()
                }
            }
        }
    }
}

@Composable
fun RowAndColumnDemoList() {
    val rowDemoList = listOf<String>(
        "Simple Demo",
        "Horizontal Arrangement Demo",
        "Nested Row",
        "Row with Column"
    )
    val columnDemoList = listOf<String>(
        "Simple Demo",
        "Vertical Arrangement Demo",
        "Nested Column",
        "Column with Row"
    )
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        contentPadding = PaddingValues(5.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    )
    {
        item {
            Text(
                "Row Demo", modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .padding(10.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
        item {
            Text(
                text = "Simple Row Demo",
                modifier = Modifier.padding(top = 10.dp),
                fontWeight = FontWeight.Bold
            )
            SimpleRowDemo()
            Divider(thickness = 2.dp, color = Color.Black)
            HorizontalArrangementDemo()
            Divider(thickness = 2.dp, color = Color.Black)
            Text(
                text = "Row-Column Demo",
                modifier = Modifier.padding(top = 10.dp),
                fontWeight = FontWeight.Bold
            )
            RowWithColumnDemo()
        }

        item {
            Text(
                "Column Demo",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .background(Color.LightGray)
                    .padding(10.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
        item {
            Text(
                text = "Simple Column Demo",
                modifier = Modifier.padding(top = 10.dp),
                fontWeight = FontWeight.Bold
            )
            SimpleColumnDemo()
            Divider(thickness = 2.dp, color = Color.Black)
            VerticalArrangementDemo()
            Divider(thickness = 2.dp, color = Color.Black)
            Text(
                text = "Column-Row Demo",
                modifier = Modifier.padding(top = 10.dp),
                fontWeight = FontWeight.Bold
            )
            ColumnWithRowDemo()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ApplicationRowAndColumnsTheme {
        RowAndColumnDemoList()
    }
}