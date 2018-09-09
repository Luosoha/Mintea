package com.hails.mintea.screen.authenticate.register;

import android.support.annotation.NonNull;
import android.widget.Toast;

import com.gemvietnam.base.viper.Presenter;
import com.gemvietnam.base.viper.interfaces.ContainerView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class RegisterPresenter extends Presenter<RegisterContract.View, RegisterContract.Interactor>
        implements RegisterContract.Presenter {

    private FirebaseAuth mAuth;

    public RegisterPresenter(ContainerView containerView) {
        super(containerView);
    }

    @Override
    public void start() {
        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public RegisterContract.Interactor onCreateInteractor() {
        return new RegisterInteractor(this);
    }

    @Override
    public RegisterContract.View onCreateView() {
        return new RegisterFragment();
    }

    @Override
    public void createNewAccount(String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(getViewContext(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getViewContext(), "Success", Toast.LENGTH_SHORT).show();
                            back();
                        } else if (task.getException() != null){
                            Toast.makeText(getViewContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getViewContext(), "Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
