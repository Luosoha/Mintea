package com.gemvietnam.widget.loading;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.widget.TextView;

import com.gemvietnam.common.R;

/**
 * Created by PhuongDV on 20/07/17.
 * LoadingDialog
 */
public class LoadingDialog extends Dialog {
  private LoadingIndicatorView mProgressSpinner;
  private TextView mMessageTv;

  private LoadingDialog(Context context) {
    super(context, android.R.style.Theme_Translucent_NoTitleBar);
    setContentView(R.layout.layout_loading_progress);
    getWindow().setGravity(Gravity.CENTER);
    mProgressSpinner = (LoadingIndicatorView) findViewById(R.id.loading_dialog_progress_spinner);
    mMessageTv = (TextView) findViewById(R.id.loading_dialog_message_tv);
  }

  public static LoadingDialog show(Activity activity, String string) {
    LoadingDialog progress = new LoadingDialog(activity);
    progress.setCancelable(true);
    progress.setMessage(string);
    progress.setOnCancelListener(null);
    progress.setCanceledOnTouchOutside(false);
    progress.show();
    return progress;
  }

  private void setMessage(String string) {
    mMessageTv.setText(string);
  }

  @Override
  protected void onStart() {
    super.onStart();
    mProgressSpinner.startAnimating();
  }

  @Override
  protected void onStop() {
    mProgressSpinner.stopAnimating();
    super.onStop();
  }
}
