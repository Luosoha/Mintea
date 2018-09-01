package com.hails.mintea;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.gemvietnam.base.ContainerActivity;
import com.gemvietnam.base.viper.ViewFragment;
import com.hails.mintea.screen.login.LoginPresenter;

public class MainActivity extends ContainerActivity {

  @Override
  public ViewFragment onCreateFirstFragment() {
    return (ViewFragment) new LoginPresenter(this).getFragment();
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
    setTheme(R.style.AppTheme);
    super.onCreate(savedInstanceState, persistentState);
  }
}
