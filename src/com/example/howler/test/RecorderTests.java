package com.example.howler.test;

import com.example.howler.RecorderActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class RecorderTests extends ActivityInstrumentationTestCase2<RecorderActivity> {
	
	private static String TAG = "RecorderTests";

	public RecorderTests() {
		super(RecorderActivity.class);
	}

	
	public void testShit() {
		Log.wtf(TAG, "testingshit");
	}
}
