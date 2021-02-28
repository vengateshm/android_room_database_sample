package com.android.vengateshm.androidroomdatabasesample.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "countries")
class Countries(
    @PrimaryKey
    @ColumnInfo(name = "country_id")
    val countryId: String,
    @ColumnInfo(name = "country_name")
    val countryName: String,
    @ColumnInfo(name = "region_id")
    val regionId: Int
)