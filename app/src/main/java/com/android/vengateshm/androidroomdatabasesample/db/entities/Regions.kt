package com.android.vengateshm.androidroomdatabasesample.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "regions")
class Regions(
    @PrimaryKey
    @ColumnInfo(name = "region_id")
    val regionId: Int,
    @ColumnInfo(name = "region_name")
    val regionName: String
)