package com.malinskiy.superrecyclerview.sample;

import android.support.v7.widget.LinearLayoutManager;

/**
 * Created by binhbt on 6/28/2016.
 */
public class VegaListHorizontalActivity extends VegaBaseActivity{
    @Override
    protected int getLayoutId() {
        return R.layout.vega_activity_list_horizontal;
    }

    @Override
    protected boolean isSwipeToDismissEnabled() {
        return false;
    }

    @Override
    protected LinearLayoutManager getLayoutManager() {
        return new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
    }
}
