package com.sanjeev.battleofmesoketes;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import com.sanjeev.battleofmesoketes.Data.InputData;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class BattleActivityTest {

    @Rule
    public ActivityTestRule<BattleActivity> mainActivityActivityTestRule = new ActivityTestRule<BattleActivity>(BattleActivity.class);

    private String result1 = "6";
    private String result2 = "7";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void userInputTestSenario1(){

        Integer[][] testData1 = new InputData().getBattlePoints1();
        //input
        Espresso.onView(withId(R.id.etEast1)).perform(typeText(testData1[0][0]+""));
        Espresso.onView(withId(R.id.etWest1)).perform(typeText(testData1[0][1]+""));
        Espresso.onView(withId(R.id.etSouth1)).perform(typeText(testData1[0][2]+""));
        Espresso.onView(withId(R.id.etNorth1)).perform(typeText(testData1[0][3]+""));

        Espresso.onView(withId(R.id.etEast2)).perform(typeText(testData1[1][0]+""));
        Espresso.onView(withId(R.id.etWest2)).perform(typeText(testData1[1][1]+""));
        Espresso.onView(withId(R.id.etSouth2)).perform(typeText(testData1[1][2]+""));
        Espresso.onView(withId(R.id.etNorth2)).perform(typeText(testData1[1][3]+""));

        Espresso.onView(withId(R.id.etEast3)).perform(typeText(testData1[2][0]+""));
        Espresso.onView(withId(R.id.etWest3)).perform(typeText(testData1[2][1]+""));
        Espresso.onView(withId(R.id.etSouth3)).perform(typeText(testData1[2][2]+""));
        Espresso.onView(withId(R.id.etNorth3)).perform(typeText(testData1[2][3]+""));
        //close softkey
        Espresso.closeSoftKeyboard();
        //performe button click
        Espresso.onView(withId(R.id.btnResult)).perform(click());
        //checking text in text view

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText(result1)));
    }

    @Test
    public void userInputTestSenario2(){

        Integer[][] testData2 = new InputData().getBattlePoints2();
        //input
        Espresso.onView(withId(R.id.etEast1)).perform(typeText(testData2[0][0]+""));
        Espresso.onView(withId(R.id.etWest1)).perform(typeText(testData2[0][1]+""));
        Espresso.onView(withId(R.id.etSouth1)).perform(typeText(testData2[0][2]+""));
        Espresso.onView(withId(R.id.etNorth1)).perform(typeText(testData2[0][3]+""));

        Espresso.onView(withId(R.id.etEast2)).perform(typeText(testData2[1][0]+""));
        Espresso.onView(withId(R.id.etWest2)).perform(typeText(testData2[1][1]+""));
        Espresso.onView(withId(R.id.etSouth2)).perform(typeText(testData2[1][2]+""));
        Espresso.onView(withId(R.id.etNorth2)).perform(typeText(testData2[1][3]+""));

        Espresso.onView(withId(R.id.etEast3)).perform(typeText(testData2[2][0]+""));
        Espresso.onView(withId(R.id.etWest3)).perform(typeText(testData2[2][1]+""));
        Espresso.onView(withId(R.id.etSouth3)).perform(typeText(testData2[2][2]+""));
        Espresso.onView(withId(R.id.etNorth3)).perform(typeText(testData2[2][3]+""));
        //close softkey
        Espresso.closeSoftKeyboard();
        //performe button click
        Espresso.onView(withId(R.id.btnResult)).perform(click());
        //checking text in text view
        Espresso.onView(withId(R.id.tvResult)).check(matches(withText(result2)));
    }


    @After
    public void tearDown() throws Exception {
    }
}