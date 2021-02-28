package com.android.vengateshm.androidroomdatabasesample.db

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import androidx.core.database.getLongOrNull
import androidx.core.database.getStringOrNull
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

class AppMigration : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            """
            CREATE TABLE departments_temp (
                department_id INTEGER,
                manager_id INTEGER, 
                depart_name TEXT,
                location_id INTEGER,
                PRIMARY KEY(department_id)
            )
        """.trimIndent()
        )
        val cursor = database.query("SELECT * FROM departments")
        if (cursor != null) {
            while (cursor.moveToNext()) {
                val values = ContentValues()
                with(cursor) {
                    values.put("department_id", getLongOrNull(getColumnIndex("department_id")))
                    values.put("manager_id", getLongOrNull(getColumnIndex("manager_id")))
                    values.put("depart_name", getStringOrNull(getColumnIndex("depart_name")))
                    values.put("location_id", getLongOrNull(getColumnIndex("location_id")))
                }
                database.insert("departments_temp", SQLiteDatabase.CONFLICT_REPLACE, values)
            }
            cursor.close()
        }
        database.execSQL("DROP TABLE departments")
        database.execSQL("ALTER TABLE departments_temp RENAME TO departments")
    }
}