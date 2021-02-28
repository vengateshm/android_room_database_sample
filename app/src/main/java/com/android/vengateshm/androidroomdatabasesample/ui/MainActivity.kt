package com.android.vengateshm.androidroomdatabasesample.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.android.vengateshm.androidroomdatabasesample.R
import com.android.vengateshm.androidroomdatabasesample.RoomSampleApp
import com.android.vengateshm.androidroomdatabasesample.viewModel.MainViewModel
import com.android.vengateshm.androidroomdatabasesample.viewModel.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    private val classTag = MainActivity::class.java.simpleName

    private val mainViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as RoomSampleApp).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.employeesFullName.observe(this, { employees ->
            employees.forEach {
                Log.i(classTag, "${it.firstName} ${it.lastName}")
            }
        })
        mainViewModel.uniqueDepartmentsFromEmployees.observe(this, { departmentIds ->
            departmentIds.forEach { departmentId ->
                Log.i(classTag, "$departmentId")
            }
        })
        mainViewModel.employeesFullNameSortedByFirstName.observe(this, { employees ->
            employees.forEach {
                Log.i(classTag, "${it.firstName} ${it.lastName}")
            }
        })
        mainViewModel.employeesSalaryWithPF.observe(this, { employees ->
            employees.forEach {
                Log.i(classTag, "${it.firstName} ${it.lastName}")
            }
        })
        mainViewModel.employeeDetailsOrderedBySalary.observe(this, { employees ->
            employees.forEach {
                Log.i(classTag, "${it.firstName} ${it.lastName}")
            }
        })
        mainViewModel.totalSalaryPaidToAllEmployees.observe(this, { totalSalary ->
            Log.i(classTag, "Total salary $totalSalary")
        })
        mainViewModel.maxAndMinSalary.observe(this, { maxMinSalary ->
            Log.i(
                classTag,
                "Max salary ${maxMinSalary.maxSalary}. Min salary ${maxMinSalary.minSalary}"
            )
        })
        mainViewModel.avgSalaryAndTotalEmployeesCount.observe(
            this,
            { avgSalaryAndTotalEmployeesCount ->
                Log.i(
                    classTag,
                    "Avg salary ${avgSalaryAndTotalEmployeesCount.avgSalary}. Employees count ${avgSalaryAndTotalEmployeesCount.employeesCount}"
                )
            })
        mainViewModel.employeesFirstNameInUpperCase.observe(
            this,
            { employees ->
                employees.forEach { employee ->
                    Log.i(
                        classTag,
                        employee.firstName
                    )
                }
            })
        mainViewModel.employeesAppendedName.observe(
            this,
            { employees ->
                employees.forEach { employee ->
                    Log.i(
                        classTag,
                        employee.fullName
                    )
                }
            })
        mainViewModel.getEmployeesByCount(10).observe(
            this,
            { employees ->
                employees.forEach { employee ->
                    Log.i(
                        classTag,
                        employee.employeeId
                    )
                }
            })
        mainViewModel.employeesWithMonthlySalary.observe(
            this,
            { employees ->
                employees.forEach { employee ->
                    Log.i(
                        classTag,
                        employee.employeeId
                    )
                }
            })
//        mainViewModel.employees.observe(this, { employees ->
//            val size = employees.size
//            Log.d("RASHMIKA", size.toString())
//        })
    }
}