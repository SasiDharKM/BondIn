package com.hackomaniacs.bondin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    public void goLogin(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
    public void goSignUp(View view){
        Intent intent = new Intent(this,SignUpActivity.class);
        startActivity(intent);
        finish();
    }
}
