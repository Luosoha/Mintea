package com.gemvietnam.widget.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.RelativeLayout;

import java.util.ArrayList;

/**
 * Created by PhuongDV on 20/07/17.
 * LoadingIndicatorView
 */
public class LoadingIndicatorView extends RelativeLayout {

  private static final int NUMBER_OF_BAR = 12;

  public ArrayList<LoadingIndicatorBarView> arrBars;

  public float radius;

  private boolean isAnimating;
  private int currentFrame;

  private final Handler handler = new Handler();
  private Runnable playFrameRunnable;

  public LoadingIndicatorView(Context context) {
    this(context, null);
  }

  public LoadingIndicatorView(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public LoadingIndicatorView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr, 0);
    int[] attrsArray = new int[] {
        android.R.attr.layout_width, // 0
        android.R.attr.layout_height // 1
    };
    TypedArray ta = context.obtainStyledAttributes(attrs, attrsArray);
    int layout_width = ta.getDimensionPixelSize(0, RelativeLayout.LayoutParams.MATCH_PARENT);
    int layout_height = ta.getDimensionPixelSize(1, RelativeLayout.LayoutParams.MATCH_PARENT);
    radius = Math.min(layout_width, layout_height) / 2;
    ta.recycle();

    initViews();
    initLayouts();
    addViews();
    spreadBars();
  }

  public void initViews() {
    arrBars = new ArrayList<>();

    for (int i = 0; i < NUMBER_OF_BAR; i++) {
      LoadingIndicatorBarView bar = new LoadingIndicatorBarView(getContext(), radius / 10.0f);

      arrBars.add(bar);
    }
  }

  public void initLayouts() {
    for (LoadingIndicatorBarView loadingIndicatorBarView : arrBars) {
      loadingIndicatorBarView.setId(View.generateViewId());

      RelativeLayout.LayoutParams barLayoutParams = new RelativeLayout.LayoutParams(
          (int) (radius / 5.0f),
          (int) (radius / 2.0f)
      );

      barLayoutParams.addRule(ALIGN_PARENT_TOP);
      barLayoutParams.addRule(CENTER_HORIZONTAL);

      loadingIndicatorBarView.setLayoutParams(barLayoutParams);
    }
  }

  public void addViews() {
    for (LoadingIndicatorBarView loadingIndicatorBarView : arrBars) {
      addView(loadingIndicatorBarView);
    }
  }

  public void spreadBars() {
    int degrees = 0;

    for (LoadingIndicatorBarView loadingIndicatorBarView : arrBars) {
      rotateBar(loadingIndicatorBarView, degrees);
      degrees += 360 / NUMBER_OF_BAR;
    }
  }

  private void rotateBar(LoadingIndicatorBarView bar, float degrees) {
    RotateAnimation animation = new RotateAnimation(0, degrees, radius / 10.0f, radius);
    animation.setDuration(0);
    animation.setFillAfter(true);

    bar.setAnimation(animation);
    animation.start();
  }

  public void startAnimating() {
    setAlpha(1.0f);

    isAnimating = true;

    playFrameRunnable = new Runnable() {
      @Override
      public void run() {
        playFrame();
      }
    };

    // recursive function until isAnimating is false
    playFrame();
  }

  public void stopAnimating() {
    isAnimating = false;

    setAlpha(0.0f);

    invalidate();

    playFrameRunnable = null;
  }

  private void playFrame() {
    if (isAnimating) {
      resetAllBarAlpha();
      updateFrame();

      handler.postDelayed(playFrameRunnable, 100);
    }
  }

  private void updateFrame() {
    if (isAnimating) {
      showFrame(currentFrame);
      currentFrame = (currentFrame + 1) % NUMBER_OF_BAR;
    }
  }

  private void resetAllBarAlpha() {
    for (LoadingIndicatorBarView loadingIndicatorBarView : arrBars) {
      loadingIndicatorBarView.setAlpha(0.5f);
    }
  }

  private void showFrame(int frameNumber) {
    int[] indexes = new int[]{(frameNumber + NUMBER_OF_BAR) % NUMBER_OF_BAR,
        (frameNumber + NUMBER_OF_BAR - 1) % NUMBER_OF_BAR,
        (frameNumber + NUMBER_OF_BAR - 2) % NUMBER_OF_BAR,
        (frameNumber + NUMBER_OF_BAR - 3) % NUMBER_OF_BAR};

    gradientColorBarSets(indexes);
  }

  private void gradientColorBarSets(int[] indexes) {
    float alpha = 1.0f;

    for (int index : indexes) {
      arrBars.get(index).setAlpha(alpha);
      alpha -= 0.125;
    }

    invalidate();
  }
}