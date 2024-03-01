package com.mastercoding.contactsmangerrapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class MyViewModel extends AndroidViewModel {
    // If you need to use context inside your ViewModel
    // you should use AndroidViewModel (AVM),
    // because it contains the application context.
    private MyRepository repository;
    private LiveData<List<Contacts>> allContacts;

    public MyViewModel(@NonNull Application application) {
        super(application);
        repository = new MyRepository(application);
    }

    public void addNewContact(Contacts contact) {
        repository.addContact(contact);
    }

    public void deleteContact(Contacts contact) {
        repository.deleteContact(contact);
    }

    public LiveData<List<Contacts>> getAllContacts() {
        return repository.getAllContacts();
    }
}
