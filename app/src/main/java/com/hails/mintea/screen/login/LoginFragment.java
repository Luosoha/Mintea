package com.hails.mintea.screen.login;

import com.gemvietnam.base.viper.ViewFragment;
import com.hails.mintea.R;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class LoginFragment extends ViewFragment<LoginContract.Presenter>
        implements LoginContract.View {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
    }

    @Override
    public void initLayout() {
        super.initLayout();
    }
}
