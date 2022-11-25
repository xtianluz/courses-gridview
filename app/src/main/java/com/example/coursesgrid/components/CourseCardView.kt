package com.example.coursesgrid.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

@Composable
fun CourseCard(imagePainter: Painter,
               iconPainter: Painter,
               contentDescription: String,
               courseTitle: String,
               numberOfCoursesText: String){
    Row {
      Image(painter = imagePainter, contentDescription = contentDescription)
      Card(){
          Row(){
              Text(text = courseTitle)
              Column {
                  Icon(painter = iconPainter, contentDescription = null)
                  Text(text = numberOfCoursesText)
              }
          }
      }
    }
}