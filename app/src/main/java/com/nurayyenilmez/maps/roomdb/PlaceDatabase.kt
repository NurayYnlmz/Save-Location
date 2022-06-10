package com.nurayyenilmez.maps.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nurayyenilmez.maps.model.Place

@Database (entities=[Place::class],version=1) //arrayof
abstract class PlaceDatabase:RoomDatabase() {
    abstract fun placeDao():PlaceDao
}