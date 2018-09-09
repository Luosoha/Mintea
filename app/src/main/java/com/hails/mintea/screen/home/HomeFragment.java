package com.hails.mintea.screen.home;

import android.widget.Button;

import com.gemvietnam.base.viper.ViewFragment;
import com.hails.mintea.R;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Optional;

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
