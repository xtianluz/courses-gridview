package com.example.coursesgrid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyGridScope
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.coursesgrid.components.CourseCard
import com.example.coursesgrid.data.DataSource
import com.example.coursesgrid.model.CoursesData
import com.example.coursesgrid.ui.theme.CoursesGridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesGridTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CoursesApp()
                }
            }
        }
    }
}

@Composable
fun CoursesApp(){
    Scaffold(
        content = {
            CoursesGrid(coursesList = DataSource.topics)
        }
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CoursesGrid(coursesList: List<CoursesData>){
    LazyVerticalGrid(cells = GridCells.Fixed(2), verticalArrangement = Arrangement.Center, horizontalArrangement = Arrangement.Center, content = {
        items(coursesList){
                item -> CourseCard(coursesProperties = item)
        }
    }
    )
}


