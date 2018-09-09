package com.hails.mintea.screen.authenticate;

import com.gemvietnam.base.ContainerActivity;
import com.gemvietnam.base.viper.ViewFragment;
import com.hails.mintea.R;
import com.hails.mintea.screen.authenticate.welcome.WelcomePresenter;

public class AuthenticateActivity extends ContainerActivity {

    @Override
    public ViewFragment onCreateFirstFragment() {
        setTheme(R.style.AppTheme);
        return (ViewFragment) new WelcomePresenter(this).getFragment();
    }
}
