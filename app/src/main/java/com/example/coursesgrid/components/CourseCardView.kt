package com.example.coursesgrid.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coursesgrid.R
import com.example.coursesgrid.model.CoursesData
import com.example.coursesgrid.ui.theme.CoursesGridTheme

@Composable
fun CourseCard(coursesProperties:CoursesData
               ){
    Card(modifier = Modifier.padding(8.dp), elevation = 6.dp) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(coursesProperties.imageResourceId),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .height(68.dp)
                    .width(68.dp)
            )
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(text = stringResource(coursesProperties.courseTitle), fontSize = 12.sp)
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        Icons.Filled.Home, contentDescription = null,
                        modifier = Modifier
                            .size(18.dp)
                            .padding(top = 8.dp)
                    )
                    Text(
                        text = coursesProperties.courseCount.toString(), fontSize = 10.sp,
                        modifier = Modifier
                            .padding(start = 8.dp, top = 8.dp)
                    )
                }
            }
        }
    }
}
