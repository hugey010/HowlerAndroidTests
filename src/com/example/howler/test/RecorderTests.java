package com.example.howler.test;

import java.lang.reflect.Method;

import com.example.howler.FriendsListFragment;
import com.example.howler.RecorderActivity;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.speech.RecognizerResultsIntent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ActivityUnitTestCase;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class RecorderTests extends ActivityUnitTestCase<RecorderActivity> {
	
	private static String TAG = "RecorderTests";

	public RecorderTests() {
		super(RecorderActivity.class);
	}

	public void testViewClicks() {
		
		// launch recorder activity
		Intent launchIntent = new Intent(getInstrumentation().getTargetContext(), RecorderActivity.class);
		startActivity(launchIntent, null, null);
		RecorderActivity activity = getActivity();
		assertNotNull(activity);
		
		// friends list
		activity.onClick(activity.findViewById(com.example.howler.R.id.friends_button));
		Intent intent = getStartedActivityIntent();
		// should have fired intent to launch friends list
		assertNotNull(intent);
		// assert finish not called becuase activity should resume
		assertFalse(isFinishCalled());
		
		// message list
		activity.onClick(activity.findViewById(com.example.howler.R.id.message_list_button));
		intent = getStartedActivityIntent();
		// should have fired intent to launch friends list
		assertNotNull(intent);
		// assert finish not called becuase activity should resume
		assertFalse(isFinishCalled());
		
	}
	
	
	public void testRecorder() {
		// launch recorder activity
		Intent launchIntent = new Intent(getInstrumentation().getTargetContext(), RecorderActivity.class);
		startActivity(launchIntent, null, null);
		RecorderActivity activity = getActivity();
		assertNotNull(activity);
				
		
		
		TextView textView = (TextView) activity.findViewById(com.example.howler.R.id.enter_title);
		textView.setText("test123");
		
		activity.onClick(activity.findViewById(com.example.howler.R.id.record_button));
		activity.onClick(activity.findViewById(com.example.howler.R.id.record_button));
		
		//activity.onClick(activity.findViewById(com.example.howler.R.id.record_button));
		activity.onClick(activity.findViewById(com.example.howler.R.id.delete_button));
		
		assertTrue(textView.getText().length() == 0);

		
		//activity.is
		
	}
}
