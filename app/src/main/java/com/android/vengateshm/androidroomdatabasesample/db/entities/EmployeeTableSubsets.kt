package com.android.vengateshm.androidroomdatabasesample.db.entities

import androidx.room.ColumnInfo

data class EmployeeName(
    @ColumnInfo(name = "first_name") val firstName: String,
    @ColumnInfo(name = "last_name") val lastName: String,
)

data class EmployeeNameWithSalaryAndPF(
    @ColumnInfo(name = "first_name") val firstName: String,
    @ColumnInfo(name = "last_name") val lastName: String,
    @ColumnInfo(name = "salary") val salary: Double,
    @ColumnInfo(name = "pf") val providentFund: Double
)

data class EmployeeDetailsWithSalary(
    @ColumnInfo(name = "employee_id") val employeeId: String,
    @ColumnInfo(name = "first_name") val firstName: String,
    @ColumnInfo(name = "last_name") val lastName: String,
    @ColumnInfo(name = "salary") val salary: Double,
)

data class MaxMinSalary(
    @ColumnInfo(name = "max_salary") val maxSalary: Double,
    @ColumnInfo(name = "min_salary") val minSalary: Double
)

data class AvgSalaryAndTotalEmployeesCount(
    @ColumnInfo(name = "avg_salary") val avgSalary: Double,
    @ColumnInfo(name = "employees_count") val employeesCount: Int
)

data class EmployeeAppendedName(
    @ColumnInfo(name = "full_name") val fullName: String,
)

data class EmployeeDetailsWithMonthlySalary(
    @ColumnInfo(name = "employee_id") val employeeId: String,
    @ColumnInfo(name = "first_name") val firstName: String,
    @ColumnInfo(name = "last_name") val lastName: String,
    @ColumnInfo(name = "monthly_salary") val monthlySalary: Double,
)