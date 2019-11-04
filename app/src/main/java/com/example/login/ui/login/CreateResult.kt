package com.example.login.ui.login

data class CreateResult (
    val success: LoggedInUserView? = null,
    val error: Int? = null
)