package com.liamxsage.boilerplates.annotations

annotation class UserCommand(
    val name: String,
    val globalCommand: Boolean = false,
    val guilds: Array<String> = []
)