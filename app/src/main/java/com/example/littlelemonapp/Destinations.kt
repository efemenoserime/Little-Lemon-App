package com.example.littlelemonapp

import kotlinx.serialization.Serializable

interface Destinations {
    val route: String
}

@Serializable
object HomeScreenRoute : Destinations {
    override val route = "Home"
}

@Serializable
object SettingsRoute

@Serializable
object MenuListRoute : Destinations {
    override val route = "MenuList"
}
