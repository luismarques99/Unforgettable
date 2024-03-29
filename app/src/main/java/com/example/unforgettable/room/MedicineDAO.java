package com.example.unforgettable.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.unforgettable.entities.Medicine;

import java.util.List;

@Dao
public interface MedicineDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMedicine(Medicine... medicines);

    @Update
    void updateMedicine(Medicine... medicines);

    @Delete
    void deleteMedicine(Medicine... medicines);

    @Query("SELECT * FROM Medicines")
    LiveData<List<Medicine>> getAllMedicines();
}
