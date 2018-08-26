package com.gemvietnam;

/**
 * Common constants
 * Created by neo on 7/18/2016.
 */
public interface Constants {
  String EMPTY_STRING = "";
  String GOOGLE_MAP_GEOCODE_URL = "http://maps.google.com/maps/api/geocode/";
  String GOOGLE_API_URL = "https://www.googleapis.com/";
  String OAUTH2_API_URL = "https://login.microsoftonline.com/common/oauth2/v2.0/";
  String ONEDRIVE_API_URL = "https://apis.live.net/v5.0/";
  String API_DROPBOX_URL = "https://api.dropboxapi.com/2-beta-2/";
  String DROPBOX_API_PADDING = "Bearer ";
  int SCHEDULER_PERIODICITY = 10 * 60; // unit seconds
  int SCHEDULER_TOLERANCE_INTERVAL = 1 * 60; // unit seconds

  int END_OF_DAY_HOUR = 17;
  int END_OF_DAY_MINUTES = 30;
  int END_OF_DAY_SECONDS = 0;
}
