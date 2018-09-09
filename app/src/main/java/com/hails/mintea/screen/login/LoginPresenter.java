package com.hails.mintea.screen.login;

import android.support.annotation.NonNull;
import android.widget.Toast;

import com.gemvietnam.base.viper.Presenter;
import com.gemvietnam.base.viper.interfaces.ContainerView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.hails.mintea.screen.home.HomePresenter;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class LoginPresenter extends Presenter<LoginContract.View, LoginContract.Interactor>
        implements LoginContract.Presenter {

    private FirebaseAuth mAuth;

    public LoginPresenter(ContainerView containerView) {
        super(containerView);
    }

    @Override
    public void start() {
        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void login(String email, String password) {
        mView.showProgress();
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(getViewContext(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            new HomePresenter(mContainerView).pushView();
                        } else {
                            mView.showError(task);
                        }
                        mView.hideProgress();
                    }
                });
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
