package com.earlcommunications.savings;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 1/11/2020.
 */

public class IntroViewPagerAdapter extends PagerAdapter{
    Context mcontext;
    List<Screenitem> mListScreen;

    public IntroViewPagerAdapter(Context mcontext, List<Screenitem> mListScreen) {
        this.mcontext = mcontext;
        this.mListScreen = mListScreen;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater =(LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutscreen =inflater.inflate(R.layout.layout_screen,null);

        ImageView imgSlide =layoutscreen.findViewById(R.id.intro_image);
        TextView title=layoutscreen.findViewById(R.id.intro_title);
        TextView description=layoutscreen.findViewById(R.id.intro_description);

        title.setText(mListScreen.get(position).getTitle());
        description.setText(mListScreen.get(position).getDescription());
        imgSlide.setImageResource(mListScreen.get(position).getScreenimg());

        container.addView(layoutscreen);
        return layoutscreen;

    }

    @Override
    public int getCount() {
        return mListScreen.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
