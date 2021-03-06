package com.example.testlifecycleapplication;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


import org.junit.Rule;
import org.junit.Test;


// CameraActivityInstrumentationTest.java
public class CameraActivityInstrumentationTest {

    // IntentsTestRule is an extension of ActivityTestRule. IntentsTestRule sets up Espresso-Intents
    // before each Test is executed to allow stubbing and validation of intents.
    @Rule
    public IntentsTestRule<CameraActivity> intentsRule = new IntentsTestRule<>(CameraActivity.class);

    @Test
    public void validateCameraScenario() {
        // Create a bitmap we can use for our simulated camera image
        Bitmap icon = BitmapFactory.decodeResource(
                InstrumentationRegistry.getTargetContext().getResources(),
                R.mipmap.ic_launcher);

        // Build a result to return from the Camera app
        Intent resultData = new Intent();
        resultData.putExtra("data", icon);
        Instrumentation.ActivityResult result = new Instrumentation.ActivityResult(Activity.RESULT_OK, resultData);

        // Stub out the Camera. When an intent is sent to the Camera, this tells Espresso to respond 
        // with the ActivityResult we just created
        intending(toPackage("com.android.camera2")).respondWith(result);

        // Now that we have the stub in place, click on the button in our app that launches into the Camera
        onView(withId(R.id.btnTakePicture)).perform(click());

        // We can also validate that an intent resolving to the "camera" activity has been sent out by our app
        intended(toPackage("com.android.camera2"));

        // ... additional test steps and validation ...
    }

    private Object intending(Object toPackage) {
    }

    private void intended(Object toPackage) {
    }

    private Object toPackage(String s) {
    }
}
