package com.hails.mintea.screen.login;

import android.widget.EditText;

import com.gemvietnam.base.viper.ViewFragment;
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
}
