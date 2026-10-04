package com.example.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LayarLogin(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        LatarGambar()
        KontenLogin()
    }
}

@Composable
fun LatarGambar() {
    val gambarLatar = painterResource(id = R.drawable.freepalestine)

    Image(
        painter = gambarLatar,
        contentDescription = "Background",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun KontenLogin() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(70.dp))
        HeaderJudul()
        Spacer(modifier = Modifier.height(40.dp))
        LogoGambar()
        Spacer(modifier = Modifier.height(60.dp))
        DataMahasiswa()
        Spacer(modifier = Modifier.height(30.dp))
        FotoProfil()
    }
}

@Composable
fun HeaderJudul() {
    Text(
        text = "Login",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Blue
    )

    Text(
        text = "Ini adalah halaman login,",
        fontSize = 14.sp,
        color = Color.White
    )
}

@Composable
fun LogoGambar() {
    val gambarLogo = painterResource(id = R.drawable.logoumy)

    Image(
        painter = gambarLogo,
        contentDescription = "Logo",
        modifier = Modifier.size(130.dp)
    )
}

@Composable
fun DataMahasiswa() {
    Text(
        text = "Nama",
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Red
    )

    Text(
        text = "Farhan ganteng",
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Blue
    )

    Text(
        text = "20240140197",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
}

@Composable
fun FotoProfil() {
    val gambarProfil = painterResource(id = R.drawable.bersatu)

    Box(
        modifier = Modifier
            .size(220.dp)
            .clip(CircleShape)
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = gambarProfil,
            contentDescription = "Foto Profil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxHeight()
                .width(150.dp)
        )
    }
}







