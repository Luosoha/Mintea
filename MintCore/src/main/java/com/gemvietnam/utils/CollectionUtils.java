package com.gemvietnam.utils;

import java.util.List;

/**
 * Collection Utils
 * Created by neo on 9/27/2016.
 */

public class CollectionUtils {
  /**
   * Check if list is null or empty
   */
  public static boolean isEmpty(List list) {
    return list == null || list.size() == 0;
  }

  public static<T> boolean isEmpty(T[] arrs) {
    return arrs == null || arrs.length == 0;
  }
}
