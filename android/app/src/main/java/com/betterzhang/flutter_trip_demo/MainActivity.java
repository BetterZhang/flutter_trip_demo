package com.betterzhang.flutter_trip_demo;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import org.devio.flutter.splashscreen.flutter_splash_screen.SplashScreen;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    SplashScreen.show(this, true);
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);
  }
}
