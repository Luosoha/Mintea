package com.gemvietnam.utils;

import android.app.Activity;
import android.content.Context;

/**
 * Context utils
 * Created by neo on 7/18/2016.
 */
public class ContextUtils {
  /**
   * Check validation of context
   */
  public static boolean isValidContext(Context context) {
    // Context null
    if (context == null) {
      return false;
    }

    // Activity is finishing
    if (context instanceof Activity
        && ((Activity) context).isFinishing()) {
      return false;
    }

    // Otherwise, context is valid to show dialog
    return true;
  }
}
