package vn.edu.ntu.minhquan_59131988_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate Call");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop Call");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause Call");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart Call");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume Call");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy Call");
    }
}
