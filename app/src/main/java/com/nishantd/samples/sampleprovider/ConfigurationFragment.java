package com.nishantd.samples.sampleprovider;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConfigurationFragment extends Fragment {


    private Button nextButton;
    private Spinner spinner;
    private EditText editText;

    public ConfigurationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.configure_fragment, container, false);

        nextButton = (Button)mainView.findViewById(R.id.next_button);
        spinner    = (Spinner)mainView.findViewById(R.id.spinner);
        editText   = (EditText)mainView.findViewById(R.id.phone_number);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone_number = editText.getText().toString();
                String country = spinner.getSelectedItem().toString();
                Context context = getActivity();
                SharedPreferences sharedPreferences = context.getSharedPreferences(getString(R.string.preference_file), Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(getString(R.string.phone_number_key), phone_number);
                editor.putString(getString(R.string.country_key), country);
                editor.commit();
            }
        });
        return mainView;
    }
}
