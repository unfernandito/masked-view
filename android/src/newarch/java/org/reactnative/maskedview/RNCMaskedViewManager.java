package org.reactnative.maskedview;

import android.view.View;
import android.widget.Toast;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ReactModule(name = RNCMaskedViewManagerImpl.NAME)
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
    return RNCMaskedViewImpl.createViewInstance(themedReactContext);
  }

  @ReactProp(name = "androidRenderingMode")
  public void setAndroidRenderingMode(RNCMaskedView view, @Nullable String renderingMode) {
    RNCMaskedViewManagerImpl.setAndroidRenderingMode(view, renderingMode);
  }
}
