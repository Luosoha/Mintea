package com.hails.mintea;

import com.gemvietnam.base.viper.Presenter;
import com.gemvietnam.base.viper.interfaces.ContainerView;

/**
 * Created by HaiLS on 25/08/2018.
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
  public HomeInteractor onCreateInteractor() {
    return new HomeInteractor(this);
  }

  @Override
  public HomeFragment onCreateView() {
    return new HomeFragment();
  }
}
