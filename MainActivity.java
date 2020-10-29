package com.example.proyecto_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText textUser;
    private EditText textPassword;
    private Button btnEntrar;
    public final int SEGUNDA=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textUser = findViewById(R.id.idTextUser);
        textPassword = findViewById(R.id.idTextPassword);
        btnEntrar = findViewById(R.id.idSignUp);
        btnEntrar.setOnClickListener(this);
    }

    public void onClick(View v) {
      //  if (textUser.getText().toString().equalsIgnoreCase("user") && textPassword.getText().toString().equalsIgnoreCase("1234")) {
            Intent intent = new Intent(this, activity_2.class);
            startActivity(intent);
     //   }
    }
}