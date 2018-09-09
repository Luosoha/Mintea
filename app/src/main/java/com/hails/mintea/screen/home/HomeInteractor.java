package com.hails.mintea.screen.home;

import com.gemvietnam.base.viper.Interactor;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class HomeInteractor extends Interactor<HomeContract.Presenter>
        implements HomeContract.Interactor {

  public HomeInteractor(HomeContract.Presenter presenter) {
    super(presenter);
  }

}
