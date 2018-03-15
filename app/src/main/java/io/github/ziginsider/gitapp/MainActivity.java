package io.github.ziginsider.gitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: I'm FEATURE branch 1 !");
        Log.d(TAG, "onCreate: I'm FEATURE branch 2 !");
        Log.d(TAG, "onCreate: I'm FEATURE branch 3 !");
        Log.d(TAG, "onCreate: I'm FEATURE branch 4 !");
        Log.d(TAG, "onCreate: I'm FEATURE branch 5 !");
    }
}
