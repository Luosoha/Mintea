package com.hails.mintea.screen.welcome;

import com.gemvietnam.base.viper.Presenter;
import com.gemvietnam.base.viper.interfaces.ContainerView;
import com.hails.mintea.screen.login.LoginPresenter;
import com.hails.mintea.screen.register.RegisterPresenter;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class WelcomePresenter extends Presenter<WelcomeContract.View, WelcomeContract.Interactor>
        implements WelcomeContract.Presenter {

    public WelcomePresenter(ContainerView containerView) {
        super(containerView);
    }

    @Override
    public void start() {

    }

    @Override
    public WelcomeContract.Interactor onCreateInteractor() {
        return new WelcomeInteractor(this);
    }

    @Override
    public WelcomeContract.View onCreateView() {
        return new WelcomeFragment();
    }

    @Override
    public void goToLoginScreen() {
        new LoginPresenter(mContainerView).pushView();
    }

    @Override
    public void goToRegisterScreen() {
        new RegisterPresenter(mContainerView).pushView();
    }
}
