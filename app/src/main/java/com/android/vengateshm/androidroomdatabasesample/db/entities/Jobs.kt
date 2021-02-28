package com.android.vengateshm.androidroomdatabasesample.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "jobs")
class Jobs(
    @PrimaryKey @ColumnInfo(name = "job_id") val jobId: String,
    @ColumnInfo(name = "job_title") val jobTitle: String,
    @ColumnInfo(name = "min_salary") val minSalary: Double,
    @ColumnInfo(name = "max_salary") val maxSalary: Double
)