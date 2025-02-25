package com.example.professional

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.pager.rememberPagerState
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
import com.example.professional.ui.theme.Max1
import com.example.professional.ui.theme.Max3
import com.example.professional.ui.theme.ProfessionalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Splash()
            Handler().postDelayed({startActivity(Intent(this@MainActivity, Onboarding::class.java))}, 3000)


        }
    }
    @Preview(showBackground = true)
    @Composable
    fun Splash() {
        Column (modifier = Modifier.fillMaxSize().background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top){
            Spacer(modifier = Modifier.size(100.dp))
            Image(painter = painterResource(R.drawable.img), contentDescription = "",
                modifier = Modifier.height(323.dp).width(314.dp)
                )
            Spacer(modifier = Modifier.size(10.dp))
            Row (){
                Text("Wild",
                    color = Max1,
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold)
                Text("Way",
                    color = Color.Black,
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.size(10.dp))
            Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.Center){
                Text("Каждый может тренироваться",
                    color = Max3,
                    fontSize = 18.sp)
            }

        }

    }
}


