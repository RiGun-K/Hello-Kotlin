package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    private val onApply = View.onClickListener(
        val intent = Intent(this,CourseActivity::class.java)
        startActivity(intent)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        myCycle = MyCycle()
        lifecycle.addObserver(myCycle)

        binding.progressBar.max = 4

        binding.editTextTextPersonName.addTextChangedListener(textWatcher)

    }



}