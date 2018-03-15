/**@author  Haining
 *@function Espresso test
 */
package com.acme.a3csci3130;

import com.firebase.ui.database.FirebaseListAdapter;

import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
/**
 * Created by 18731 on 2018/3/15.
 */

public class Espresso {
    @Test
    public void Create(){
        onView(withId(R.id.submitButton1)).perform(click());
        onView(withId(R.id.businessnumber)).perform(typeText("123456789"));
        onView(withId(R.id.name)).perform(typeText("HYU"));
        onView(withId(R.id.primarybusiness)).perform(typeText("Fisher"));
        onView(withId(R.id.address)).perform(typeText("123"));
        onView(withId(R.id.provinceterritory)).perform(typeText("NS"));
        onView(withId(R.id.submitButton)).perform(click());
        onView(withId(R.id.listView)).check(matches(withText("HYU")));

    }
    @Test
    public void Update(){
        onView(withId(R.id.listView)).perform(click());
        onView(withId(R.id.address)).perform(typeText("456"));
        onView(withId(R.id.updateButton)).perform(click());
        onView(withId(R.id.name1)).check(matches(withText("HYU")));

    }
    @Test
    public void Delete(){
        onView(withId(R.id.deleteButton)).perform(click());
        onView(withId(R.id.listView)).check(matches(withText("")));
    }
}
