package me.davidalb97.multiplatformreleaseclient

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform