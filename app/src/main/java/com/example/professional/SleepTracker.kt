package com.example.professional

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.professional.ui.theme.textfieldColor

class SleepTracker : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Hello()
            Column (modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top){
                Spacer(modifier = Modifier.size(40.dp))
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp),
                    horizontalArrangement = Arrangement.SpaceBetween){
                    Card (modifier = Modifier
                        .size(32.dp)
                        .clickable { startActivity(Intent(this@SleepTracker, Home::class.java)) },
                        colors = CardDefaults.cardColors(textfieldColor)){
                        Column (modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center){
                            Icon(painter = painterResource(R.drawable.img_31),
                                contentDescription = "",
                                tint = Color.Black,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                    Text("Трекер сна",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontFamily = BoldFamily)
                    Card (modifier = Modifier.size(32.dp),
                        colors = CardDefaults.cardColors(textfieldColor)){
                        Column (modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center){
                            Icon(painter = painterResource(R.drawable.img_32),
                                contentDescription = "",
                                tint = Color.Black,
                                modifier = Modifier
                                    .height(4.dp)
                                    .width(10.dp)
                            )
                        }
                    }
                }

            }

        }
    }
    @Preview(showBackground = true)
    @Composable
    fun Hello(modifier: Modifier = Modifier) {
        val gradient = Brush.linearGradient(
            colors = listOf(
                grad2,
                grad1
            )
        )
        val gradient2 = Brush.linearGradient(
            colors = listOf(
                butEnd,
                butStart
            )
        )
        Column (modifier = Modifier.fillMaxSize().background(color = Color.White),
            verticalArrangement = Arrangement.Top){

            Row (modifier = Modifier.fillMaxWidth().padding(top = 120.dp),
                horizontalArrangement = Arrangement.Center){
                Image(painter = painterResource(R.drawable.img_62), contentDescription = "",
                    modifier = Modifier.height(172.dp).width(319.dp)
                    )
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
                Card (colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(5.dp),
                    modifier = Modifier.height(35.dp).width(116.dp)){
                    Column (modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center){
                        Text("Увеличено на 43% ",
                            fontSize = 10.sp,
                            fontFamily = NormalFamily,
                            color = textColor2)
                    }
                }


            }
            Spacer(modifier = Modifier.size(20.dp))
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Box (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).height(148.dp).clip(
                    RoundedCornerShape(20)
                ).background(brush = gradient)){
                    Column (modifier = Modifier.fillMaxSize()){
                        Spacer(modifier = Modifier.size(30.dp))
                        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                            horizontalArrangement = Arrangement.Start){
                            Column {
                                Text("Последний сон",
                                    fontSize = 14.sp,
                                    color = Color.White,
                                    fontFamily = MediumFamily)
                                Text("8ч 20м",
                                    fontSize = 16.sp,
                                    color = Color.White,
                                    fontFamily = MediumFamily)

                            }

                        }
                        Row (modifier = Modifier.fillMaxWidth()){
                            Image(painter = painterResource(R.drawable.img_63),
                                contentDescription = "",
                                modifier = Modifier.fillMaxWidth().height(65.dp))
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.size(20.dp))
            Box(modifier = Modifier.fillMaxWidth().height(57.dp).padding(horizontal = 30.dp).clip(RoundedCornerShape(50)).background(
                grad2)){
                Column (modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center){
                    Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween){
                        Column (Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center){Text("Трафик сна",
                            fontSize = 14.sp,
                            color = Color.Black,
                                fontFamily = MediumFamily)  }
                        Column (modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center){
                            Box(modifier = Modifier.height(28.dp).width(96.dp).clip(RoundedCornerShape(50)).background(brush = gradient2)){
                                Column (modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center){
                                    Text("Проверить",
                                        color = Color.White,
                                        fontSize = 11.sp,
                                        fontFamily = NormalFamily)
                                }
                            }
                        }


                    }
                }
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.Start){
                Text("Расписание на сегодня",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontFamily = SemiBoldFamily)
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.Center){

                Card (modifier = Modifier.fillMaxWidth().height(93.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(2.dp),
                    shape = RoundedCornerShape(20.dp)
                ){
                    Column (modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center){
                        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp)){
                            Column (modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.Center){
                                Image(painter = painterResource(R.drawable.img_64),
                                    contentDescription = "",
                                    modifier = Modifier.size(30.dp))
                            }
                            Column (modifier = Modifier.fillMaxHeight().padding(vertical = 20.dp)){
                                Row (){
                                    Text("Сон,",
                                        color = Color.Black,
                                        fontSize = 14.sp,
                                        )
                                    Text("21:00",
                                        color = textColor,
                                        fontSize = 12.sp,
                                        fontFamily = NormalFamily
                                    )

                                }
                            }
                        }
                    }


                }
            }


        }
        
    }
}
