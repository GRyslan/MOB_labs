package ua.kpi.comsys.iv8305;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import ua.kpi.comsys.iv8305.ui.main.SectionsPagerAdapter;

public class Lab1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        tabs.getTabAt(0).setIcon(R.drawable.ic_action_general);
        tabs.getTabAt(1).setIcon(R.drawable.ic_action_drawing);
        tabs.getTabAt(2).setIcon(R.drawable.ic_action_book_list);
        tabs.getTabAt(3).setIcon(R.drawable.ic_action_image_list);
    }
}