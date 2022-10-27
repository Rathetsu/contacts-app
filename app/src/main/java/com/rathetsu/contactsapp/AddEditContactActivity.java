package com.rathetsu.contactsapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AddEditContactActivity extends AppCompatActivity {

    private ImageView ivContactImage;
    private EditText etName, etPhone, etEmail, etAddress, etBio;
    private FloatingActionButton fabSave;

    ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_contact);

        actionBar = getSupportActionBar();
        actionBar.setTitle("Add Contact");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        ivContactImage = findViewById(R.id.ivContactImage);
        etName = findViewById(R.id.ET_name);
        etPhone = findViewById(R.id.ET_phone);
        etEmail = findViewById(R.id.ET_email);
        etAddress = findViewById(R.id.ET_address);
        etBio = findViewById(R.id.ET_bio);
        fabSave = findViewById(R.id.fab_save);

        fabSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveContact();
            }
        });

    }

    private void saveContact() {
        String name = etName.getText().toString();
        String phone = etPhone.getText().toString();
        String email = etEmail.getText().toString();
        String address = etAddress.getText().toString();
        String bio = etBio.getText().toString();

        if (name.trim().isEmpty() || phone.trim().isEmpty()) {
            Toast.makeText(this, R.string.invalidSave_toast, Toast.LENGTH_SHORT).show();
            return;
        }

        //save On SQLite
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }


}