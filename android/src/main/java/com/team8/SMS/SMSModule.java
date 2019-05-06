package com.team8.SMS;

import android.telephony.SmsManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.HashMap;
import java.util.Map;

public class SMSModule extends ReactContextBaseJavaModule {

  public SMSModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "SendAndroidSMS";
  }

  @ReactMethod
  public void sendMessage(String message, String PhoneNumber, Callback successCallback, Callback errorCallback ) {
    try {
      SmsManager smgr = SmsManager.getDefault();
      smgr.sendTextMessage(PhoneNumber, null, message, null, null);
      successCallback.invoke();
    } catch ( Exception e ) {
      errorCallback.invoke(e.getMessage());
    }
  }
}