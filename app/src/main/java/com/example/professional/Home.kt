package com.example.professional

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.professional.ui.theme.ProfessionalTheme
import com.example.professional.ui.theme.butEnd
import com.example.professional.ui.theme.butStart
import com.example.professional.ui.theme.grad1
import com.example.professional.ui.theme.grad2
import com.example.professional.ui.theme.textColor
import com.example.professional.ui.theme.textColor2
import kotlinx.coroutines.launch
//данный класс предназанчен для реализации навигации по окнам,
//чтобы реализовать навигацию по окнам я использовал конструкцию Horizontal Pager,
// что бы ее применить мне пришлось создать переменную pagerState и присвоить количество экранов в качесстве состояния,
// так же мне понадобилось создать перменную coroutineScope для реализации перехода по окнам с помощью Иконок
// Лицуков Максим Геннадьевич
//26.02.2025
class Home : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val gradd = Brush.linearGradient(
                colors = listOf(
                    butStart,
                    butEnd
                )
            )
            val pagerState = rememberPagerState { 4 }
            val coroutineScope = rememberCoroutineScope()
            Pager1(pagerState)
            Column (modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom){
                Row (modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center){
                    Box(modifier = Modifier.size(60.dp).clip(shape = CircleShape).background(brush = gradd)){
                        Column (modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally){
                            Icon(painter = painterResource(R.drawable.img_30), contentDescription = "",
                                modifier = Modifier.size(20.dp),
                                tint = Color.White)

                        }
                    }
                }


                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(Color.White)){
                    Column (modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center){
                        Row (modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween){
                            Icon(painter = painterResource(R.drawable.img_21), contentDescription = "",
                                modifier = Modifier.size(24.dp).clickable {
                                    coroutineScope.launch {
                                        when(pagerState.currentPage){
                                            0->pagerState.animateScrollToPage(0)
                                            1->pagerState.animateScrollToPage(0)
                                            2->pagerState.animateScrollToPage(0)
                                            3->pagerState.animateScrollToPage(0)
                                        }
                                    }
                                },
                                tint = if (pagerState.currentPage == 0) butEnd else textColor)
                            Icon(painter = painterResource(R.drawable.img_22), contentDescription = "",
                                modifier = Modifier.size(24.dp).clickable {
                                    coroutineScope.launch {
                                        when(pagerState.currentPage){
                                            0->pagerState.animateScrollToPage(1)
                                            1->pagerState.animateScrollToPage(1)
                                            2->pagerState.animateScrollToPage(1)
                                            3->pagerState.animateScrollToPage(1)
                                        }
                                    }
                                },
                                tint = if (pagerState.currentPage == 1) butEnd else textColor)
                            Icon(painter = painterResource(R.drawable.img_23), contentDescription = "",
                                modifier = Modifier.size(24.dp).clickable {
                                    coroutineScope.launch {
                                        when(pagerState.currentPage){
                                            0->pagerState.animateScrollToPage(2)
                                            1->pagerState.animateScrollToPage(2)
                                            2->pagerState.animateScrollToPage(2)
                                            3->pagerState.animateScrollToPage(2)
                                        }
                                    }
                                },
                                tint = if (pagerState.currentPage == 2) butEnd else textColor)
                            Icon(painter = painterResource(R.drawable.img_24), contentDescription = "",
                                modifier = Modifier.size(24.dp).clickable {
                                    coroutineScope.launch {
                                        when(pagerState.currentPage){
                                            0->pagerState.animateScrollToPage(3)
                                            1->pagerState.animateScrollToPage(3)
                                            2->pagerState.animateScrollToPage(3)
                                            3->pagerState.animateScrollToPage(3)
                                        }
                                    }

                                },
                                tint = if (pagerState.currentPage == 3) butEnd else textColor)



                        }
                    }
                }

            }

        }
    }
    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun Pager1(pagerState: PagerState) {
        HorizontalPager(pagerState) {page ->
            when(page){
                0->Page1()
                1->Page2()
                2->Page3()
                3->Page4()
            }

        }

    }
    @Preview(showBackground = true)
    @Composable
    fun Page1(modifier: Modifier = Modifier) {
        val gradient = Brush.linearGradient(
            colors = listOf(
                butStart,
                butEnd
            )
        )
        val gradient2 = Brush.linearGradient(
            colors = listOf(
                Color.LightGray,
                grad2

            )
        )
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top){
            Spacer(modifier = Modifier.size(40.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.Start){
                Text("Добро пожаловать,",
                    color = textColor,
                    fontSize = 12.sp,
                    )
            }
            Spacer(modifier = Modifier.size(15.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.SpaceBetween){
                Text("Юрий",
                    color = Color.Black,
                    fontSize = 20.sp,
                )
                Image(painter = painterResource(R.drawable.img_25), contentDescription = "", 
                    modifier = Modifier.height(21.dp).width(18.dp).clickable {
                        startActivity(Intent(this@Home, Notification::class.java))
                    })

            }
            Spacer(modifier = Modifier.size(30.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.Center){
                Box(modifier = Modifier.height(146.dp).fillMaxWidth().clip(RoundedCornerShape(20)).background(brush = gradient)
                ){
                    Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween){
                        Column (modifier = Modifier.fillMaxHeight().padding(vertical = 20.dp)){
                            Text("ИМТ (индекс массы тела)",
                                fontSize = 13.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Bold)
                            Spacer(Modifier.size(10.dp))
                            Text("У тебя нормальный вес",
                                fontSize = 12.sp,
                                color = Color.White,)
                            Spacer(modifier = Modifier.size(20.dp))
                            Box(modifier = Modifier.height(35.dp).width(95.dp).clip(
                                RoundedCornerShape(20.dp)
                            ).background(brush = gradient)){
                                Column (modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center){
                                    Text("Больше",
                                        color = Color.White, 
                                        fontSize = 10.sp)
                                }
                            }

                        }
                        Column (modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center){
                            Image(painter = painterResource(R.drawable.img_27),
                                contentDescription = "",
                            )

                        }
                    }
                }

            }
            Spacer(modifier = Modifier.size(30.dp))
            Box(modifier = Modifier.fillMaxWidth().height(57.dp).padding(horizontal = 30.dp).clip(RoundedCornerShape(50)).background(brush = gradient2)){
                Column (modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center){
                    Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween){
                        Column (Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center){Text("Сегодняшняя цель",
                            fontSize = 14.sp,
                            color = Color.Black)  }
                        Column (modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center){
                            Box(modifier = Modifier.height(28.dp).width(96.dp).clip(RoundedCornerShape(50)).background(
                                textColor2)){
                                Column (modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center){
                                    Text("Проверить",
                                        color = Color.White,
                                        fontSize = 11.sp)
                                }
                            }
                        }


                    }
                }
            }
            Spacer(modifier = Modifier.size(30.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp)){
                Text("Статус активности",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp)){
                Box (modifier = Modifier.fillMaxWidth().height(176.dp).clip(RoundedCornerShape(15)).background(gradient2)){
                    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween){
                        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp).padding(top = 20.dp)){
                            Text("Частота сердечных сокращений",
                                fontSize = 12.sp, 
                                color = Color.Black)
                        }
                        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                            horizontalArrangement = Arrangement.Center){
                            Image(painter = painterResource(R.drawable.img_29), contentDescription = "",
                                modifier = Modifier.fillMaxWidth().height(81.dp))
                        }
                        Row (modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center){
                            Text("78 BPM",
                                color = butEnd,
                                modifier = Modifier.padding(bottom = 10.dp))
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Button(onClick = {
                    startActivity(Intent(this@Home, SleepTracker::class.java))
                }) {
                    Text("SleepTracker")
                }
            }



        }

    }
    @Preview(showBackground = true)
    @Composable
    fun Page2(modifier: Modifier = Modifier) {
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text("Warkout Details - нажми на текст ",
                fontSize = 50.sp,
                color = Color.Black,
                modifier = Modifier.clickable { startActivity(Intent(this@Home, WorkoutDeteails1::class.java)) })
        }

    }
    @Composable
    fun Page3(modifier: Modifier = Modifier) {
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text("Hello3")
        }

    }
    @Composable
    fun Page4(modifier: Modifier = Modifier) {
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text("Hello4")
        }

    }



}