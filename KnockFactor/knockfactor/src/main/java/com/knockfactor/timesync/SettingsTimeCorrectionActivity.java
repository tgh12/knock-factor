/*
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.knockfactor.timesync;

import android.os.Bundle;

import com.knockfactor.testability.TestablePreferenceActivity;
import com.knockfactor2.R;

/**
 * Activity that displays the "Time correction" preferences.
 *
 * @author klyubin@google.com (Alex Klyubin)
 */
public class SettingsTimeCorrectionActivity extends TestablePreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences_time_correction);
    }
}