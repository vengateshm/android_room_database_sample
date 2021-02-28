package com.android.vengateshm.androidroomdatabasesample.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employees")
class Employees(
    @PrimaryKey
    @ColumnInfo(name = "employee_id")
    val employeeId: Int,
    @ColumnInfo(name = "first_name")
    val firstName: String,
    @ColumnInfo(name = "last_name")
    val lastName: String,
    @ColumnInfo(name = "email")
    val email: String,
    @ColumnInfo(name = "phone_number")
    val phoneNumber: String,
    @ColumnInfo(name = "hire_date")
    val hireDate: String,
    @ColumnInfo(name = "job_id")
    val jobId: String,
    @ColumnInfo(name = "salary")
    val salary: Double,
    @ColumnInfo(name = "commission_pct")
    val commissionPct: Int,
    @ColumnInfo(name = "manager_id")
    val managerId: Int,
    @ColumnInfo(name = "department_id")
    val departmentId: Int
)