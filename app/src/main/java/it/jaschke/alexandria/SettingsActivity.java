package it.jaschke.alexandria;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by F3838284 on 2016/01/11.
 */
public class SettingsActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);


    }
}
