package edu.css.lonnie.favoritecontacts;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnCall, btnText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButtonClickEvents1();
        setupButtonClickEvents2();
        setupButtonClickEvents3();
    }

    private void setupButtonClickEvents1() {
        btnCall = (Button) findViewById(R.id.btnCall1);
        btnText = (Button) findViewById(R.id.btnText1);

        btnText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click

                Spinner mySpinner=(Spinner) findViewById(R.id.spinText1);
                String text = mySpinner.getSelectedItem().toString();

                String number = getString(R.string.phone_1);

                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:" + number));
                sendIntent.putExtra("sms_body", text);

                //check if there is an app to view web pages
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(sendIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (activities.size() > 0) {
                    startActivity(sendIntent);
                }
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                int REQUEST_PHONE_CALL = 1;
                String number = getString(R.string.phone_1);

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));

                //check if there is an app to view web pages
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                }
                else if (activities.size() > 0)
                {
                    startActivity(callIntent);
                }
            }
        });
    }

    private void setupButtonClickEvents2() {
        btnCall = (Button) findViewById(R.id.btnCall2);
        btnText = (Button) findViewById(R.id.btnText2);

        btnText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click

                Spinner mySpinner=(Spinner) findViewById(R.id.spinText2);
                String text = mySpinner.getSelectedItem().toString();

                String number = getString(R.string.phone_2);

                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:" + number));
                sendIntent.putExtra("sms_body", text);

                //check if there is an app to view web pages
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(sendIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (activities.size() > 0) {
                    startActivity(sendIntent);
                }
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                int REQUEST_PHONE_CALL = 1;
                String number = getString(R.string.phone_2);

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));

                //check if there is an app to view web pages
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                }
                else if (activities.size() > 0)
                {
                    startActivity(callIntent);
                }
            }
        });
    }

    private void setupButtonClickEvents3() {
        btnCall = (Button) findViewById(R.id.btnCall3);
        btnText = (Button) findViewById(R.id.btnText3);

        btnText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click

                Spinner mySpinner=(Spinner) findViewById(R.id.spinText3);
                String text = mySpinner.getSelectedItem().toString();

                String number = getString(R.string.phone_3);

                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:" + number));
                sendIntent.putExtra("sms_body", text);

                //check if there is an app to view web pages
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(sendIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (activities.size() > 0) {
                    startActivity(sendIntent);
                }
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                int REQUEST_PHONE_CALL = 1;
                String number = getString(R.string.phone_3);

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));

                //check if there is an app to view web pages
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                }
                else if (activities.size() > 0)
                {
                    startActivity(callIntent);
                }
            }
        });
    }
}
