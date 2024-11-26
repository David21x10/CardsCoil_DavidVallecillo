package com.example.trabajoprogramacionmovil_coil_davidvallecillo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.trabajoprogramacionmovil_coil_davidvallecillo.ui.theme.TrabajoProgramacionMovil_Coil_DavidVallecilloTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrabajoProgramacionMovil_Coil_DavidVallecilloTheme {
                Scaffold(
                    topBar = { TopBarComponent() },

                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxWidth()
                                .verticalScroll(rememberScrollState())
                        ) {
                            Spacer(modifier = Modifier.height(16.dp))

                            ImageCard(
                                ImageUrl = "https://media.cnn.com/api/v1/images/stellar/prod/gettyimages-2179660084.jpg?c=16x9&q=h_653,w_1160,c_fill/f_webp",
                                text= "Lionel Andrés Messi. El mejor jugador de la historia del fútbol.")
                            Spacer(modifier = Modifier.height(16.dp))

                            ImageCard(
                                ImageUrl = "https://images2.minutemediacdn.com/image/upload/c_crop,w_4282,h_2408,x_0,y_99/c_fill,w_720,ar_16:9,f_auto,q_auto,g_auto/images/GettyImages/mmsport/12up_es_international_web/01jb59ry6m08ez2arehp.jpg",
                                text= "Lamine Yamal y Alejandro Balde celebrando en el Bernabeu en la goleada del FC Barcelona al Real Madrid.")
                            Spacer(modifier = Modifier.height(16.dp))

                            ImageCard(
                                ImageUrl = "https://monesport.cat/app/uploads/sites/12/2024/10/ga2z9fgw8aa07o1-scaled.jpg",
                                text= "INCREIBLE. FC Barcelona aplasta 0-4 al Real Madrid de visita.")
                            Spacer(modifier = Modifier.height(16.dp))
                            }
                        }

                    }
                }
            }
        }
    }


@Composable
fun ImageCard( ImageUrl: String, text: String ) {
    Card(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .wrapContentHeight(),

        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFDAD9D9)
        )

    ) {



        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            AsyncImage(
                model = ImageUrl,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .height(200.dp),
                contentScale = ContentScale.Crop

            )
            Text(
                text = text,
                modifier = Modifier.padding(top = 10.dp),
                color = Color.Black,
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 18.sp
            )

            }
        }
    }



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarComponent() {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(stringResource(R.string.titulo))
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFFFF7043)
        )
    )
}




