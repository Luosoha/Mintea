package com.hails.mintea.screen.register;

import android.widget.EditText;

import com.gemvietnam.base.viper.ViewFragment;
import com.hails.mintea.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class RegisterFragment extends ViewFragment<RegisterContract.Presenter>
        implements RegisterContract.View {

  @BindView(R.id.edit_text_email)
  EditText mEditTextEmail;
  @BindView(R.id.edit_text_password)
  EditText mEditTextPassword;

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_register;
  }

  @OnClick(R.id.button_create)
  void onCreate() {
    mPresenter.createNewAccount(
            mEditTextEmail.getText().toString(), mEditTextPassword.getText().toString());
  }
}
