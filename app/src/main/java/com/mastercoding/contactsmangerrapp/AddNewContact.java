package com.mastercoding.contactsmangerrapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.room.Database;

import android.os.Bundle;
import android.widget.Toast;

import com.mastercoding.contactsmangerrapp.databinding.ActivityAddNewContactBinding;
import com.mastercoding.contactsmangerrapp.databinding.ActivityMainBinding;

public class AddNewContact extends AppCompatActivity {
    private ActivityAddNewContactBinding binding;
    private AddNewContactClickHandler handler;
    private Contacts contacts = new Contacts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_contact);

        getSupportActionBar().setTitle("Enter Contact Details");
        MyViewModel viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_new_contact);
        binding.setContact(contacts);
        handler = new AddNewContactClickHandler(viewModel, contacts, this);
        binding.setClickHandler(handler);
    }
}