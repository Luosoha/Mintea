package com.hails.mintea;

import com.gemvietnam.base.ContainerActivity;
import com.gemvietnam.base.viper.ViewFragment;

public class MainActivity extends ContainerActivity {

  @Override
  public ViewFragment onCreateFirstFragment() {
    return (ViewFragment) new HomePresenter(this).getFragment();
  }

}
