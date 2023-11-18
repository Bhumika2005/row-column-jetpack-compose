package com.example.applicationrowandcolumns

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun SimpleColumnDemo() {
    Column(modifier = Modifier.padding(top = 5.dp)) {
        Text(text = "Hello,", fontSize = 14.sp)
        Text(text = "Good Morning", fontSize = 14.sp)
    }
}

@Composable
fun ColumnWithRowDemo() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Row A", fontSize = 16.sp, style = TextStyle(textAlign = TextAlign.Center))
        Row {
            Text(text = "Row B")
            Text(text = "Row C")
        }
    }
}

@Composable
fun VerticalArrangementDemo() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Arrangement Top", modifier = Modifier.width(100.dp))
            Text(text = "Arrangement Bottom", modifier = Modifier.width(100.dp))
            Text(text = "Arrangement Center", modifier = Modifier.width(100.dp))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Top
            ) {

                Text(
                    text = "A", modifier = Modifier
                        .background(color = Color.Magenta)
                        .padding(20.dp), fontSize = 14.sp
                )
                Text(
                    text = "B", modifier = Modifier
                        .background(color = Color.Green)
                        .padding(20.dp), fontSize = 14.sp
                )
                Text(
                    text = "C", modifier = Modifier
                        .background(color = Color.Cyan)
                        .padding(20.dp), fontSize = 14.sp
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 5.dp),
                verticalArrangement = Arrangement.Bottom
            ) {

                Text(
                    text = "A", modifier = Modifier
                        .background(color = Color.Magenta)
                        .padding(20.dp), fontSize = 14.sp
                )
                Text(
                    text = "B", modifier = Modifier
                        .background(color = Color.Green)
                        .padding(20.dp), fontSize = 14.sp
                )
                Text(
                    text = "C", modifier = Modifier
                        .background(color = Color.Cyan)
                        .padding(20.dp), fontSize = 14.sp
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 5.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "A", modifier = Modifier
                        .background(color = Color.Magenta)
                        .padding(20.dp), fontSize = 14.sp
                )
                Text(
                    text = "B", modifier = Modifier
                        .background(color = Color.Green)
                        .padding(20.dp), fontSize = 14.sp
                )
                Text(
                    text = "C", modifier = Modifier
                        .background(color = Color.Cyan)
                        .padding(20.dp), fontSize = 14.sp
                )
            }
        }
        Divider(thickness = 10.dp)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Arrangement SpaceAround", modifier = Modifier.width(100.dp))
            Text(text = "Arrangement SpaceBetween", modifier = Modifier.width(100.dp))
            Text(text = "Arrangement SpaceEvenly", modifier = Modifier.width(100.dp))
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "A", modifier = Modifier
                        .background(color = Color.Magenta)
                        .padding(20.dp), fontSize = 14.sp
                )
                Text(
                    text = "B", modifier = Modifier
                        .background(color = Color.Green)
                        .padding(20.dp), fontSize = 14.sp
                )
                Text(
                    text = "C", modifier = Modifier
                        .background(color = Color.Cyan)
                        .padding(20.dp), fontSize = 14.sp
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 5.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "A", modifier = Modifier
                        .background(color = Color.Magenta)
                        .padding(20.dp), fontSize = 14.sp
                )
                Text(
                    text = "B", modifier = Modifier
                        .background(color = Color.Green)
                        .padding(20.dp), fontSize = 14.sp
                )
                Text(
                    text = "C", modifier = Modifier
                        .background(color = Color.Cyan)
                        .padding(20.dp), fontSize = 14.sp
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(top = 5.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(
                    text = "A", modifier = Modifier
                        .background(color = Color.Magenta)
                        .padding(20.dp), fontSize = 14.sp
                )
                Text(
                    text = "B", modifier = Modifier
                        .background(color = Color.Green)
                        .padding(20.dp), fontSize = 14.sp
                )
                Text(
                    text = "C", modifier = Modifier
                        .background(color = Color.Cyan)
                        .padding(20.dp), fontSize = 14.sp
                )
            }
        }
        Divider(thickness = 10.dp)
        Column(
            modifier = Modifier
                .height(300.dp)
                .padding(top = 5.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(text = "Arrangement SpacedBy", modifier = Modifier.padding(top = 5.dp))
            Text(
                text = "A", modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "B", modifier = Modifier
                    .background(color = Color.Green)
                    .padding(20.dp), fontSize = 14.sp
            )
            Text(
                text = "C", modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(20.dp), fontSize = 14.sp
            )
        }
    }
}