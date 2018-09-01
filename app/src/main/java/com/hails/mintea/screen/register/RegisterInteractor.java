package com.hails.mintea.screen.register;

import com.gemvietnam.base.viper.Interactor;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class RegisterInteractor extends Interactor<RegisterContract.Presenter>
        implements RegisterContract.Interactor {

  public RegisterInteractor(RegisterContract.Presenter presenter) {
    super(presenter);
  }

}
