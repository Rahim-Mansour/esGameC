package com.rahim.esGameC;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.rahim.esGameC.databinding.ActivityMainBinding;

import static com.rahim.esGameC.SignUpActivity.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setTheme(R.style.Theme_EsGameC_NoActionBar); // before setContentView()
        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(R.layout.activity_main);
        View view = binding.getRoot();
        setContentView(view);

        binding.signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(Intent(this, SignUpActivity::class.java))
//                finish()
                goToSignUpActivity();

            }
        });

        binding.signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSignInActivity();
            }
        });
        binding.signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {goToSignUpActivity();}
        });


    }

    private void goToSignInActivity() {
        Intent intent = new Intent(this, SignInActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "extra msg");
        startActivity(intent);
    }

    private void goToSignUpActivity() {
        Intent intent = new Intent(this, SignUpActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "extra msg");
        startActivity(intent);
    }
}