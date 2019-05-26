package com.womenwhocode.workshop.doggoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DoggosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doggos)
    }

    private fun doggoList() = listOf(
        Doggo("Toby", "3 months", "Big", R.drawable.doggo_1),
        Doggo("Snowy", "2 months", "Big", R.drawable.doggo_2),
        Doggo("Luca", "8 months", "Medium", R.drawable.doggo_3),
        Doggo("Chispi", "2 years", "Small", R.drawable.doggo_4),
        Doggo("Willy", "6 months", "Big", R.drawable.huge_dog_malamute),
        Doggo("Coco", "3 years", "Small", R.drawable.tiny_dog_norfolk),
        Doggo("Balto", "3 months", "Big", R.drawable.doggo_1),
        Doggo("Boby", "2 months", "Big", R.drawable.doggo_2)
    )
}