package com.earlcommunications.savings;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {
private ViewPager screenPager;
IntroViewPagerAdapter introViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        List<Screenitem> mList = new ArrayList<>();
        mList.add(new Screenitem("Fresh Food","Food Food Food Food Food Food",R.drawable.img1));
        mList.add(new Screenitem("Fresh Food","Food Food Food Food Food Food",R.drawable.img2));
        mList.add(new Screenitem("Fresh Food","Food Food Food Food Food Food",R.drawable.img3));

        screenPager=findViewById(R.id.screen_viewpager);
        introViewPagerAdapter=new IntroViewPagerAdapter(this,mList);

        screenPager.setAdapter((introViewPagerAdapter));

    }

}
