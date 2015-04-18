package com.nishantd.samples.sampleprovider.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.nishantd.samples.sampleprovider.R;


public class ConfigureActivity extends Activity {

    private Button nextButton;
    private Spinner spinner;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_configure);

        nextButton = (Button)findViewById(R.id.next_button);
        editText = (EditText)findViewById(R.id.phone_number);
        spinner = (Spinner)findViewById(R.id.spinner);

        initializeNextButton();

    }

    private void initializeNextButton() {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone_number = editText.getText().toString();
                String country = spinner.getSelectedItem().toString();
                Context context = ConfigureActivity.this;
                SharedPreferences sharedPreferences = context.getSharedPreferences(getString(R.string.preference_file), Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(getString(R.string.phone_number_key), phone_number);
                editor.putString(getString(R.string.country_key), country);
                editor.commit();
            }
        });
    }
}
