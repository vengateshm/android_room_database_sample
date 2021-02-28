package com.android.vengateshm.androidroomdatabasesample.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "job_history",
    primaryKeys = ["employee_id", "start_date"]
)
class JobHistory(
    @ColumnInfo(name = "employee_id") val employeeId: Int,
    @ColumnInfo(name = "start_date") val startDate: String,
    @ColumnInfo(name = "end_date") val endDate: String,
    @ColumnInfo(name = "job_id") val jobId: String,
    @ColumnInfo(name = "department_id") val departmentId: Int,
)