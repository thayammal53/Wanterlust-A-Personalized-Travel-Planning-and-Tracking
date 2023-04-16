package com.example.travelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapp.ui.theme.TravelAppTheme

class BaliActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PlaceOne()
                }
            }
        }
    }
}

@Composable
fun PlaceOne() {
    Column(modifier = Modifier.background(color = Color.White)
        .padding(20.dp)
        .verticalScroll(rememberScrollState())
    ) {
        Text(
            fontSize = 40.sp,
            color = Color(android.graphics.Color.rgb(120, 40, 251)),
            fontFamily = FontFamily.Cursive,
            text = stringResource(id = R.string.place_1),
        )
        Image(
            painterResource(id = R.drawable.bali), contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(200.dp)
                .scale(scaleX = 1.2F, scaleY = 1F),
        )
        Text(
            color=Color.Black,
            text = buildString {
        append("Day 1: Arrival and Relaxation\n")
        append("Arrive in Bali and check into your hotel or accommodation.\n")
        append("Spend the day relaxing and getting acclimated to the island.\n")
        append("If you have time, explore the nearby area or head to the beach.\n")
        append("\n")
        append("Day 2: Ubud Tour\n")
        append("Start your day early and head to Ubud, a cultural and artistic hub in Bali.\n")
        append("Visit the Monkey Forest and the Ubud Palace.\n")
        append("Take a tour of the Tegalalang Rice Terrace, a beautiful UNESCO World Heritage Site.\n")
        append("End your day with a traditional Balinese dance performance.\n")
        append("\n")
        append("Day 3: Temple Hopping\n")
        append("Visit some of Bali's most famous temples, such as Tanah Lot and Uluwatu.\n")
        append("Take in the stunning views of the ocean and cliffs.\n")
        append("Enjoy a sunset dinner at one of the many restaurants near the temples.\n")
        append("\n")
        append("Day 4: Waterfalls and Beaches\n")
        append("Take a day trip to Bali's beautiful waterfalls, such as Tegenungan or Gitgit.\n")
        append("Spend the afternoon at one of Bali's world-renowned beaches, like Seminyak or Nusa Dua.\n")
        append("\n")
        append("Day 5: Island Hopping\n")
        append("Take a day trip to one of Bali's neighboring islands, such as Nusa Lembongan or Gili Islands.\n")
        append("Snorkel or scuba dive in the clear waters and relax on the beach.\n")
        append("\n")
        append("Day 6: Cultural Activities\n")
        append("Visit a traditional Balinese village and learn about the island.\n")
        append("\n")
        append("Day 7: Departure\n")
        append("Explore the surrounding area and take in the stunning sunset views.\n")
        append("Have dinner at a local restaurant before returning to your accommodation.")
    }
        )


    }
}
