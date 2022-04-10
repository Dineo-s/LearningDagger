package com.libraries.android.learningdagger

import dagger.Component
/* Helps instantiate member variables
* */
@Component
interface ConstructionBox {
    // Help with construction in following activities
    fun injectIntoActivity(app : MainActivity)
}