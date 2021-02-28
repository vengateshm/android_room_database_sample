package com.android.vengateshm.androidroomdatabasesample.db

import android.content.Context
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.android.vengateshm.androidroomdatabasesample.db.dao.AppDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class AppDatabaseCallback(private val context: Context, private val scope: CoroutineScope) :
    RoomDatabase.Callback() {
    override fun onCreate(db: SupportSQLiteDatabase) {
        super.onCreate(db)
        AppDatabase.getInstance(context, scope).let { database ->
            scope.launch {
                populateDatabase(database.appDao())
            }
        }
    }

    // Populate database once all tables are created
    private suspend fun populateDatabase(appDao: AppDao) {

    }
}