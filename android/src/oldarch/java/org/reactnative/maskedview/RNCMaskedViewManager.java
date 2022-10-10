package org.reactnative.maskedview;

import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RNCMaskedViewManager extends ViewGroupManager<RNCMaskedView> {

  ReactApplicationContext mCallerContext;

  public RNCMaskedViewManager(ReactApplicationContext reactContext) {
      mCallerContext = reactContext;
  }

  @Override
  public String getName() {
    return RNCMaskedViewManagerImpl.NAME;
  }

  @Override
  protected RNCMaskedView createViewInstance(ThemedReactContext themedReactContext) {
    return RNCMaskedViewManagerImpl.createViewInstance(themedReactContext);
  }

  @ReactProp(name = "androidRenderingMode")
  public void setAndroidRenderingMode(RNCMaskedView view, @Nullable String renderingMode) {
    RNCMaskedViewManagerImpl.setAndroidRenderingMode(view, renderingMode);
  }
}