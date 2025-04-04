package com.example.back.domain.home.home.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @Value("\${custom.secretValue}")
    lateinit var secretValue: String

    @GetMapping
    fun home(): String {
        //application-secret의 custom.secretValue 가져오기
        return "Hello, $secretValue"
    }
}