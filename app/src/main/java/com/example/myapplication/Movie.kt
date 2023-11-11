package com.example.myapplication

import java.io.Serializable

data class Movie(val title: String, val director: String, val description: String, val imageUrl: String) : Serializable
