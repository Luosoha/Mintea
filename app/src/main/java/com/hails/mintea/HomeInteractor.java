package com.hails.mintea;

import com.gemvietnam.base.viper.Interactor;

/**
 * Created by HaiLS on 25/08/2018.
 */

public class HomeInteractor extends Interactor<HomeContract.Presenter>
        implements HomeContract.Interactor {
  public HomeInteractor(HomePresenter presenter) {
    super(presenter);
  }
}
