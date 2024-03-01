package com.mastercoding.contactsmangerrapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mastercoding.contactsmangerrapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Data Source
    private ContactDatabase contactDatabase;
    private ArrayList<Contacts> contactsArrayList = new ArrayList<>();
    // Adapter
    MyAdapter myAdapter;
    // Binding
    ActivityMainBinding binding;
    MainActivityClickHandlers handlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("My Contacts");

        // Binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        handlers = new MainActivityClickHandlers();
        binding.setClickHandler(handlers);

        // RecyclerView
        RecyclerView recyclerView = binding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        // Database
        contactDatabase = ContactDatabase.getInstance(this);

        // View Model
        MyViewModel viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        // Loading the Data from ROOM Database
        viewModel.getAllContacts().observe(this, new Observer<List<Contacts>>() {
            @Override
            public void onChanged(List<Contacts> contacts) {
                contactsArrayList.clear();
                for ( Contacts c: contacts ) {
                    contactsArrayList.add(c);
                }
                myAdapter.notifyDataSetChanged();
            }
        });

        // Adapter
        myAdapter = new MyAdapter(contactsArrayList);

        // Linking the recyclerView with Adapter
        recyclerView.setAdapter(myAdapter);

        // Swipe to Delete
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                Contacts c = contactsArrayList.get(viewHolder.getAdapterPosition());
                viewModel.deleteContact(c);
                contactsArrayList.remove(c);
            }
        }).attachToRecyclerView(recyclerView);
    }

    // Class within a Class.
    public class MainActivityClickHandlers {
        public void onFABClicked(View view) {
            Intent intent = new Intent(getApplicationContext(), AddNewContact.class);
            MainActivity.this.startActivity(intent);
        }
    }

}