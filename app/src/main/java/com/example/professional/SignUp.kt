package com.example.professional

import android.content.Intent
import android.os.Bundle
import android.text.style.UnderlineSpan
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.professional.ui.theme.Max4
import com.example.professional.ui.theme.ProfessionalTheme
import com.example.professional.ui.theme.butEnd
import com.example.professional.ui.theme.butStart
import com.example.professional.ui.theme.iconColor
import com.example.professional.ui.theme.textColor
import com.example.professional.ui.theme.textColor2
import com.example.professional.ui.theme.textfieldColor

class SignUp : ComponentActivity() {
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
        var email by remember { mutableStateOf(TextFieldValue(""))}
        var password by remember { mutableStateOf(TextFieldValue(""))}
        var fio by remember { mutableStateOf(TextFieldValue(""))}
        var phone by remember { mutableStateOf(TextFieldValue(""))}
        Column (modifier = Modifier.fillMaxSize().background(Color.White),
            verticalArrangement = Arrangement.SpaceBetween){
            Column() {
                Row (modifier = Modifier.fillMaxWidth().padding(top = 40.dp),
                    horizontalArrangement = Arrangement.Center){
                    Text("Привет,",
                        color = Max4,
                        fontSize = 16.sp)
                }
                Spacer(modifier = Modifier.size(10.dp))
                Row (modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center){
                    Text("Добро пожаловать",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.size(20.dp))
                OutlinedTextField(value = fio, onValueChange = {fio = it},
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = textfieldColor,
                        unfocusedContainerColor = textfieldColor,
                        focusedContainerColor = textfieldColor,
                        focusedBorderColor = textfieldColor

                    ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    shape = RoundedCornerShape(50),
                    leadingIcon = {
                        Icon(painter = painterResource(R.drawable.img_11), contentDescription = "",
                            modifier = Modifier.size(18.dp),
                            tint = iconColor)
                    },
                    placeholder = {
                        Text("ФИО",
                            color = textColor,
                            fontSize = 12.sp)
                    }
                )
                Spacer(modifier = Modifier.size(20.dp))
                OutlinedTextField(value = phone, onValueChange = {phone = it},
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = textfieldColor,
                        unfocusedContainerColor = textfieldColor,
                        focusedContainerColor = textfieldColor,
                        focusedBorderColor = textfieldColor

                    ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    shape = RoundedCornerShape(50),
                    leadingIcon = {
                        Icon(painter = painterResource(R.drawable.img_13), contentDescription = "",
                            modifier = Modifier.size(18.dp),
                            tint = iconColor)
                    },
                    placeholder = {
                        Text("Номер телефона",
                            color = textColor,
                            fontSize = 12.sp)
                    },


                )
                Spacer(modifier = Modifier.size(20.dp))
                OutlinedTextField(value = email, onValueChange = {email = it},
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = textfieldColor,
                        unfocusedContainerColor = textfieldColor,
                        focusedContainerColor = textfieldColor,
                        focusedBorderColor = textfieldColor

                    ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    shape = RoundedCornerShape(50),
                    leadingIcon = {
                        Icon(painter = painterResource(R.drawable.img_6), contentDescription = "",
                            modifier = Modifier.size(18.dp),
                            tint = iconColor)
                    },
                    placeholder = {
                        Text("Почта",
                            color = textColor,
                            fontSize = 12.sp)
                    },

                )
                Spacer(modifier = Modifier.size(20.dp))
                OutlinedTextField(value = password, onValueChange = {password = it},
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = textfieldColor,
                        unfocusedContainerColor = textfieldColor,
                        focusedContainerColor = textfieldColor,
                        focusedBorderColor = textfieldColor

                    ),
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    shape = RoundedCornerShape(50),
                    leadingIcon = {
                        Icon(painter = painterResource(R.drawable.img_7), contentDescription = "",
                            modifier = Modifier.size(18.dp),
                            tint = iconColor)
                    },
                    placeholder = {
                        Text("Пароль",
                            color = textColor,
                            fontSize = 12.sp)
                    },
                    trailingIcon = {
                        Icon(painter = painterResource(R.drawable.img_8), contentDescription = "",
                            modifier = Modifier.size(18.dp),
                            tint = iconColor)

                    }

                )
                Spacer(modifier = Modifier.size(20.dp))
                Row (modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center){
                    Text("Забыл пароль?",
                        color = textColor,
                        fontSize = 12.sp,
                        textDecoration = TextDecoration.Underline)
                }

            }
            Column(modifier = Modifier.padding(bottom = 50.dp)) {
                Box(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).clip(
                        RoundedCornerShape(50)
                    ).height(60.dp).background(brush = gradient)
                ){
                    Column (modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center){
                        Row (){
                            Text("Зарегистрироваться",
                                color = Color.White,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold)
                        }
                    }
                }
                Spacer(modifier = Modifier.size(20.dp))
                Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    horizontalArrangement = Arrangement.SpaceBetween){
                    Box (modifier = Modifier.height(1.dp).width(141.dp).background(Color.Gray)){  }
                    Text("Или")
                    Box (modifier = Modifier.height(1.dp).width(141.dp).background(Color.Gray)){  }
                }
                Spacer(modifier = Modifier.size(20.dp))
                Row (modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center){
                    Image(painter = painterResource(R.drawable.img_10), contentDescription = "",
                        modifier = Modifier.size(50.dp))
                }
                Spacer(modifier = Modifier.size(20.dp))
                Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    horizontalArrangement = Arrangement.Center){
                    Text("Имеете уже аккаунт?",
                        color = Color.Black,
                        fontSize = 14.sp)
                    Text("Войти",
                        color = textColor2,
                        fontSize = 14.sp,
                        modifier = Modifier.clickable { startActivity(Intent(this@SignUp, LogIn::class.java))})


                }

            }




        }

    }


}


