package rani.kawla;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Login extends AppCompatActivity {

    private Button btnSign, btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnSign = (Button) findViewById(R.id.btn_login);
        btnSignUp = (Button) findViewById(R.id.btn_signup);

        btnSign.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
                Intent intent = new Intent(Login.this, ContentLists.class);
               startActivity(intent);
          }
        });
                btnSignUp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // We normally won't show the welcome slider again in real app
                        // but this is for testing
                        PrefManager prefManager = new PrefManager(getApplicationContext());

                        // make first time launch TRUE
                        prefManager.setFirstTimeLaunch(true);

                        startActivity(new Intent(Login.this, Register.class));
                        finish();
                    }
                });

            }


    }

