package edu.quinnipiac.ser210.guessinggame

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

// safeArgs were being passed from gamefragment so has to store it in constructor. and have to use ViewModelFactory
class ResultViewModelFactory(private val finalResult: String): ViewModelProvider.Factory {
   //this is the mthod which the view model provider uses to create view model objects/
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       //this if statement checks which view model it wants to create
        if(modelClass.isAssignableFrom(ResultViewModel::class.java)){
            return ResultViewModel(finalResult) as T
        } else {
            throw java.lang.IllegalArgumentException("Unknown ViewModel")
        }

    }
}