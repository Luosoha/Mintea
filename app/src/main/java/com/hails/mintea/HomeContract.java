package com.hails.mintea;

import com.gemvietnam.base.viper.interfaces.IInteractor;
import com.gemvietnam.base.viper.interfaces.IPresenter;
import com.gemvietnam.base.viper.interfaces.PresentView;

/**
 * Created by HaiLS on 25/08/2018.
 */

public interface HomeContract {
  interface Interactor extends IInteractor<Presenter> {

  }

  interface View extends PresentView<Presenter> {

  }

  interface Presenter extends IPresenter<View, Interactor> {

  }
}
