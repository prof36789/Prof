package com.example.professional

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.professional.ui.theme.ProfessionalTheme

class Onboarding : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val pagerState = rememberPagerState { 4 }
            val coroutineScope = rememberCoroutineScope()
            Pager1(pagerState)
            Column (modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom){

            }

        }
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun Pager1(pagerState: PagerState) {
        HorizontalPager(pagerState) {page ->
            when(page){
                0->Screen1()
                1->Screen2()
                2->Screen3()
                3->Screen4()
            }

        }

    }

    @Composable
    fun Screen1(modifier: Modifier = Modifier) {
        Column (modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            Text("Hello1")
        }

    }
    @Composable
    fun Screen2(modifier: Modifier = Modifier) {
        Column (modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            Text("Hello2")
        }

    }
    @Composable
    fun Screen3(modifier: Modifier = Modifier) {
        Column (modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            Text("Hello3")
        }

    }
    @Composable
    fun Screen4(modifier: Modifier = Modifier) {
        Column (modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            Text("Hello3")
        }

    }
}

