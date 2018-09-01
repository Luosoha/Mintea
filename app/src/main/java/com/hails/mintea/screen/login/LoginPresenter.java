package com.hails.mintea.screen.login;

import com.gemvietnam.base.viper.Presenter;
import com.gemvietnam.base.viper.interfaces.ContainerView;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class LoginPresenter extends Presenter<LoginContract.View, LoginContract.Interactor>
        implements LoginContract.Presenter {

  public LoginPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public void start() {

  }

  @Override
  public LoginContract.Interactor onCreateInteractor() {
    return new LoginInteractor(this);
  }

  @Override
  public LoginContract.View onCreateView() {
    return new LoginFragment();
  }

}
