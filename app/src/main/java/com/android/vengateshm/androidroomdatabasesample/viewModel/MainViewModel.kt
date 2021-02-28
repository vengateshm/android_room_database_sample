package com.android.vengateshm.androidroomdatabasesample.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import com.android.vengateshm.androidroomdatabasesample.repository.AppRepository

class MainViewModel(private val repository: AppRepository) : ViewModel() {

    val employees = repository.allEmployees.asLiveData()
    val employeesFullName = repository.employeesFullName.asLiveData()
    val uniqueDepartmentsFromEmployees = repository.uniqueDepartmentsFromEmployees.asLiveData()
    val employeesFullNameSortedByFirstName =
        repository.employeesFullNameSortedByFirstName.asLiveData()
    val employeesSalaryWithPF = repository.employeesSalaryWithPF.asLiveData()
    val employeeDetailsOrderedBySalary = repository.employeeDetailsOrderedBySalary.asLiveData()
    val totalSalaryPaidToAllEmployees = repository.totalSalaryPaidToAllEmployees.asLiveData()
    val maxAndMinSalary = repository.maxAndMinSalary.asLiveData()
    val avgSalaryAndTotalEmployeesCount = repository.avgSalaryAndTotalEmployeesCount.asLiveData()
    val employeesFirstNameInUpperCase = repository.employeesFirstNameInUpperCase.asLiveData()
    val employeesAppendedName = repository.employeesAppendedName.asLiveData()
    fun getEmployeesByCount(count: Int) = repository.getEmployeesByCount(count).asLiveData()
    val employeesWithMonthlySalary = repository.employeesWithMonthlySalary.asLiveData()
}

class MainViewModelFactory(private val repository: AppRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MainViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}