package com.a135.common.Base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MonitoredActivity extends AppCompatActivity {
  private static MonitoredActivity mActivity;
  private static MonitoredActivity mNewlyCreatedActivity;
  protected boolean mIsBeforeResume = true;
  private boolean mInFront;
  private boolean mEverResumed;
  private boolean mPaused;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mNewlyCreatedActivity = this;
    if (mActivity == null || mActivity.isFinishing()) {
      mActivity = this;
    }
    //ActivityUtil.addActivity(this);
  }

  @Override protected void onResume() {
    super.onResume();
    mIsBeforeResume = false;
    mInFront = true;
    mActivity = this;
    if (!mEverResumed) {
      mEverResumed = true;
      onFirstResume();
    }
  }

  protected void onFirstResume() {

  }

  @Override protected void onPause() {
    super.onPause();
    mPaused = true;
    mInFront = false;
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    if (mActivity == this) {
      mActivity = null;
    }
    if (mNewlyCreatedActivity == this) {
      mNewlyCreatedActivity = null;
    }
    //ActivityUtil.destroyActivity(this);
  }

  public boolean isPaused() {
    return mPaused;
  }

  public static MonitoredActivity getCurrent() {
    return mActivity;
  }


  public static MonitoredActivity getNewlyCreated() {
    return mNewlyCreatedActivity;
  }

  public boolean isInFront() {
    return mInFront;
  }
}