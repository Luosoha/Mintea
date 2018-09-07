package com.gemvietnam.widget.loading;

import android.content.Context;
import android.graphics.Color;
import android.widget.RelativeLayout;

/**
 * Created by PhuongDV on 20/07/17.
 * LoadingIndicatorBarView
 */
class LoadingIndicatorBarView extends RelativeLayout {
  private float cornerRadius;

  public LoadingIndicatorBarView(Context context) {
    super(context);
  }

  public LoadingIndicatorBarView(Context context, float cornerRadius) {
    super(context);

    this.cornerRadius = cornerRadius;

    initViews();
  }

  public void initViews() {
    setBackground(ToolBox.roundedCornerRectWithColor(
        Color.argb(255, 255, 255, 255), cornerRadius));

    setAlpha(0.5f);
  }
}