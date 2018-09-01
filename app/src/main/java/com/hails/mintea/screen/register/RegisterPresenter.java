package com.hails.mintea.screen.register;

import com.gemvietnam.base.viper.Presenter;
import com.gemvietnam.base.viper.interfaces.ContainerView;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class RegisterPresenter extends Presenter<RegisterContract.View, RegisterContract.Interactor>
        implements RegisterContract.Presenter {

  public RegisterPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public void start() {

  }

  @Override
  public RegisterContract.Interactor onCreateInteractor() {
    return new RegisterInteractor(this);
  }

  @Override
  public RegisterContract.View onCreateView() {
    return new RegisterFragment();
  }

}
