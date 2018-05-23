package io.github.rajkumaar23.mycoimbatore;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NatureFragment();
        } else if (position == 1) {
            return new TemplesFragment();
        } else if (position == 2) {
            return new MuseumFragment();
        } else {
            return new EntertainFragment();
        }

    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_nature);
        } else if (position == 1) {
            return mContext.getString(R.string.category_temples);
        } else if (position == 2) {
            return mContext.getString(R.string.category_museum);
        } else {
            return mContext.getString(R.string.category_entertain);
        }
    }
}
