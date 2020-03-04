package com.arnisand.mymanager.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.arnisand.mymanager.domain.usecase.FileUseCase

class MainViewModel(
    useCase: FileUseCase
): ViewModel() {

    private var i = 0

    fun test() {
        i++
        Log.d("MY_TEST", "Hello $i")
    }

    override fun onCleared() {
        Log.d("MY_TEST", "onCleared()")
        super.onCleared()
    }
}
