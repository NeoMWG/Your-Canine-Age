package com.example.yourcanineage;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.yourcanineage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCalculateDogAge.setOnClickListener(v -> {
            String age = binding.etEnterYourAge.getText().toString();
            if (!age.isEmpty()) {
                int dogAge = Integer.parseInt(age) * 7;
                String resultCalcDogAge = getString(R.string.result_dog_age_string, dogAge);
                binding.tvDogAgeResult.setText(resultCalcDogAge);
            } else {
                Toast toast = Toast.makeText(this, R.string.you_must_enter_your_age, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 400);
                toast.show();
            }
        });
    }
}