package com.moringaschool.musicapp;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class RestaurantsActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MusicActivity> activityTestRule =
            new ActivityTestRule<>(MusicActivity.class);
}
