package com.hails.mintea.screen.register;

import com.gemvietnam.base.viper.ViewFragment;
import com.hails.mintea.R;

/**
 * Created by HaiLS on 26/08/2018.
 */

public class RegisterFragment extends ViewFragment<RegisterContract.Presenter>
        implements RegisterContract.View {

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_register;
  }

}
