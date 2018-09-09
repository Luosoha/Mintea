package com.hails.mintea.screen.authenticate.login;

import com.gemvietnam.base.viper.Interactor;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class LoginInteractor extends Interactor<LoginContract.Presenter>
        implements LoginContract.Interactor {

  public LoginInteractor(LoginContract.Presenter presenter) {
    super(presenter);
  }

}
