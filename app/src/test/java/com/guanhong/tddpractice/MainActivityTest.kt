package com.guanhong.tddpractice

import android.os.Build
import junit.framework.Assert.assertEquals
import kotlinx.android.synthetic.main.activity_main.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.MockitoAnnotations
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows
import org.robolectric.annotation.Config

@Config(sdk = [Build.VERSION_CODES.O_MR1])
@RunWith(RobolectricTestRunner::class)
class MainActivityTest {

    private lateinit var activity: MainActivity

    @Before
    fun setupActivity() {

        MockitoAnnotations.initMocks(this)

        activity = Robolectric.buildActivity(MainActivity::class.java).setup().get()
    }

    @Test
    fun registerSuccessShouldDirectToRegisterSuccessActivity() {

        val shadowActivity = Shadows.shadowOf(activity)

        val account = "A1234567890"
        val password = "A1234567890"

        activity.account.setText(account)
        activity.password.setText(password)
        activity.registerButton.performClick()

        val nextIntent = shadowActivity.nextStartedActivity

        assertEquals(nextIntent.component?.className, RegisterSuccessActivity::class.java)
        assertEquals(1, nextIntent.extras?.size())
        assertEquals(account, nextIntent.extras?.getString("ACCOUNT"))
    }
}