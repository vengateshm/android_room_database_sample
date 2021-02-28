package com.android.vengateshm.androidroomdatabasesample.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "departments")
class Departments(
    @PrimaryKey
    @ColumnInfo(name = "department_id")
    val departmentId: Int,
    @ColumnInfo(name = "depart_name")
    val departmentName: String,
    @ColumnInfo(name = "manager_id")
    val managerId: Int,
    @ColumnInfo(name = "location_id")
    val locationId: Int
)