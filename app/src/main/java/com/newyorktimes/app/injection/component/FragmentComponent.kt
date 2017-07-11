package com.newyorktimes.app.injection.component

import com.newyorktimes.app.injection.PerFragment
import com.newyorktimes.app.injection.module.FragmentModule
import dagger.Subcomponent

/**
 * This component inject dependencies to all Fragments across the application
 */
@PerFragment
@Subcomponent(modules = arrayOf(FragmentModule::class))
interface FragmentComponent