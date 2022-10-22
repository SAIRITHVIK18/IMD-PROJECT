package com.example.imd;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class MainActivity3 extends AppCompatActivity {

    private EditText address;
    private EditText pincode;
    private EditText City;
    private EditText language;
    Button button;

    ImageButton imgbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        /*address = findViewById(R.id.addressinputtext);
        pincode = findViewById(R.id.pincodetext);
        City = findViewById(R.id.citytext);
        language = findViewById(R.id.lantext);

        button = findViewById(R.id.savebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getaddress = address.getText().toString();
                String getpincode = pincode.getText().toString();
                String getcity = City.getText().toString();
                String getlanguage = City.getText().toString();

                HashMap<String,Object> hashMap = new HashMap<>();
                hashMap.put("Address",getaddress);
                hashMap.put("Pincode",getpincode);
                hashMap.put("City",getcity);
                hashMap.put("Language",getlanguage);

                FirebaseFirestore.getInstance().collection("User")
                        .document("UserData")
                        .set(hashMap)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(MainActivity3.this,"Data saved Successfully", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(MainActivity3.this,""+e.getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        });

            }
        });


        imgbutton = (ImageButton) findViewById(R.id.imageButton3);
        imgbutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        }));
        imgbutton = (ImageButton) findViewById(R.id.imageButton4);
        imgbutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,MainActivity5.class);
                startActivity(intent);
            }
        }));*/
    }
}