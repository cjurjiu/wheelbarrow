package com.catalinjurjiu.wheelbarrowdemo.activitiesdemo

import android.util.Log
import com.catalinjurjiu.wheelbarrowdemo.common.SumViewPresenter

interface Activity2Injector {
    fun inject(activity: Activity2)
}

class Activity2InjectorImpl : Activity2Injector {
    val presenter = SumViewPresenter()

    override fun inject(activity: Activity2) {
        Log.d("Cata", "Injecting fragment!")
        activity.presenter = presenter
    }
}