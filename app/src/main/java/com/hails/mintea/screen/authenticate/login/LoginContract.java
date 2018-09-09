package com.hails.mintea.screen.authenticate.login;

import com.gemvietnam.base.viper.interfaces.IInteractor;
import com.gemvietnam.base.viper.interfaces.IPresenter;
import com.gemvietnam.base.viper.interfaces.PresentView;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

/**
 * Created by HaiLS on 26/08/2018.
 */

public interface LoginContract {
    interface Interactor extends IInteractor<Presenter> {
    }

    interface View extends PresentView<Presenter> {
        void showError(Task<AuthResult> task);
    }

    interface Presenter extends IPresenter<View, Interactor> {
        void login(String email, String password);
    }
}
