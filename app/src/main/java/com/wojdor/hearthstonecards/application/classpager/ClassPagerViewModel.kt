package com.wojdor.hearthstonecards.application.classpager

import android.arch.lifecycle.LiveData
import com.wojdor.hearthstonecards.application.base.BaseViewModel
import com.wojdor.hearthstonecards.data.repository.CardRepository

class ClassPagerViewModel(cardRepository: CardRepository) : BaseViewModel(cardRepository) {

    val classesWhichHaveCards: LiveData<List<String>>
        get() = repository.classesWhichHaveCards
}
