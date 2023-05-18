package com.example.homework_3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_next;
    private EditText name, surname, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        navigateNext();
    }

    private void navigateNext() {
        btn_next.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            String name = ((EditText) findViewById(R.id.etName)).getText().toString();
            String surname = ((EditText) findViewById(R.id.etSurname)).getText().toString();
            String age = ((EditText) findViewById(R.id.etAge)).getText().toString();
            intent.putExtra("name", name);
            intent.putExtra("surname", surname);
            intent.putExtra("age", age);
            startActivity(intent);
        });
    }

    private void initViews() {
        btn_next = findViewById(R.id.btn_next);
        name = findViewById(R.id.etName);
        surname = findViewById(R.id.etSurname);
        age = findViewById(R.id.etAge);
    }

}