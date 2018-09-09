package com.hails.mintea.screen.home;

import com.gemvietnam.base.viper.interfaces.IInteractor;
import com.gemvietnam.base.viper.interfaces.IPresenter;
import com.gemvietnam.base.viper.interfaces.PresentView;

/**
 * Created by HaiLS on 26/08/2018.
 */

public interface HomeContract {
    interface Interactor extends IInteractor<Presenter> {

    }

    interface View extends PresentView<Presenter> {

    }

    interface Presenter extends IPresenter<View, Interactor> {

    }
}
