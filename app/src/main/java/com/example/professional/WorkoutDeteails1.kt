package com.example.professional

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
import androidx.core.content.ContextCompat.startActivity
import com.example.professional.ui.theme.ProfessionalTheme
import com.example.professional.ui.theme.butEnd
import com.example.professional.ui.theme.butStart
import com.example.professional.ui.theme.grad1
import com.example.professional.ui.theme.session4
import com.example.professional.ui.theme.textColor
import com.example.professional.ui.theme.textfieldColor

class WorkoutDeteails1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val gradient = Brush.linearGradient(
                colors = listOf(
                    butEnd,
                    butStart
                )
            )
            Hello()
            Column ((Modifier.fillMaxSize()),
                verticalArrangement = Arrangement.Bottom){
                Box(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.5f).clip(
                    RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp)
                ).background(Color.White)){
                    Column (modifier = Modifier.padding(5.dp).padding(bottom = 20.dp).fillMaxSize().verticalScroll(
                        rememberScrollState()
                    )){
                        Row (modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center){
                            Box (modifier = Modifier.height(5.dp).width(50.dp).clip(
                                RoundedCornerShape(50)
                            ).background(textColor)){  }
                        }



                        Spacer(modifier = Modifier.size(10.dp))
                        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 25.dp).padding(top = 10.dp),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Column (){
                                Text("Все тело",
                                    color = Color.Black,
                                    fontSize = 16.sp)
                                Text("11 упражнений | 32 мин. | 320 Калорий",
                                    color = textColor,
                                    fontSize = 12.sp)
                            }
                            Card (colors = CardDefaults.cardColors(
                                Color.White,
                            ),
                                elevation = CardDefaults.cardElevation(10.dp),
                                modifier = Modifier.size(32.dp)){
                                Column (modifier = Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally){
                                    Image(painter = painterResource(R.drawable.img_43), contentDescription = "",
                                        modifier = Modifier.size(16.dp))
                                }

                            }
                        }

                        Spacer(modifier = Modifier.size(20.dp))
                        Row (modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center){
                           Box (modifier = Modifier.fillMaxWidth().height(50.dp).padding(horizontal = 25.dp).clip(
                               RoundedCornerShape(30)
                           ).background(session4)){
                               Column (modifier = Modifier.fillMaxSize(),
                                   verticalArrangement = Arrangement.Center){
                                   Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                                       horizontalArrangement = Arrangement.SpaceBetween){
                                       Image(painter = painterResource(R.drawable.img_44), contentDescription = "",
                                           modifier = Modifier.size(22.dp))
                                       Text("Время тренировки",
                                           fontSize = 12.sp,
                                           color = grad1)
                                       Text("27 мая, 09:00",
                                           color = grad1,
                                           fontSize = 10.sp,
                                           )
                                       Icon(painter = painterResource(R.drawable.img_1), contentDescription = "",
                                           tint = grad1)

                                   }
                               }

                           }
                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Row (modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center){
                            Box (modifier = Modifier.fillMaxWidth().height(50.dp).padding(horizontal = 25.dp).clip(
                                RoundedCornerShape(30)
                            ).background(session4)){
                                Column (modifier = Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center){
                                    Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                                        horizontalArrangement = Arrangement.SpaceBetween){
                                        Image(painter = painterResource(R.drawable.img_45), contentDescription = "",
                                            modifier = Modifier.size(22.dp))
                                        Text("Сложность",
                                            fontSize = 12.sp,
                                            color = grad1)
                                        Text("Начинающий",
                                            color = grad1,
                                            fontSize = 10.sp,
                                        )
                                        Icon(painter = painterResource(R.drawable.img_1), contentDescription = "",
                                            tint = grad1)

                                    }
                                }

                            }
                        }
                        Spacer(modifier = Modifier.size(30.dp))
                        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 25.dp),
                            horizontalArrangement = Arrangement.SpaceBetween){
                            Text("Вам понадобится",
                                color = Color.Black,
                                fontSize = 16.sp,
                                )
                            Text("5 предметов",
                                color = textColor,
                                fontSize = 12.sp,
                            )
                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Row (modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()).padding(start = 30.dp),
                            horizontalArrangement = Arrangement.SpaceBetween){
                            Column (){
                                Card (modifier = Modifier.size(130.dp),
                                    colors = CardDefaults.cardColors(textfieldColor)){
                                    Column (modifier = Modifier.fillMaxSize(),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center){
                                        Image(painter = painterResource(R.drawable.img_46),
                                            contentDescription = "",
                                            modifier = Modifier.height(53.dp).width(63.dp))
                                    }
                                }
                                Spacer(modifier = Modifier.size(10.dp))
                                Text("Гантели",
                                    fontSize = 12.sp,
                                    color = Color.Black)

                            }
                            Spacer(modifier = Modifier.size(10.dp))
                            Column (){
                                Card (modifier = Modifier.size(130.dp),
                                    colors = CardDefaults.cardColors(textfieldColor)){
                                    Column (modifier = Modifier.fillMaxSize(),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center){
                                        Image(painter = painterResource(R.drawable.img_47),
                                            contentDescription = "",
                                            modifier = Modifier.height(77.dp).width(60.dp))
                                    }
                                }
                                Spacer(modifier = Modifier.size(10.dp))
                                Text("Скакалка",
                                    fontSize = 12.sp,
                                    color = Color.Black)

                            }
                            Spacer(modifier = Modifier.size(10.dp))
                            Column (){
                                Card (modifier = Modifier.size(130.dp),
                                    colors = CardDefaults.cardColors(textfieldColor)){
                                    Column (modifier = Modifier.fillMaxSize(),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center){
                                        Image(painter = painterResource(R.drawable.img_48),
                                            contentDescription = "",
                                            modifier = Modifier.height(53.dp).width(63.dp))
                                    }
                                }
                                Spacer(modifier = Modifier.size(10.dp))
                                Text("Бутылка воды",
                                    fontSize = 12.sp,
                                    color = Color.Black)

                            }
                        }
                        Spacer(modifier = Modifier.size(30.dp))
                        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 25.dp),
                            horizontalArrangement = Arrangement.SpaceBetween){
                            Text("Упражнения",
                                color = Color.Black,
                                fontSize = 16.sp,
                            )
                            Text("3 подхода",
                                color = textColor,
                                fontSize = 12.sp,
                            )
                        }
                        Spacer(modifier = Modifier.size(30.dp))
                        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 25.dp),
                            horizontalArrangement = Arrangement.Start){
                            Text("Подход 1",
                                color = Color.Black,
                                fontSize = 16.sp,
                            )

                        }
                        Spacer(modifier = Modifier.size(15.dp))
                        Box (modifier = Modifier.height(60.dp).fillMaxWidth().padding(horizontal = 25.dp)){
                            Row(modifier = Modifier.fillMaxWidth().padding(),
                                horizontalArrangement = Arrangement.SpaceBetween) {
                                Row (){
                                    Column (modifier =  Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Image(painter = painterResource(R.drawable.img_49), contentDescription = "",
                                            modifier = Modifier.size(60.dp))



                                    }
                                    Spacer(modifier = Modifier.size(8.dp))
                                    Column (modifier = Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Text("Бег",
                                            color = Color.Black,
                                            fontSize = 14.sp)
                                        Spacer(modifier = Modifier.size(5.dp))
                                        Text("05:00",
                                            color = textColor,
                                            fontSize = 12.sp)

                                    }

                                }
                                Column (modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center){
                                    Icon(painter = painterResource(R.drawable.img_50), contentDescription = "",
                                        tint = textColor,
                                        modifier = Modifier.size(24.dp))
                                }

                            }

                        }
                        Spacer(modifier = Modifier.size(15.dp))
                        Box (modifier = Modifier.height(60.dp).fillMaxWidth().padding(horizontal = 25.dp)){
                            Row(modifier = Modifier.fillMaxWidth().padding(),
                                horizontalArrangement = Arrangement.SpaceBetween) {
                                Row (){
                                    Column (modifier =  Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Image(painter = painterResource(R.drawable.img_51), contentDescription = "",
                                            modifier = Modifier.size(60.dp))



                                    }
                                    Spacer(modifier = Modifier.size(8.dp))
                                    Column (modifier = Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Text("Прыжки",
                                            color = Color.Black,
                                            fontSize = 14.sp)
                                        Spacer(modifier = Modifier.size(5.dp))
                                        Text("12x",
                                            color = textColor,
                                            fontSize = 12.sp)

                                    }

                                }
                                Column (modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center){
                                    Icon(painter = painterResource(R.drawable.img_50), contentDescription = "",
                                        tint = textColor,
                                        modifier = Modifier.size(24.dp))
                                }

                            }

                        }
                        Spacer(modifier = Modifier.size(15.dp))
                        Box (modifier = Modifier.height(60.dp).fillMaxWidth().padding(horizontal = 25.dp).clickable {
                            startActivity(Intent(this@WorkoutDeteails1, WorkoutDetails2::class.java))
                        }){
                            Row(modifier = Modifier.fillMaxWidth().padding(),
                                horizontalArrangement = Arrangement.SpaceBetween) {
                                Row (){
                                    Column (modifier =  Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Image(painter = painterResource(R.drawable.img_52), contentDescription = "",
                                            modifier = Modifier.size(60.dp))



                                    }
                                    Spacer(modifier = Modifier.size(8.dp))
                                    Column (modifier = Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Text("Скакалка",
                                            color = Color.Black,
                                            fontSize = 14.sp)
                                        Spacer(modifier = Modifier.size(5.dp))
                                        Text("15x",
                                            color = textColor,
                                            fontSize = 12.sp)

                                    }

                                }
                                Column (modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center){
                                    Icon(painter = painterResource(R.drawable.img_50), contentDescription = "",
                                        tint = textColor,
                                        modifier = Modifier.size(24.dp))
                                }

                            }


                        }
                        Spacer(modifier = Modifier.size(15.dp))
                        Box (modifier = Modifier.height(60.dp).fillMaxWidth().padding(horizontal = 25.dp)){
                            Row(modifier = Modifier.fillMaxWidth().padding(),
                                horizontalArrangement = Arrangement.SpaceBetween) {
                                Row (){
                                    Column (modifier =  Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Image(painter = painterResource(R.drawable.img_53), contentDescription = "",
                                            modifier = Modifier.size(60.dp))



                                    }
                                    Spacer(modifier = Modifier.size(8.dp))
                                    Column (modifier = Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Text("Приседания",
                                            color = Color.Black,
                                            fontSize = 14.sp)
                                        Spacer(modifier = Modifier.size(5.dp))
                                        Text("20x",
                                            color = textColor,
                                            fontSize = 12.sp)

                                    }

                                }
                                Column (modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center){
                                    Icon(painter = painterResource(R.drawable.img_50), contentDescription = "",
                                        tint = textColor,
                                        modifier = Modifier.size(24.dp))
                                }

                            }



                        }
                        Spacer(modifier = Modifier.size(15.dp))
                        Box (modifier = Modifier.height(60.dp).fillMaxWidth().padding(horizontal = 25.dp)){
                            Row(modifier = Modifier.fillMaxWidth().padding(),
                                horizontalArrangement = Arrangement.SpaceBetween) {
                                Row (){
                                    Column (modifier =  Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Image(painter = painterResource(R.drawable.img_54), contentDescription = "",
                                            modifier = Modifier.size(60.dp))



                                    }
                                    Spacer(modifier = Modifier.size(8.dp))
                                    Column (modifier = Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Text("Подъемы рук",
                                            color = Color.Black,
                                            fontSize = 14.sp)
                                        Spacer(modifier = Modifier.size(5.dp))
                                        Text("00:53",
                                            color = textColor,
                                            fontSize = 12.sp)

                                    }

                                }
                                Column (modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center){
                                    Icon(painter = painterResource(R.drawable.img_50), contentDescription = "",
                                        tint = textColor,
                                        modifier = Modifier.size(24.dp))
                                }

                            }



                        }
                        Spacer(modifier = Modifier.size(15.dp))
                        Box (modifier = Modifier.height(60.dp).fillMaxWidth().padding(horizontal = 25.dp)){
                            Row(modifier = Modifier.fillMaxWidth().padding(),
                                horizontalArrangement = Arrangement.SpaceBetween) {
                                Row (){
                                    Column (modifier =  Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Image(painter = painterResource(R.drawable.img_55), contentDescription = "",
                                            modifier = Modifier.size(60.dp))



                                    }
                                    Spacer(modifier = Modifier.size(8.dp))
                                    Column (modifier = Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Text("Отдых и напитки",
                                            color = Color.Black,
                                            fontSize = 14.sp)
                                        Spacer(modifier = Modifier.size(5.dp))
                                        Text("02:00",
                                            color = textColor,
                                            fontSize = 12.sp)

                                    }

                                }
                                Column (modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center){
                                    Icon(painter = painterResource(R.drawable.img_50), contentDescription = "",
                                        tint = textColor,
                                        modifier = Modifier.size(24.dp))
                                }

                            }



                        }

                        Spacer(modifier = Modifier.size(20.dp))
                        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 25.dp),
                            horizontalArrangement = Arrangement.Start){
                            Text("Подход 2",
                                color = Color.Black,
                                fontSize = 16.sp,
                            )

                        }
                        Spacer(modifier = Modifier.size(15.dp))
                        Box (modifier = Modifier.height(60.dp).fillMaxWidth().padding(horizontal = 25.dp)){
                            Row(modifier = Modifier.fillMaxWidth().padding(),
                                horizontalArrangement = Arrangement.SpaceBetween) {
                                Row (){
                                    Column (modifier =  Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Image(painter = painterResource(R.drawable.img_56), contentDescription = "",
                                            modifier = Modifier.size(60.dp))



                                    }
                                    Spacer(modifier = Modifier.size(8.dp))
                                    Column (modifier = Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Text("Отжимания на наклоне",
                                            color = Color.Black,
                                            fontSize = 14.sp)
                                        Spacer(modifier = Modifier.size(5.dp))
                                        Text("12x",
                                            color = textColor,
                                            fontSize = 12.sp)

                                    }

                                }
                                Column (modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center){
                                    Icon(painter = painterResource(R.drawable.img_50), contentDescription = "",
                                        tint = textColor,
                                        modifier = Modifier.size(24.dp))
                                }

                            }



                        }
                        Spacer(modifier = Modifier.size(15.dp))
                        Box (modifier = Modifier.height(60.dp).fillMaxWidth().padding(horizontal = 25.dp)){
                            Row(modifier = Modifier.fillMaxWidth().padding(),
                                horizontalArrangement = Arrangement.SpaceBetween) {
                                Row (){
                                    Column (modifier =  Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Image(painter = painterResource(R.drawable.img_57), contentDescription = "",
                                            modifier = Modifier.size(60.dp))



                                    }
                                    Spacer(modifier = Modifier.size(8.dp))
                                    Column (modifier = Modifier.fillMaxHeight(),
                                        verticalArrangement = Arrangement.Center){
                                        Text("Отжимания",
                                            color = Color.Black,
                                            fontSize = 14.sp)
                                        Spacer(modifier = Modifier.size(5.dp))
                                        Text("15x",
                                            color = textColor,
                                            fontSize = 12.sp)

                                    }

                                }
                                Column (modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center){
                                    Icon(painter = painterResource(R.drawable.img_50), contentDescription = "",
                                        tint = textColor,
                                        modifier = Modifier.size(24.dp))
                                }

                            }



                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Box(
                            modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).clip(
                                    RoundedCornerShape(50)
                                ).height(60.dp).background(brush = gradient)
                        ){
                            Column (modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center){
                                    Text("Начать",
                                        color = Color.White,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold)

                            }
                        }







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
            butStart,
            butEnd
        )
    )
    Column (modifier = Modifier.fillMaxSize().background(brush = gradient),
        verticalArrangement = Arrangement.Top){
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp).padding(top = 40.dp),
            horizontalArrangement = Arrangement.SpaceBetween){
            Card (modifier = Modifier
                .size(32.dp)
                .clickable {},
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
        Row (modifier = Modifier.fillMaxWidth().padding(top = 50.dp),
            horizontalArrangement = Arrangement.Center){
            Image(painter = painterResource(R.drawable.img_42), contentDescription = "",
                modifier = Modifier.fillMaxWidth().height(415.dp))
        }


    }

}