package com.travelshelf;

import android.content.Intent;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import android.net.Uri;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.ComponentName;

public class RNInstagramShareModule extends ReactContextBaseJavaModule {

  private ReactApplicationContext reactContext;
  public RNInstagramShareModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext=reactContext;
  }
  @Override
  public String getName() {
    return "InstagramShare";
  }
  @ReactMethod
  private void createInstagramIntent(String type, String mediaPath){

    // Create the new Intent using the 'Send' action.
        Intent share = new Intent(Intent.ACTION_SEND);
        // Set the MIME type
        share.setPackage("com.instagram.android");
        share.setType(type);
        // Create the URI from the media
        File media = new File(mediaPath);
        Uri uri = Uri.fromFile(media);

        // Add the URI to the Intent.
        share.putExtra(Intent.EXTRA_STREAM, uri);
        // Broadcast the Intent.
        share.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        reactContext.startActivity(share);
    }
}