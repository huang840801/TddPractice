package com.guanhong.tddpractice

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.RootMatchers.withDecorView
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test

@LargeTest
class RegisterTest {

    @Rule
    @JvmField
    val activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun register_success_should_start_RegisterSuccessActivity() {

        inputCorrectRegisterData()

        clickRegisterButton()

        seeRegisterSuccessView()
    }

    @Test
    fun register_fail_should_see_fail_view() {

        inputWrongRegisterData()

        clickRegisterButton()

        seeRegisterFailView()
    }

    private fun seeRegisterSuccessView() {
        onView(withId(R.id.successText)).check(matches(withText("Register Success")))
        onView(withId(R.id.successText)).check(matches(isDisplayed()))

        onView(withText("註冊成功")).inRoot(withDecorView(not(activityTestRule.activity.window.decorView)))
            .check(
                matches(isDisplayed())
            )
    }

    private fun seeRegisterFailView() {
        onView(withText("註冊失敗")).inRoot(withDecorView(not(activityTestRule.activity.window.decorView)))
            .check(
                matches(isDisplayed())
            )
    }

    private fun inputWrongRegisterData() {
        onView(withId(R.id.account)).perform(typeText("666"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.password)).perform(
            typeText("w22222222"),
            ViewActions.closeSoftKeyboard()
        )
    }

    private fun inputCorrectRegisterData() {
        onView(withId(R.id.account)).perform(typeText("q1111111"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.password)).perform(
            typeText("w22222222"),
            ViewActions.closeSoftKeyboard()
        )
    }

    private fun clickRegisterButton() {
        onView(withId(R.id.registerButton)).perform(click())
    }
}