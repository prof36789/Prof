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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.professional.ui.theme.Max1
import com.example.professional.ui.theme.Max2
import com.example.professional.ui.theme.ProfessionalTheme
import com.example.professional.ui.theme.butEnd
import com.example.professional.ui.theme.butStart
import kotlinx.coroutines.launch
// класс предназаначен для скролинга фрагментов на начальносм экране, для реализации перелистывания экранов я использовал конструкцию HorisontalPager,
// создал переменную pagerState, которой присвоил состояние: rememberPagerState,
//переменная coroutineScope обеспечивает Скролл экранов при нажатии на кнопку
// Автор Лицуков Максим Геннадьевич
//25.02.2025
class Onboarding : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val gradient = Brush.linearGradient(
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
                Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).padding(bottom = 40.dp),
                    horizontalArrangement = Arrangement.End){
                    Card (modifier = Modifier.size(60.dp).clickable {
                        coroutineScope.launch {
                            when(pagerState.currentPage){
                                0->pagerState.animateScrollToPage(1)
                                1->pagerState.animateScrollToPage(2)
                                2->pagerState.animateScrollToPage(3)
                                3-> startActivity(Intent(this@Onboarding, LogIn::class.java))
                            }
                        }
                    },
                        shape = CircleShape,
                        ){
                        Box (modifier = Modifier.fillMaxSize().clip(shape = CircleShape).background(brush = gradient)){
                            Column (modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center){
                                Icon(painter = painterResource(R.drawable.img_1), contentDescription = "",
                                    tint = Color.White,
                                    modifier = Modifier.size(18.dp))
                            }
                        }


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
                0->Screen1()
                1->Screen2()
                2->Screen3()
                3->Screen4()
            }

        }

    }
    @Preview(showBackground = true)
    @Composable
    fun Screen1(modifier: Modifier = Modifier) {
        Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top){
            Image(painter = painterResource(R.drawable.img_2), contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.size(30.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.Start){
                Text("Отслеживайте свою цель",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.size(20.dp))
            Column (){
                Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    horizontalArrangement = Arrangement.Start){
                    Text("Не волнуйтесь, если у вас возникли проблемы с определением ваших целей." +
                            " Мы можем помочь вам определить ваши цели и отслеживать их.",
                        color = Max2,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Start)
                }
            }



        }

    }
    @Preview(showBackground = true)
    @Composable
    fun Screen2(modifier: Modifier = Modifier) {
        Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top){
            Image(painter = painterResource(R.drawable.img_3), contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.size(50.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.Start){
                Text("Сжигай лишнее",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.size(20.dp))
            Column (){
                Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    horizontalArrangement = Arrangement.Start){
                    Text("Давайте продолжать заниматься, чтобы достичь своих целей, это больно только временно," +
                            " если ты сдашься сейчас, тебе будет больно навсегда.",
                        color = Max2,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Start)
                }
            }



        }
    }
    @Preview(showBackground = true)
    @Composable
    fun Screen3(modifier: Modifier = Modifier) {
        Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top){
            Image(painter = painterResource(R.drawable.img_4), contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.size(30.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.Start){
                Text("Питайся правильно",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.size(20.dp))
            Column (){
                Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    horizontalArrangement = Arrangement.Start){
                    Text("Давайте начнем здоровый образ жизни вместе с нами, " +
                            "мы сможем определять ваш рацион каждый день. Здоровое питание - это весело",
                        color = Max2,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Start)
                }
            }



        }

    }
    @Preview(showBackground = true)
    @Composable
    fun Screen4(modifier: Modifier = Modifier) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top) {
            Image(
                painter = painterResource(R.drawable.img_5), contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.size(50.dp))
            Column() {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        "Улучшите",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        "качество сна",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
            }

            Spacer(modifier = Modifier.size(20.dp))
            Column() {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        "Улучшайте качество своего сна вместе с нами, качественный сон может принести хорошее настроение с утра.",
                        color = Max2,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Start
                    )
                }
            }


        }
    }

