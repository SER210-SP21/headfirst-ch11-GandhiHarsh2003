package edu.quinnipiac.ser210.guessinggame

import androidx.lifecycle.ViewModel

// add a string constructor because of safeArgs
class ResultViewModel(finalResult: String) : ViewModel(){
    // we will use this to set the result property.
    val result = finalResult
}
