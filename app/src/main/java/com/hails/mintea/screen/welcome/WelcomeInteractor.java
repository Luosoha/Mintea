package com.hails.mintea.screen.welcome;

import com.gemvietnam.base.viper.Interactor;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class WelcomeInteractor extends Interactor<WelcomeContract.Presenter>
        implements WelcomeContract.Interactor {

  public WelcomeInteractor(WelcomeContract.Presenter presenter) {
    super(presenter);
  }

}
