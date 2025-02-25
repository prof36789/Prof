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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import com.example.professional.ui.theme.iconColor
import com.example.professional.ui.theme.textColor
import com.example.professional.ui.theme.textfieldColor

class RegisterPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Hello()

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
        Column (modifier = Modifier.fillMaxSize().background(Color.White),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally){
            Image(painter = painterResource(R.drawable.img_14), contentDescription = "",)
            Spacer(modifier = Modifier.size(20.dp))
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Text("Давайте создадим",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Text("ваш профиль",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.size(15.dp))
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center){
                Text("Это поможет нам узнать о вас больше!",
                    color = textColor,
                    )
            }
            Spacer(modifier = Modifier.size(20.dp))
            Card (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).height(50.dp),
                shape = RoundedCornerShape(50),
                colors = CardDefaults.cardColors(
                    textfieldColor
                )
            ){
                Column (modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center){
                    Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                        horizontalArrangement = Arrangement.SpaceBetween){
                        Row {
                            Icon(painter = painterResource(R.drawable.img_16), contentDescription = "",
                                modifier = Modifier.size(18.dp),
                                tint = iconColor)
                            Spacer(modifier = Modifier.size(10.dp))
                            Text("Ваш пол",
                                fontSize = 12.sp,
                                color = textColor)
                        }
                        Icon(painter = painterResource(R.drawable.img_17), contentDescription = "",
                            modifier = Modifier.size(18.dp),
                            tint = iconColor)


                    }
                }

            }
            Spacer(modifier = Modifier.size(20.dp))
            Card (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).height(50.dp),
                shape = RoundedCornerShape(50),
                colors = CardDefaults.cardColors(
                    textfieldColor
                )
            ){
                Column (modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center){
                    Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                        horizontalArrangement = Arrangement.SpaceBetween){
                        Row {
                            Icon(painter = painterResource(R.drawable.img_18), contentDescription = "",
                                modifier = Modifier.size(18.dp),
                                tint = iconColor)
                            Spacer(modifier = Modifier.size(10.dp))
                            Text("Дата рождения",
                                fontSize = 12.sp,
                                color = textColor)
                        }


                    }
                }

            }
            Spacer(modifier = Modifier.size(20.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).height(50.dp).padding(end = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween){
                Card (modifier = Modifier.height(48.dp).width(252.dp),
                    shape = RoundedCornerShape(50), 
                    colors = CardDefaults.cardColors(
                        textfieldColor
                    )
                ){
                    Column (modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center){
                        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                            horizontalArrangement = Arrangement.SpaceBetween){
                            Row {
                                Icon(painter = painterResource(R.drawable.img_19), contentDescription = "",
                                    modifier = Modifier.size(18.dp),
                                    tint = iconColor)
                                Spacer(modifier = Modifier.size(10.dp))
                                Text("Ваш вес",
                                    fontSize = 12.sp,
                                    color = textColor)
                            }


                        }
                    }

                }
                Card (modifier = Modifier.size(48.dp),
                    shape = CircleShape,){
                    Box (modifier = Modifier.fillMaxSize().clip(shape = CircleShape).background(brush = gradient)){
                        Column (modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally){
                            Text("КГ",
                                color = Color.White)
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).height(50.dp).padding(end = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween){
                Card (modifier = Modifier.height(48.dp).width(252.dp),
                    shape = RoundedCornerShape(50),
                    colors = CardDefaults.cardColors(
                        textfieldColor
                    )
                ){
                    Column (modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center){
                        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                            horizontalArrangement = Arrangement.SpaceBetween){
                            Row {
                                Icon(painter = painterResource(R.drawable.img_20), contentDescription = "",
                                    modifier = Modifier.size(18.dp),
                                    tint = iconColor)
                                Spacer(modifier = Modifier.size(10.dp))
                                Text("Ваш рост",
                                    fontSize = 12.sp,
                                    color = textColor)
                            }


                        }
                    }

                }
                Card (modifier = Modifier.size(48.dp),
                    shape = CircleShape,){
                    Box (modifier = Modifier.fillMaxSize().clip(shape = CircleShape).background(brush = gradient)){
                        Column (modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally){
                            Text("СМ",
                                color = Color.White)
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.size(30.dp))
            Box(
                modifier = Modifier.fillMaxWidth()
                    .clickable {startActivity(Intent(this@RegisterPage, RegisterPage2::class.java))}.padding(horizontal = 30.dp).clip(
                        RoundedCornerShape(50)
                    ).height(60.dp).background(brush = gradient)
            ){
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center){
                    Row (){

                        Text("Далее",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.size(5.dp))
                        Icon(painter = painterResource(R.drawable.img_1),
                            contentDescription = "",
                            tint = Color.White)
                    }
                }
            }

        }

    }
}