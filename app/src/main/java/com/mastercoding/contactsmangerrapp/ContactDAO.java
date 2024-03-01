package com.mastercoding.contactsmangerrapp;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ContactDAO {

    @Insert
    void insert(Contacts contact);

    @Update
    void update(Contacts contact);

    @Delete
    void delete(Contacts contact);

    @Query("SELECT * FROM contacts_table")
    LiveData<List<Contacts>> getAllContacts();

    @Query("SELECT * FROM contacts_table WHERE contact_id = :contactId")
    Contacts getContact(long contactId);

}
