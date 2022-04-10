package com.libraries.android.learningdagger

import dagger.Module
import dagger.Provides

/*
* Class to store Provide functions
* */
@Module
class DaggerModule {
    @Provides //provides arguments to the Greetings class. NB: Must be inside a Module
    fun sayHelloDaggerAgain(): Greeting {
        return Greeting("Hello, Dagger - again")
    }
}