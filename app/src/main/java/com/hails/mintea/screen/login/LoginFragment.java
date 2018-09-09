package com.hails.mintea.screen.login;

import android.widget.EditText;
import android.widget.Toast;

import com.gemvietnam.base.viper.ViewFragment;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.hails.mintea.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class LoginFragment extends ViewFragment<LoginContract.Presenter>
        implements LoginContract.View {

    @BindView(R.id.edit_text_email)
    EditText mEditTextEmail;
    @BindView(R.id.edit_text_password)
    EditText mEditTextPassWord;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
    }

    @Override
    public void initLayout() {
        super.initLayout();
    }

    @OnClick(R.id.button_login)
    void onLoginClick() {
        mPresenter.login(mEditTextEmail.getText().toString(), mEditTextPassWord.getText().toString());
    }

    @Override
    public void showError(Task<AuthResult> task) {
        if (task.getException() != null) {
            Toast.makeText(getViewContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getViewContext(), getString(R.string.error_login), Toast.LENGTH_SHORT).show();
        }
    }
}
