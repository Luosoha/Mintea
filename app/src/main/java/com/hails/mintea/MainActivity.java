package com.hails.mintea;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.gemvietnam.base.ContainerActivity;
import com.gemvietnam.base.viper.ViewFragment;
import com.hails.mintea.screen.welcome.WelcomePresenter;

public class MainActivity extends ContainerActivity {

    @Override
    public ViewFragment onCreateFirstFragment() {
        setTheme(R.style.AppTheme);
        return (ViewFragment) new WelcomePresenter(this).getFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {

        super.onCreate(savedInstanceState, persistentState);
    }
}
