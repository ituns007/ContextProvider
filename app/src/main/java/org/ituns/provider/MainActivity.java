package org.ituns.provider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import org.ituns.android.provider.iTunsProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast();
    }

    private void showToast() {
        Context context = iTunsProvider.applicationContext;
        Toast.makeText(context, context.getPackageName(), Toast.LENGTH_LONG).show();
    }
}
