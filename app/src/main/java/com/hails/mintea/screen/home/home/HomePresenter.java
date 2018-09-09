package com.hails.mintea.screen.home.home;

import com.gemvietnam.base.viper.Presenter;
import com.gemvietnam.base.viper.interfaces.ContainerView;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class HomePresenter extends Presenter<HomeContract.View, HomeContract.Interactor>
        implements HomeContract.Presenter {

    public HomePresenter(ContainerView containerView) {
        super(containerView);
    }

    @Override
    public void start() {

    }

    @Override
    public HomeContract.Interactor onCreateInteractor() {
        return new HomeInteractor(this);
    }

    @Override
    public HomeContract.View onCreateView() {
        return new HomeFragment();
    }
}
