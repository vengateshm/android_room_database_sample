package com.android.vengateshm.androidroomdatabasesample.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "locations")
class Locations(
    @PrimaryKey
    @ColumnInfo(name = "location_id")
    val locationId: Int,
    @ColumnInfo(name = "street_address")
    val streetAddress: String,
    @ColumnInfo(name = "postal_code")
    val postalCode: String,
    @ColumnInfo(name = "city")
    val city: String,
    @ColumnInfo(name = "state_province")
    val stateProvince: String,
    @ColumnInfo(name = "country_id")
    val countryId: String
)