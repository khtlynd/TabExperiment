import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.danyhp.mmithb.tabexperiment.TabFragment1;
import com.danyhp.mmithb.tabexperiment.TabFragment2;
import com.danyhp.mmithb.tabexperiment.TabFragment3;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new TabFragment1();
            case 1: return new TabFragment2();
            case 3: return new TabFragment3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
