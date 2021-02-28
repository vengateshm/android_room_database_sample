package com.android.vengateshm.androidroomdatabasesample.repository

import com.android.vengateshm.androidroomdatabasesample.db.dao.AppDao

class AppRepository(private val appDao: AppDao) {
    val allEmployees = appDao.getAllEmployees()
    val employeesFullName = appDao.getEmployeesFullName()
    val uniqueDepartmentsFromEmployees = appDao.getUniqueDepartmentsFromEmployeesTable()
    val employeesFullNameSortedByFirstName = appDao.getEmployeesFullNameSortedByFirstName()
    val employeesSalaryWithPF = appDao.getEmployeesSalaryWithPF()
    val employeeDetailsOrderedBySalary = appDao.getEmployeeDetailsOrderedBySalary()
    val totalSalaryPaidToAllEmployees = appDao.getTotalSalaryPaidToAllEmployees()
    val maxAndMinSalary = appDao.getMaxAndMinSalary()
    val avgSalaryAndTotalEmployeesCount = appDao.getAvgSalaryAndTotalEmployeesCount()
    val employeesFirstNameInUpperCase = appDao.getEmployeesFirstNameInUpperCase()
    val employeesAppendedName = appDao.getEmployeesAppendedName()
    fun getEmployeesByCount(count: Int) = appDao.getEmployeesByCount(count)
    val employeesWithMonthlySalary = appDao.getEmployeesWithMonthlySalary()
}