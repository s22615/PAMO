package com.example.pamo2;

import com.example.pamo2.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class DashboardFragmentEspressoTest {
    public static final String weightString = "90";
    public static final String heightString = "190";

    public static final String resultInfo = "Your BMI: 24.93";

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void changeText_SameActivity(){
        onView(withId(R.id.weightTextField)).perform(typeText(weightString), closeSoftKeyboard());
        onView(withId(R.id.heightTextField)).perform(typeText(heightString), closeSoftKeyboard());
        onView(withId(R.id.calculateButton)).perform(click());

        onView(withId(R.id.resultInfoBox)).check(matches(resultInfo), closeSoftKeyboard());
    }
}
