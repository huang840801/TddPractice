package com.guanhong.tddpractice

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

@LargeTest
class RegisterTest {

    @Rule
    @JvmField
    val activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun register_success_should_start_RegisterSuccessActivity(){

        onView(withId(R.id.account)).perform(typeText("q1111111"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.password)).perform(typeText("w22222222"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.registerButton)).perform(click())

        onView(withId(R.id.successText)).check(matches(withText("Register Success")))
        onView(withId(R.id.successText)).check(matches(isDisplayed()))
    }
}