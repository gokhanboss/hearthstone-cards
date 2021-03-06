package com.wojdor.hearthstonecards.app.base

import androidx.lifecycle.ViewModel
import com.wojdor.hearthstonecards.data.repository.CardRepository

abstract class BaseViewModel(protected val repository: CardRepository) : ViewModel() {

    override fun onCleared() {
        super.onCleared()
        repository.onDestroy()
    }
}
