package com.example.applicationrowandcolumns

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SimpleRowDemo() {
    Row(modifier = Modifier.padding(top = 5.dp)) {
        Text(text = "Hello,", fontSize = 14.sp)
        Text(text = " Good Morning", fontSize = 14.sp)
    }
}

@Composable
fun RowWithColumnDemo() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Row A", fontSize = 16.sp, style = TextStyle(textAlign = TextAlign.Center))
        Column() {
            Text(text = "Row B")
            Text(text = "Row C ")
        }
    }
}

@Composable
fun HorizontalArrangementDemo() {
    Column {
        Text(text = "Arrangement Start", modifier = Modifier.padding(top = 10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = "A", modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "B", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Green)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "C", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Cyan)
                    .padding(20.dp), fontSize = 14.sp
            )
        }
        Divider(thickness = 1.dp)

        Text(text = "Arrangement End", modifier = Modifier.padding(top = 5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = "A", modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "B", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Green)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "C", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Cyan)
                    .padding(20.dp), fontSize = 14.sp
            )

        }
        Divider(thickness = 1.dp)

        Text(text = "Arrangement Center", modifier = Modifier.padding(top = 5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "A", modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "B", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Green)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "C", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Cyan)
                    .padding(20.dp), fontSize = 14.sp
            )
        }
        Divider(thickness = 1.dp)

        Text(text = "Arrangement SpaceAround", modifier = Modifier.padding(top = 5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "A", modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "B", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Green)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "C", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Cyan)
                    .padding(20.dp), fontSize = 14.sp
            )
        }
        Divider(thickness = 1.dp)

        Text(text = "Arrangement SpaceBetween", modifier = Modifier.padding(top = 5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "A", modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "B", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Green)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "C", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Cyan)
                    .padding(20.dp), fontSize = 14.sp
            )
        }
        Divider(thickness = 1.dp)

        Text(text = "Arrangement SpaceEvenly", modifier = Modifier.padding(top = 5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "A", modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "B", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Green)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "C", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Cyan)
                    .padding(20.dp), fontSize = 14.sp
            )
        }
        Divider(thickness = 1.dp)

        Text(text = "Arrangement SpacedBy", modifier = Modifier.padding(top = 5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = "A", modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "B", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Green)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "C", modifier = Modifier
                    .padding(start = 10.dp)
                    .background(color = Color.Cyan)
                    .padding(20.dp), fontSize = 14.sp
            )
        }
    }
}