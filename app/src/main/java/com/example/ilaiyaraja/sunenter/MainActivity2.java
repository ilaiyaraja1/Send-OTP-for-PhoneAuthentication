package com.example.ilaiyaraja.sunenter;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {

    EditText eemail;
    Button sendlink;
    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
       eemail=findViewById(R.id.editTextTextEmailAddress);
        sendlink=findViewById(R.id.button);
        sendlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email=eemail.getText().toString();
                if (email==null){
                    Toast.makeText(getApplicationContext()," Error error",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), email, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}