package tictactoe.droidrank.com.tictactoe

import android.support.test.InstrumentationRegistry.getInstrumentation
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import tictactoe.droidrank.com.tictactoe.infrastruture.Delay
import tictactoe.droidrank.com.tictactoe.presentation.tictactoe.MainActivity


@RunWith(AndroidJUnit4::class)
@LargeTest
class TicTacToePossibilities: Delay() {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun column1Player1() {
        onView(withId(R.id.bt_restart_game)).perform(click())
        onView(withId(R.id.bt_block0)).perform(click())
        onView(withId(R.id.bt_block1)).perform(click())
        onView(withId(R.id.bt_block3)).perform(click())
        onView(withId(R.id.bt_block4)).perform(click())
        onView(withId(R.id.bt_block6)).perform(click())

        onView(withId(R.id.tv_show_result))
            .check(matches(withText(activityRule.activity.getString(R.string.player_wins, 1))))
    }

    @Test
    fun column2Player2() {
        onView(withId(R.id.bt_restart_game)).perform(click())
        onView(withId(R.id.bt_block0)).perform(click())
        onView(withId(R.id.bt_block1)).perform(click())
        onView(withId(R.id.bt_block3)).perform(click())
        onView(withId(R.id.bt_block4)).perform(click())
        onView(withId(R.id.bt_block2)).perform(click())
        onView(withId(R.id.bt_block7)).perform(click())


        onView(withId(R.id.tv_show_result))
            .check(matches(withText(activityRule.activity.getString(R.string.player_wins, 2))))
    }

    @Test
    fun column3Player1() {
        onView(withId(R.id.bt_restart_game)).perform(click())
        onView(withId(R.id.bt_block2)).perform(click())
        onView(withId(R.id.bt_block1)).perform(click())
        onView(withId(R.id.bt_block5)).perform(click())
        onView(withId(R.id.bt_block4)).perform(click())
        onView(withId(R.id.bt_block8)).perform(click())

        onView(withId(R.id.tv_show_result))
            .check(matches(withText(activityRule.activity.getString(R.string.player_wins, 1))))
    }

    @Test
    fun line1Player1() {
        onView(withId(R.id.bt_restart_game)).perform(click())
        onView(withId(R.id.bt_block0)).perform(click())
        onView(withId(R.id.bt_block3)).perform(click())
        onView(withId(R.id.bt_block1)).perform(click())
        onView(withId(R.id.bt_block4)).perform(click())
        onView(withId(R.id.bt_block2)).perform(click())

        onView(withId(R.id.tv_show_result))
            .check(matches(withText(activityRule.activity.getString(R.string.player_wins, 1))))
    }

    @Test
    fun line2Player2() {
        onView(withId(R.id.bt_restart_game)).perform(click())
        onView(withId(R.id.bt_block0)).perform(click())
        onView(withId(R.id.bt_block3)).perform(click())
        onView(withId(R.id.bt_block1)).perform(click())
        onView(withId(R.id.bt_block4)).perform(click())
        onView(withId(R.id.bt_block7)).perform(click())
        onView(withId(R.id.bt_block5)).perform(click())


        onView(withId(R.id.tv_show_result))
            .check(matches(withText(activityRule.activity.getString(R.string.player_wins, 2))))
    }

    @Test
    fun line3Player1() {
        onView(withId(R.id.bt_restart_game)).perform(click())
        onView(withId(R.id.bt_block6)).perform(click())
        onView(withId(R.id.bt_block0)).perform(click())
        onView(withId(R.id.bt_block7)).perform(click())
        onView(withId(R.id.bt_block1)).perform(click())
        onView(withId(R.id.bt_block8)).perform(click())

        onView(withId(R.id.tv_show_result))
            .check(matches(withText(activityRule.activity.getString(R.string.player_wins, 1))))
    }

    @Test
    fun diagonal1Player1() {
        onView(withId(R.id.bt_restart_game)).perform(click())
        onView(withId(R.id.bt_block0)).perform(click())
        onView(withId(R.id.bt_block3)).perform(click())
        onView(withId(R.id.bt_block4)).perform(click())
        onView(withId(R.id.bt_block1)).perform(click())
        onView(withId(R.id.bt_block8)).perform(click())

        onView(withId(R.id.tv_show_result))
            .check(matches(withText(activityRule.activity.getString(R.string.player_wins, 1))))
    }

    @Test
    fun diagonal2Player2() {
        onView(withId(R.id.bt_restart_game)).perform(click())
        onView(withId(R.id.bt_block0)).perform(click())
        onView(withId(R.id.bt_block2)).perform(click())
        onView(withId(R.id.bt_block1)).perform(click())
        onView(withId(R.id.bt_block4)).perform(click())
        onView(withId(R.id.bt_block8)).perform(click())
        onView(withId(R.id.bt_block6)).perform(click())

        onView(withId(R.id.tv_show_result))
            .check(matches(withText(activityRule.activity.getString(R.string.player_wins, 2))))
    }

    @Test
    fun draw() {
        onView(withId(R.id.bt_restart_game)).perform(click())
        onView(withId(R.id.bt_block0)).perform(click())
        onView(withId(R.id.bt_block4)).perform(click())
        onView(withId(R.id.bt_block8)).perform(click())
        onView(withId(R.id.bt_block1)).perform(click())
        onView(withId(R.id.bt_block7)).perform(click())
        onView(withId(R.id.bt_block6)).perform(click())
        onView(withId(R.id.bt_block2)).perform(click())
        onView(withId(R.id.bt_block5)).perform(click())
        onView(withId(R.id.bt_block3)).perform(click())

        onView(withId(R.id.tv_show_result))
            .check(matches(withText(activityRule.activity.getString(R.string.draw))))
    }

    @Test
    fun alerDialogCancelandOk() {
        onView(withId(R.id.bt_restart_game)).perform(click())
        onView(withId(R.id.bt_block0)).perform(click())
        onView(withId(R.id.bt_block1)).perform(click())
        onView(withId(R.id.bt_block2)).perform(click())

        onView(withId(R.id.bt_restart_game)).perform(click())

        getInstrumentation().waitForIdleSync()
        onView(withText(activityRule.activity.getString(R.string.restart_message))).check(matches(isDisplayed()))

        //Click button cancel
        onView(withId(android.R.id.button2)).perform(click())
        onView(withId(R.id.bt_restart_game)).perform(click())

        getInstrumentation().waitForIdleSync()
        onView(withText(activityRule.activity.getString(R.string.restart_message))).check(matches(isDisplayed()))

        //Click button ok
        onView(withId(android.R.id.button1)).perform(click())
    }
}