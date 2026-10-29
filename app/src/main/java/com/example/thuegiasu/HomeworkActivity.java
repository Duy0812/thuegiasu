package com.example.thuegiasu;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.tabs.TabLayout;

public class HomeworkActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private Button btnSubmitHomework;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);

        tabLayout = findViewById(R.id.tabLayout);
        btnSubmitHomework = findViewById(R.id.btnSubmitHomework);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {}

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });

        btnSubmitHomework.setOnClickListener(v ->
                Toast.makeText(HomeworkActivity.this, "Mở giao diện nộp bài", Toast.LENGTH_SHORT).show()
        );
    }
}