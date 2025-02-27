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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import com.example.professional.ui.theme.Mix
import com.example.professional.ui.theme.ProfessionalTheme
import com.example.professional.ui.theme.butEnd
import com.example.professional.ui.theme.butStart
import com.example.professional.ui.theme.grad1
import com.example.professional.ui.theme.grad2
import com.example.professional.ui.theme.textColor
import com.example.professional.ui.theme.textColor2
import com.example.professional.ui.theme.textfieldColor

class SleepSchedule : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val gradient2 = Brush.linearGradient(
                colors = listOf(
                    butEnd,
                    butStart
                )
            )
            Hello()
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp).padding(top = 40.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Card(
                        modifier = Modifier
                            .size(32.dp)
                            .clickable {
                                startActivity(
                                    Intent(
                                        this@SleepSchedule,
                                        Home::class.java
                                    )
                                )
                            },
                        colors = CardDefaults.cardColors(textfieldColor)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.img_31),
                                contentDescription = "",
                                tint = Color.Black,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                    Text(
                        "График сна",
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontFamily = BoldFamily
                    )
                    Card(
                        modifier = Modifier.size(32.dp),
                        colors = CardDefaults.cardColors(textfieldColor)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.img_32),
                                contentDescription = "",
                                tint = Color.Black,
                                modifier = Modifier
                                    .height(4.dp)
                                    .width(10.dp)
                            )
                        }
                    }
                }
                Row (modifier = Modifier.fillMaxWidth().padding(bottom = 60.dp).padding(horizontal = 30.dp),
                    horizontalArrangement = Arrangement.End){
                    Box (modifier = Modifier.size(60.dp).clip(shape = CircleShape).background(brush = gradient2)){
                        Column (modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center){
                            Icon(painter = painterResource(R.drawable.img_70), contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier.size(28.dp))
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
        Column(
            modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
                .background(color = Color.White),
            verticalArrangement = Arrangement.Top
        ) {

            Spacer(modifier = Modifier.size(60.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).padding(top = 60.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier.height(146.dp).fillMaxWidth().clip(RoundedCornerShape(20))
                        .background(
                            grad2
                        )
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(modifier = Modifier.fillMaxHeight().padding(vertical = 20.dp)) {
                            Text(
                                "Идеальные часы для сна",
                                fontSize = 12.sp,
                                color = Color.Black,
                                fontFamily = NormalFamily
                            )
                            Spacer(Modifier.size(10.dp))
                            Row {
                                Text(
                                    "8 часов 30",
                                    fontSize = 14.sp,
                                    fontFamily = MediumFamily,
                                    color = butEnd
                                )
                                Spacer(modifier = Modifier.size(2.dp))
                                Text(
                                    "минут",
                                    fontSize = 12.sp,
                                    color = butEnd,
                                    fontFamily = NormalFamily
                                )
                            }


                            Spacer(modifier = Modifier.size(20.dp))
                            Box(
                                modifier = Modifier.height(35.dp).width(95.dp).clip(
                                    RoundedCornerShape(20.dp)
                                ).background(brush = gradient2)
                            ) {
                                Column(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        "Больше",
                                        color = Color.White,
                                        fontSize = 10.sp
                                    )
                                }
                            }

                        }
                        Column(
                            modifier = Modifier.fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.img_67),
                                contentDescription = "",
                                modifier = Modifier.height(100.dp).width(118.dp)
                            )

                        }
                    }
                }

            }
            Spacer(modifier = Modifier.size(20.dp))
            Spacer(modifier = Modifier.size(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    "Ваше расписание",
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontFamily = SemiBoldFamily
                )
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Card(
                    modifier = Modifier.height(80.dp).width(60.dp),
                    colors = CardDefaults.cardColors(textfieldColor)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(vertical = 15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "Пон",
                            color = Mix,
                            fontFamily = NormalFamily,
                            fontSize = 12.sp
                        )
                        Text(
                            "11",
                            color = Mix,
                            fontFamily = NormalFamily,
                            fontSize = 14.sp,
                        )
                    }
                }
                Card(
                    modifier = Modifier.height(80.dp).width(60.dp),
                    colors = CardDefaults.cardColors(textfieldColor)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(vertical = 15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "Вто",
                            color = Mix,
                            fontFamily = NormalFamily,
                            fontSize = 12.sp
                        )
                        Text(
                            "12",
                            color = Mix,
                            fontFamily = NormalFamily,
                            fontSize = 14.sp,
                        )
                    }
                }
                Card(
                    modifier = Modifier.height(80.dp).width(60.dp),
                    colors = CardDefaults.cardColors(textfieldColor)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(vertical = 15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "Сре",
                            color = Mix,
                            fontFamily = NormalFamily,
                            fontSize = 12.sp
                        )
                        Text(
                            "13",
                            color = Mix,
                            fontFamily = NormalFamily,
                            fontSize = 14.sp,
                        )
                    }
                }
                Card(
                    modifier = Modifier.height(80.dp).width(60.dp),
                    colors = CardDefaults.cardColors(textfieldColor)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(vertical = 15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "Чет",
                            color = Mix,
                            fontFamily = NormalFamily,
                            fontSize = 12.sp
                        )
                        Text(
                            "14",
                            color = Mix,
                            fontFamily = NormalFamily,
                            fontSize = 14.sp,
                        )
                    }
                }
                Card(
                    modifier = Modifier.height(80.dp).width(60.dp),
                    colors = CardDefaults.cardColors(textfieldColor)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(vertical = 15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "Пят",
                            color = Mix,
                            fontFamily = NormalFamily,
                            fontSize = 12.sp
                        )
                        Text(
                            "15",
                            color = Mix,
                            fontFamily = NormalFamily,
                            fontSize = 14.sp,
                        )
                    }
                }
                Card(
                    modifier = Modifier.height(80.dp).width(60.dp),
                    colors = CardDefaults.cardColors(textfieldColor)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize().padding(vertical = 15.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "Суб",
                            color = Mix,
                            fontFamily = NormalFamily,
                            fontSize = 12.sp
                        )
                        Text(
                            "16",
                            color = Mix,
                            fontFamily = NormalFamily,
                            fontSize = 14.sp,
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.Center
            ) {

                Card(
                    modifier = Modifier.fillMaxWidth().height(93.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(2.dp),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.img_64),
                                    contentDescription = "",
                                    modifier = Modifier.size(30.dp)
                                )
                            }
                            Column(
                                modifier = Modifier.fillMaxHeight().padding(vertical = 10.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Row() {
                                    Text(
                                        "Сон,",
                                        color = Color.Black,
                                        fontSize = 14.sp,
                                    )
                                    Spacer(modifier = Modifier.size(1.dp))
                                    Text(
                                        "21:00",
                                        color = textColor,
                                        fontSize = 12.sp,
                                        fontFamily = NormalFamily
                                    )

                                }
                                Spacer(modifier = Modifier.size(10.dp))
                                Text(
                                    "через 6 часов 22 минуты",
                                    color = textColor,
                                    fontSize = 12.sp,
                                    fontFamily = NormalFamily
                                )

                            }
                            Column(
                                modifier = Modifier.fillMaxHeight().padding(vertical = 20.dp),
                                verticalArrangement = Arrangement.SpaceBetween,
                                horizontalAlignment = Alignment.End
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.img_34),
                                        contentDescription = "",
                                        modifier = Modifier.size(14.dp)
                                    )
                                }
                                Row(
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.img_65),
                                        contentDescription = "",
                                        modifier = Modifier.height(24.dp).width(44.dp)
                                    )
                                }


                            }
                        }
                    }


                }
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.Center
            ) {

                Card(
                    modifier = Modifier.fillMaxWidth().height(93.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(2.dp),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(
                                modifier = Modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.img_66),
                                    contentDescription = "",
                                    modifier = Modifier.size(30.dp)
                                )
                            }
                            Column(
                                modifier = Modifier.fillMaxHeight().padding(vertical = 10.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Row() {
                                    Text(
                                        "Будильник,",
                                        color = Color.Black,
                                        fontSize = 14.sp,
                                    )
                                    Spacer(modifier = Modifier.size(1.dp))
                                    Text(
                                        "05:10",
                                        color = textColor,
                                        fontSize = 12.sp,
                                        fontFamily = NormalFamily
                                    )

                                }
                                Spacer(modifier = Modifier.size(10.dp))
                                Text(
                                    "через 10 часов 40 минуты",
                                    color = textColor,
                                    fontSize = 12.sp,
                                    fontFamily = NormalFamily
                                )

                            }
                            Column(
                                modifier = Modifier.fillMaxHeight().padding(vertical = 20.dp),
                                verticalArrangement = Arrangement.SpaceBetween,
                                horizontalAlignment = Alignment.End
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.img_34),
                                        contentDescription = "",
                                        modifier = Modifier.size(14.dp)
                                    )
                                }
                                Row(
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.img_65),
                                        contentDescription = "",
                                        modifier = Modifier.height(24.dp).width(44.dp)
                                    )
                                }


                            }
                        }
                    }


                }


            }
            Spacer(modifier = Modifier.size(20.dp))
            Box(
                modifier = Modifier.height(102.dp).fillMaxWidth().padding(horizontal = 30.dp)
                    .clip(RoundedCornerShape(20)).background(
                    grad2
                )
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(modifier = Modifier.fillMaxHeight().padding(vertical = 20.dp)) {
                        Text(
                            "Сегодня вечером у тебя",
                            fontSize = 12.sp,
                            color = Color.Black,
                            fontFamily = NormalFamily
                        )
                        Spacer(Modifier.size(10.dp))
                        Row {
                            Text(
                                "8 часов 30",
                                fontSize = 12.sp,
                                fontFamily = NormalFamily,
                                color = Color.Black
                            )


                        }
                        Spacer(modifier = Modifier.size(15.dp))
                        Row(modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center) {
                            Image(painter = painterResource(R.drawable.img_69 ), contentDescription = "",
                                modifier = Modifier.height(15.dp))

                        }

                    }
                }

            }

        }
    }
}
