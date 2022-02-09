package com.example.tastycloneapp.model.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tastycloneapp.model.remote.api.response.Result

@Dao
interface DAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(results: Result)

    @Query("SELECT * FROM foodEntity")
    fun getData():LiveData<List<Result>>

    @Query("DELETE FROM foodEntity")
    fun deleteData()
}