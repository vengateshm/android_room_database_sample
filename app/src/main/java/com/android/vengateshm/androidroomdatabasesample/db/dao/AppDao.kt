package com.android.vengateshm.androidroomdatabasesample.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.android.vengateshm.androidroomdatabasesample.db.entities.*
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDao {
    @Query("SELECT first_name, last_name from EMPLOYEES")
    fun getEmployeesFullName(): Flow<List<EmployeeName>>

    @Query("SELECT DISTINCT department_id from EMPLOYEES")
    fun getUniqueDepartmentsFromEmployeesTable(): Flow<List<Int>>

    @Query("SELECT * FROM employees ORDER BY first_name DESC")
    fun getEmployeesFullNameSortedByFirstName(): Flow<List<EmployeeName>>

    @Query("SELECT first_name, last_name, salary, salary*.15 pf FROM employees")
    fun getEmployeesSalaryWithPF(): Flow<List<EmployeeNameWithSalaryAndPF>>

    @Query("SELECT employee_id, first_name, last_name, salary FROM employees ORDER BY salary")
    fun getEmployeeDetailsOrderedBySalary(): Flow<List<EmployeeDetailsWithSalary>>

    @Query("SELECT SUM(salary) FROM employees")
    fun getTotalSalaryPaidToAllEmployees(): Flow<Int>

    @Query("SELECT MAX(salary) max_salary, MIN(salary) min_salary FROM employees")
    fun getMaxAndMinSalary(): Flow<MaxMinSalary>

    @Query("SELECT AVG(salary) avg_salary , COUNT(*) employees_count FROM employees")
    fun getAvgSalaryAndTotalEmployeesCount(): Flow<AvgSalaryAndTotalEmployeesCount>

    @Query("SELECT UPPER(first_name) first_name, last_name FROM employees")
    fun getEmployeesFirstNameInUpperCase(): Flow<List<EmployeeName>>

    @Query("SELECT first_name || ' ' || last_name full_name from EMPLOYEES")
    fun getEmployeesAppendedName(): Flow<List<EmployeeAppendedName>>

    @Query("SELECT employee_id, first_name, last_name, salary FROM employees LIMIT :count")
    fun getEmployeesByCount(count: Int): Flow<List<EmployeeDetailsWithSalary>>

    @Query("SELECT employee_id, first_name, last_name, round(salary/12,2) monthly_salary FROM employees")
    fun getEmployeesWithMonthlySalary(): Flow<List<EmployeeDetailsWithMonthlySalary>>

    @Query("SELECT * FROM employees")
    fun getAllEmployees(): Flow<List<Employees>>
}