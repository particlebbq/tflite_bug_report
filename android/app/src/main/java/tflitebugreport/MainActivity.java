package tflitebugreport;

import androidx.annotation.NonNull;

import io.flutter.Log;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.IOException;

import org.tensorflow.lite.flex.FlexDelegate;

public class MainActivity extends FlutterActivity{
    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine){
        GeneratedPluginRegistrant.registerWith(flutterEngine);

        //FlexDelegate.initTensorFlowForTesting();
        Log.i("MainActivity","Made it here!");
        FlexDelegate delegate = new FlexDelegate();
        Log.i("MainActivity","Made it here too!");
    }
}
