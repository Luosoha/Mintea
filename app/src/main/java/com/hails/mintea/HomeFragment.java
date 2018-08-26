package com.hails.mintea;

import android.widget.Toast;

import com.gemvietnam.base.viper.ViewFragment;

/**
 * Created by HaiLS on 25/08/2018.
 */

public class HomeFragment extends ViewFragment<HomeContract.Presenter>
        implements HomeContract.View {
  @Override
  protected int getLayoutId() {
    return R.layout.activity_main;
  }

}
