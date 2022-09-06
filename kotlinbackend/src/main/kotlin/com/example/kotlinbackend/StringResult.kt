package com.example.kotlinbackend

sealed class StringResult {
    class Success(val result: String) : StringResult()

    class Error(val error: Throwable) : StringResult()
}
