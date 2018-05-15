package com.sch.moshi.codegen.test

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Foo(
    val id: Int,
    val name: String
)
