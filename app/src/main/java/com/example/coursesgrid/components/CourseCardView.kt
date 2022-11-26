package com.example.coursesgrid.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coursesgrid.R
import com.example.coursesgrid.ui.theme.CoursesGridTheme

@Composable
fun CourseCard(imagePainter: Painter,
               iconPainter: ImageVector,
               contentDescription: String,
               courseTitle: String,
               numberOfCoursesText: String){
    Row(horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
            Image(painter = imagePainter, contentDescription = contentDescription)
                Column(Modifier.padding(start = 6.dp, end = 6.dp)) {
                    Text(text = courseTitle, fontSize = 12.sp)
                    Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.padding(top = 6.dp)) {
                        Icon(iconPainter, contentDescription = null,
                                modifier = Modifier
                                    .size(16.dp)
                            )
                        Text(text = numberOfCoursesText, fontSize = 10.sp,
                        modifier = Modifier
                            .padding(start = 6.dp)
                        )
                    }
                }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoursesGridTheme {
        CourseCard(
            imagePainter = painterResource(R.drawable.architecture),
            iconPainter = Icons.Rounded.Home,
            contentDescription = "Architecture Course",
            courseTitle = "Architecture" ,
            numberOfCoursesText = "363"
        )
    }
}