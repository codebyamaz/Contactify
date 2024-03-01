package com.mastercoding.contactsmangerrapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.mastercoding.contactsmangerrapp.databinding.ContactListItemBinding;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ContactViewHolder> {
    private ArrayList<Contacts> contacts;
    public MyAdapter(ArrayList<Contacts> contacts) {
        this.contacts = contacts;
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        private ContactListItemBinding binding;
        public ContactViewHolder(@NonNull ContactListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Creating new View Holders for items in RecyclerView.
        ContactListItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.contact_list_item, parent, false);
        return new ContactViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        // called by recyclerView when it needs to display or update an item
        // at a specific position in the list or grid.
        Contacts currentContact = contacts.get(position);
        holder.binding.setContact(currentContact);
    }

    @Override
    public int getItemCount() {
        // Determines the total no of items in the dataset that will
        // be displayed in the recyclerView.
        if (contacts != null) {
            return contacts.size();
        } else {
            return 0;
        }
    }

    public void setContacts(ArrayList<Contacts> contacts) {
        this.contacts = contacts;
        // Inform the associated recyclerView that the underlying
        // dataset has changed, and recyclerView should refresh
        // its views to refresh these changes.
        notifyDataSetChanged();
    }
}