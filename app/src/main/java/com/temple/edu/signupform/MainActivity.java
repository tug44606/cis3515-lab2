package com.temple.edu.signupform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // For click event to save info
        Button saveInfo = findViewById(R.id.button);

        // Getting user information
        EditText email = findViewById(R.id.email);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        EditText passConfirmation = findViewById(R.id.passwordconfirm);

        // Converting text to strings
        final String emailS = email.getText().toString();
        final String usernameS = username.getText().toString();
        final String passwordS = password.getText().toString();
        final String passConfirmationS = passConfirmation.getText().toString();
    }
}
