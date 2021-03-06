package com.nagwa.nagwa_mvp_task.di.activity

import com.nagwa.nagwa_mvp_task.ui.fragments.home.HomeFragment
import com.nagwa.nagwa_mvp_task.di.application.ApplicationComponent
import com.nagwa.nagwa_mvp_task.ui.activities.main.MainActivity
import com.nagwa.nagwa_mvp_task.ui.fragments.downloads.DownloadsFragment
import dagger.Component

@PerActivity
@Component(dependencies = [(ApplicationComponent::class)], modules = [(ActivityModule::class)])
interface ActivityComponent {

    fun inject(target: MainActivity)

    fun inject(target: HomeFragment)

    fun inject(target: DownloadsFragment)
}
