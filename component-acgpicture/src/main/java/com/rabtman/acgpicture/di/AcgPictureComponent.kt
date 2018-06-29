package com.rabtman.acgpicture.di

import com.rabtman.acgpicture.mvp.ui.fragment.APicFragment
import com.rabtman.acgpicture.mvp.ui.fragment.AnimatePictureFragment
import com.rabtman.common.di.component.AppComponent
import com.rabtman.common.di.scope.FragmentScope
import dagger.Component

/**
 * @author Rabtman
 */
@FragmentScope
@Component(modules = arrayOf(AnimatePictureModule::class), dependencies = arrayOf(AppComponent::class))
interface AnimatePictureComponent {

    fun inject(fragment: AnimatePictureFragment)
}

@FragmentScope
@Component(modules = arrayOf(AcgPicItemModule::class), dependencies = arrayOf(AppComponent::class))
interface AcgPicComponent {

    fun inject(fragment: APicFragment)
}