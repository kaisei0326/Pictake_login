package com.example.login.ui.login

data class CreateFormState(
    val addressError: Int? = null,
    val passwordError: Int? = null,
    val usernameError: Int? = null,
    val isDataValid: Boolean = false
)