package com.rahim.esGameC;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.rahim.esGameC.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.rahim.esGameC.MESSAGE";
    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMainActivity();
            }
        });
        binding.signUpChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMainActivity();
            }
        });

        binding.editTextCGender.setAdapter(
                new ArrayAdapter<String>(
                        this,
                        R.layout.item_list_spinner,
                        getResources().getStringArray(R.array.genderArray)
                )
        );
    }

    private void goToMainActivity() {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
        finish();
    }
}