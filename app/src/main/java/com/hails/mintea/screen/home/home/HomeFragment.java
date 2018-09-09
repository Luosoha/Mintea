package com.hails.mintea.screen.home.home;

import com.gemvietnam.base.viper.ViewFragment;
import com.hails.mintea.R;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class HomeFragment extends ViewFragment<HomeContract.Presenter>
        implements HomeContract.View {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initLayout() {
        super.initLayout();
    }
}
