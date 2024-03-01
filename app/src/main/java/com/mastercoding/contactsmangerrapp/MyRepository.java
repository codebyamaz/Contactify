package com.mastercoding.contactsmangerrapp;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRepository {
    // The Available Data Sources;
    // - ROOM Database
    private ContactDAO contactDAO;

    public MyRepository(Application application) {
        ContactDatabase contactDatabase = ContactDatabase.getInstance(application);
        contactDAO = contactDatabase.getContactDAO();
    }

    // Methods in DAO being executed in Repo
    public void addContact(Contacts contact) {
        // Used for Background Database Operations
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Used for Updating the UI
        Handler handler = new Handler(Looper.getMainLooper());
        // Runnable: Executing Tasks on Separate Thread
        executor.execute(new Runnable() {
            @Override
            public void run() {
                // Execute this code asynchronously
                // on separate thread
                contactDAO.insert(contact);
            }
        });
    }

    public void deleteContact(Contacts contact) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
        executor.execute(new Runnable() {
            @Override
            public void run() {
                contactDAO.delete(contact);
            }
        });
    }

    public LiveData<List<Contacts>> getAllContacts() {
        return contactDAO.getAllContacts();
    }
}
