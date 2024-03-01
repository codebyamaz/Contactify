package com.mastercoding.contactsmangerrapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.lifecycle.ViewModelProvider;

public class AddNewContactClickHandler {

    private MyViewModel viewModel;
    private Contacts contacts;
    private Context context;

    public AddNewContactClickHandler(MyViewModel viewModel, Contacts contacts, Context context) {
        this.viewModel = viewModel;
        this.contacts = contacts;
        this.context = context;
    }

    public void onSubmitBtnClicked(View view) {
        if ( contacts.getName() == null || contacts.getEmail() == null ) {
            Toast.makeText(context, "Fields can't be Empty", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(context, MainActivity.class);
            Contacts c = new Contacts(contacts.getName(), contacts.getEmail());
            viewModel.addNewContact(c);
            context.startActivity(i);
        }
    }
}
