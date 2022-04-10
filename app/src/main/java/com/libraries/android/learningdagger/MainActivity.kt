package com.libraries.android.learningdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.libraries.android.learningdagger.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @Inject
    lateinit var greeting :Greeting

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

        //This class "creates the component class" its created by dagger 2
        DaggerConstructionComponent.create().injectIntoActivity(this)
        binding.greetingTextView.text = greeting.sayHello
    }


}
