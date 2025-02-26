package com.example.professional

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import com.example.professional.ui.theme.textfieldColor

class Notification : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column (modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top){
                Spacer(modifier = Modifier.size(40.dp))
                Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                    horizontalArrangement = Arrangement.SpaceBetween){
                    Card (modifier = Modifier.size(32.dp).clickable { startActivity(Intent(this@Notification, Home::class.java))},
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
                                modifier = Modifier.height(4.dp).width(10.dp)
                            )
                        }
                    }
                }

            }

        }
    }
}
