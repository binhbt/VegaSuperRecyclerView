package com.malinskiy.superrecyclerview.sample;

import android.support.v7.widget.LinearLayoutManager;

/**
 * Created by binhbt on 6/29/2016.
 */
public class VegaGridVerticalActivity extends VegaBaseActivity{
    @Override
    protected int getLayoutId() {
        return R.layout.vega_activity_grid_vertical;
    }

    @Override
    protected boolean isSwipeToDismissEnabled() {
        return false;
    }

    @Override
    protected LinearLayoutManager getLayoutManager() {
        return null;
    }
}
