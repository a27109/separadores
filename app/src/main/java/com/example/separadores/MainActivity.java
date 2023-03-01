package com.example.separadores;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager.setAdapter(createAdapter());
        new TabLayoutMediator(tabLayout, viewPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        if (position == 0)
                            tab.setText("Apresentação");
                        else if (position == 1)
                            tab.setText("Desenvolvimento");
                        else
                            tab.setText("Conversa");
                    }
                }).attach();
    }
    private ViewPagerAdapter createAdapter() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        return adapter;
    }
}