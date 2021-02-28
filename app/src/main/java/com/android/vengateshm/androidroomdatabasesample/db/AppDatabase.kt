package com.android.vengateshm.androidroomdatabasesample.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.android.vengateshm.androidroomdatabasesample.db.dao.AppDao
import com.android.vengateshm.androidroomdatabasesample.db.entities.*
import kotlinx.coroutines.CoroutineScope

@Database(
    entities = [Countries::class,
        Departments::class,
        Employees::class,
        JobHistory::class,
        Jobs::class,
        Locations::class,
        Regions::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): AppDao

    companion object {
        @Volatile
        private var appDatabase: AppDatabase? = null

        fun getInstance(context: Context, scope: CoroutineScope): AppDatabase {
            return appDatabase ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java, "Sample.db"
                )
                    .createFromAsset("databases/sample.db")
                    .addCallback(AppDatabaseCallback(context, scope))
                    //.addMigrations(AppMigration())
                    .build()
                appDatabase = instance
                return instance
            }
        }
    }
}