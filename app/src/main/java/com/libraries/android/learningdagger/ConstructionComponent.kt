package com.libraries.android.learningdagger

import dagger.Component
/* Helps instantiate member variables
* */
@Component(modules = [DaggerModule::class])
interface ConstructionComponent {
    // Help with construction in following activities
    fun injectIntoActivity(app : MainActivity)
}