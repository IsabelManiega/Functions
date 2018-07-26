package com.functions;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryExam extends FragmentPagerAdapter {
    /** Context of the app */
    private Context mContext;

    public CategoryExam(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.test1);
        } else {
            return mContext.getString(R.string.test2);
        }
    }

    public CategoryExam(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Exam1Fragment();
        } else {
            return new Exam2Fragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
