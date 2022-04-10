package com.libraries.android.learningdagger

import javax.inject.Inject

/*
* Open class to be able to be injected in other classes using @Inject annotation
* This "adds" it to the @component interface that helps with holding variables etc(to instantiate them)
* to be injected into specified classes
* */
/*
* Before: Greeting @Inject constructor(val text: String)
* You can remove the inject annotation since construction is provide in the @Provide method inside the DaggerModule
* */
class Greeting (val text: String){
    //val sayHello = "Hello Dagger"
}