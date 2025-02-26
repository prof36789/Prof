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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.professional.ui.theme.ProfessionalTheme
import com.example.professional.ui.theme.textColor
import com.example.professional.ui.theme.textfieldColor
//данный класс предназначен для реализации интерфейса Окна с уведомлениями,
// чтобы реализовать интерфейс мне потребовалось использоывание различных элементов, таких как Column, Box, Text, Card
//Лицуков Максим Геннадьевич
// 26.02.2025
class Notification : ComponentActivity() {
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
                        .clickable { startActivity(Intent(this@Notification, Home::class.java)) },
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
                    Text("Уведомления",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold)
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
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top){
            Spacer(modifier = Modifier.size(90.dp))
            Box (modifier = Modifier.height(40.dp).fillMaxWidth().padding(horizontal = 30.dp)){
                Row(modifier = Modifier.fillMaxWidth().padding(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Row (){
                        Column (modifier =  Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center){
                            Image(painter = painterResource(R.drawable.img_33), contentDescription = "",
                                modifier = Modifier.size(40.dp))



                        }
                        Spacer(modifier = Modifier.size(8.dp))
                        Column (modifier = Modifier.fillMaxHeight()){
                            Text("Время обеда",
                                color = Color.Black,
                                fontSize = 12.sp)
                            Spacer(modifier = Modifier.size(5.dp))
                            Text("1 мин. назад",
                                color = textColor,
                                fontSize = 10.sp)

                        }

                    }
                    Column (modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center){
                        Icon(painter = painterResource(R.drawable.img_34), contentDescription = "",
                            tint = textColor,
                            modifier = Modifier.size(14.dp))
                    }

                }

            }
            Spacer(modifier = Modifier.size(15.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp)){
                Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(textColor)){}
            }
            Spacer(modifier = Modifier.size(15.dp))
            Box (modifier = Modifier.height(40.dp).fillMaxWidth().padding(horizontal = 30.dp)){
                Row(modifier = Modifier.fillMaxWidth().padding(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Row (){
                        Column (modifier =  Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center){
                            Image(painter = painterResource(R.drawable.img_35), contentDescription = "",
                                modifier = Modifier.size(40.dp))



                        }
                        Spacer(modifier = Modifier.size(8.dp))
                        Column (modifier = Modifier.fillMaxHeight()){
                            Text("Вы пропустили тренировку",
                                color = Color.Black,
                                fontSize = 12.sp)
                            Spacer(modifier = Modifier.size(5.dp))
                            Text("3 часа назад",
                                color = textColor,
                                fontSize = 10.sp)

                        }

                    }
                    Column (modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center){
                        Icon(painter = painterResource(R.drawable.img_34), contentDescription = "",
                            tint = textColor,
                            modifier = Modifier.size(14.dp))
                    }

                }

            }
            Spacer(modifier = Modifier.size(15.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp)){
                Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(textColor)){}
            }
            Spacer(modifier = Modifier.size(15.dp))
            Box (modifier = Modifier.height(40.dp).fillMaxWidth().padding(horizontal = 30.dp)){
                Row(modifier = Modifier.fillMaxWidth().padding(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Row (){
                        Column (modifier =  Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center){
                            Image(painter = painterResource(R.drawable.img_36), contentDescription = "",
                                modifier = Modifier.size(40.dp))



                        }
                        Spacer(modifier = Modifier.size(8.dp))
                        Column (modifier = Modifier.fillMaxHeight()){
                            Text("Привет, пора завтракать",
                                color = Color.Black,
                                fontSize = 12.sp)
                            Spacer(modifier = Modifier.size(5.dp))
                            Text("4 часа назад",
                                color = textColor,
                                fontSize = 10.sp)

                        }

                    }
                    Column (modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center){
                        Icon(painter = painterResource(R.drawable.img_34), contentDescription = "",
                            tint = textColor,
                            modifier = Modifier.size(14.dp))
                    }

                }

            }
            Spacer(modifier = Modifier.size(15.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp)){
                Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(textColor)){}
            }
            Spacer(modifier = Modifier.size(15.dp))
            Box (modifier = Modifier.height(40.dp).fillMaxWidth().padding(horizontal = 30.dp)){
                Row(modifier = Modifier.fillMaxWidth().padding(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Row (){
                        Column (modifier =  Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center){
                            Image(painter = painterResource(R.drawable.img_37), contentDescription = "",
                                modifier = Modifier.size(40.dp))



                        }
                        Spacer(modifier = Modifier.size(8.dp))
                        Column (modifier = Modifier.fillMaxHeight()){
                            Text("Вы завершили тренировку",
                                color = Color.Black,
                                fontSize = 12.sp)
                            Spacer(modifier = Modifier.size(5.dp))
                            Text("29 мая",
                                color = textColor,
                                fontSize = 10.sp)

                        }

                    }
                    Column (modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center){
                        Icon(painter = painterResource(R.drawable.img_34), contentDescription = "",
                            tint = textColor,
                            modifier = Modifier.size(14.dp))
                    }

                }

            }
            Spacer(modifier = Modifier.size(15.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp)){
                Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(textColor)){}
            }
            Spacer(modifier = Modifier.size(15.dp))
            Box (modifier = Modifier.height(40.dp).fillMaxWidth().padding(horizontal = 30.dp)){
                Row(modifier = Modifier.fillMaxWidth().padding(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Row (){
                        Column (modifier =  Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center){
                            Image(painter = painterResource(R.drawable.img_38), contentDescription = "",
                                modifier = Modifier.size(40.dp))



                        }
                        Spacer(modifier = Modifier.size(8.dp))
                        Column (modifier = Modifier.fillMaxHeight()){
                            Text("Привет, пора обедать",
                                color = Color.Black,
                                fontSize = 12.sp)
                            Spacer(modifier = Modifier.size(5.dp))
                            Text("8 Апреля",
                                color = textColor,
                                fontSize = 10.sp)

                        }

                    }
                    Column (modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center){
                        Icon(painter = painterResource(R.drawable.img_34), contentDescription = "",
                            tint = textColor,
                            modifier = Modifier.size(14.dp))
                    }

                }

            }
            Spacer(modifier = Modifier.size(15.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp)){
                Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(textColor)){}
            }
            Spacer(modifier = Modifier.size(15.dp))
            Box (modifier = Modifier.height(40.dp).fillMaxWidth().padding(horizontal = 30.dp)){
                Row(modifier = Modifier.fillMaxWidth().padding(),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Row (){
                        Column (modifier =  Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center){
                            Image(painter = painterResource(R.drawable.img_39), contentDescription = "",
                                modifier = Modifier.size(40.dp))



                        }
                        Spacer(modifier = Modifier.size(8.dp))
                        Column (modifier = Modifier.fillMaxHeight()){
                            Text("Упс, вы не завершили тренировку",
                                color = Color.Black,
                                fontSize = 12.sp)
                            Spacer(modifier = Modifier.size(5.dp))
                            Text("3 Апреля",
                                color = textColor,
                                fontSize = 10.sp)

                        }

                    }
                    Column (modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center){
                        Icon(painter = painterResource(R.drawable.img_34), contentDescription = "",
                            tint = textColor,
                            modifier = Modifier.size(14.dp))
                    }

                }

            }

        }

    }
}
