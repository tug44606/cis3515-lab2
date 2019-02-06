package com.temple.edu.signupform;

import android.content.Context;
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


        saveInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Test
                System.out.println("Button has been clicked");

                // Getting user information
                EditText emailAddress = findViewById(R.id.emailAddress);
                System.out.println(emailAddress);
                EditText username = findViewById(R.id.username);
                System.out.println(username);
                EditText password = findViewById(R.id.password);
                System.out.println(password);
                EditText passConfirmation = findViewById(R.id.passwordconfirm);
                System.out.println(passConfirmation);

                // Converting text to strings
                String emailAddressS = emailAddress.getText().toString();
                System.out.println(emailAddressS);
                String usernameS = username.getText().toString();
                System.out.println(usernameS);
                String passwordS = password.getText().toString();
                System.out.println(passwordS);
                String passConfirmationS = passConfirmation.getText().toString();
                System.out.println(passConfirmationS);

                // If any empty fields
                if((emailAddressS.isEmpty() && usernameS.isEmpty() && passwordS.isEmpty() && passConfirmationS.isEmpty()) == true){
                    // Display toast
                    Context c = getApplicationContext();
                    Toast.makeText(c, "Please enter all fields!", Toast.LENGTH_SHORT).show();
                }
                // If passwords don't match
                else if(!(passwordS.equals(passConfirmationS))){
                    // Display toast
                    Context c = getApplicationContext();
                    Toast.makeText(c, "Passwords do not match!", Toast.LENGTH_SHORT).show();
                }
                // Default
                else{
                    // Display toast
                    Context c = getApplicationContext();
                    Toast.makeText(c, "Welcome, " + usernameS + ", to the SignUp Form App!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
