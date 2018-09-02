package com.hails.mintea.screen.welcome;

import android.view.View;
import android.widget.Button;

import com.gemvietnam.base.viper.ViewFragment;
import com.hails.mintea.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class WelcomeFragment extends ViewFragment<WelcomeContract.Presenter>
        implements WelcomeContract.View {

    @BindView(R.id.button_login)
    Button mButtonLogin;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_welcome;
    }

    @Override
    public void initLayout() {
        super.initLayout();
    }

    @OnClick(R.id.button_login)
    void onLoginClick() {
        mPresenter.goToLoginScreen();
    }

    @OnClick(R.id.button_register)
    void onRegisterClick() {
        mPresenter.goToRegisterScreen();
    }
}
