package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CourseActivity : AppCompatActivity() {
    private var name:String? = null
    private var course:String? = null

    private val binding by lazy {
        ActivityCourseBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}