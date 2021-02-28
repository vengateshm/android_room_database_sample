package com.android.vengateshm.androidroomdatabasesample

import android.app.Application
import com.android.vengateshm.androidroomdatabasesample.db.AppDatabase
import com.android.vengateshm.androidroomdatabasesample.repository.AppRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class RoomSampleApp : Application() {

    val scope = CoroutineScope(SupervisorJob())

    val database by lazy { AppDatabase.getInstance(this, scope) }
    val repository by lazy { AppRepository(database.appDao()) }
}