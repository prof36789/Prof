package com.example.professional

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.professional.ui.theme.ProfessionalTheme

class Home : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val pagerState = rememberPagerState { 3 }
            val coroutineScope = rememberCoroutineScope()
            Column (modifier = Modifier.fillMaxSize()){  }

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


}