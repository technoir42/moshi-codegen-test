package com.sch.moshi.codegen.test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.Moshi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter(Foo::class.java)

        try {
            val foo = adapter.fromJson("{\n  \"id\": 1,\n  \"name\": \"Foo\"\n}")
            println(foo)
        } catch (e: JsonDataException) {
            e.printStackTrace()
        }
    }
}
