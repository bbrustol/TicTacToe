package tictactoe.droidrank.com.tictactoe

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import tictactoe.droidrank.com.tictactoe.presentation.tictactoe.MainActivity

@RunWith(AndroidJUnit4::class)
@LargeTest
class TicTacToePossibilities {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun verify_all_matchs() {
        onView(withId(R.id.bt_restart_game)).perform(click())
        onView(withId(R.id.bt_block0)).perform(click())
        onView(withId(R.id.bt_block1)).perform(click())
        onView(withId(R.id.bt_block2)).perform(click())
        onView(withId(R.id.bt_block3)).perform(click())
        onView(withId(R.id.bt_block4)).perform(click())
        onView(withId(R.id.bt_block5)).perform(click())
        onView(withId(R.id.bt_block6)).perform(click())
        onView(withId(R.id.bt_block7)).perform(click())
        onView(withId(R.id.bt_block8)).perform(click())

        onView(withId(R.id.tv_show_result))
            .check(matches(withText(activityRule.activity.getString(R.string.player_wins, 1))))

    }
}