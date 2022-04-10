package com.libraries.android.learningdagger

import dagger.Module
import dagger.Provides
import javax.inject.Named

/*
* Class to store Provide functions
*
* Add Qualifiers @Named for Dagger to differentiate which argument to pass to the constructor
* */
@Module
class DaggerModule {
    @Provides @Named("Greet again") //provides arguments to the Greetings class. NB: Must be inside a Module
    fun sayHelloDaggerAgain(): Greeting {
        return Greeting("Hello, Dagger - again")
    }

    @Provides @Named("Greet")
    fun sayHelloDagger(): Greeting {
        return Greeting("Hello, Dagger ")
    }
}