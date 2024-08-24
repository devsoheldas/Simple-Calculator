package com.techsohelbd.projectofspicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;


public class about extends AppCompatActivity {

    ImageView fb,insta,twitter,linkedin,email;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        //Variable initialize
        fb = findViewById(R.id.fb);
        insta = findViewById(R.id.insta);
        twitter = findViewById(R.id.twitter);
        linkedin = findViewById(R.id.linkedin);
        email = findViewById(R.id.email);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Code Here
                String instaLink = "https://www.facebook.com/soheldas.sohel.56/";
                Uri uri = Uri.parse(instaLink);
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }

        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Code Here
                String instaLink = "https://www.threads.net/@soheldas3210";
                Uri uri = Uri.parse(instaLink);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Code Here
                String instaLink = "https://www.threads.net/@soheldas3210";
                Uri uri = Uri.parse(instaLink);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        });
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Code Here
                String instaLink = "https://www.threads.net/@soheldas3210";
                Uri uri = Uri.parse(instaLink);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add Variable
                String EMAIL = "sohelsoheldas3@gmail.com";

                String SUBJECT = "This is Subject";
                String EMAIL_BODY = "sohelsoheldas3@gmail.com";
// Send Email Code
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, EMAIL);
                intent.putExtra(Intent.EXTRA_SUBJECT, SUBJECT);
                intent.putExtra(Intent.EXTRA_TEXT, EMAIL_BODY);
                startActivity(Intent.createChooser(intent, "Send Email"));
            }

        });
}
    }