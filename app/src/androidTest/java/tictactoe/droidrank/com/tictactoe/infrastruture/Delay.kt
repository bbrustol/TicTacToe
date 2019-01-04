package tictactoe.droidrank.com.tictactoe.infrastruture

import android.support.test.espresso.UiController
import android.support.test.espresso.matcher.ViewMatchers.isRoot
import android.support.test.espresso.ViewAction
import android.view.View
import org.hamcrest.Matcher


open class Delay {
    /**
     * Perform action of waiting for a specific time.
     * how to use it -> onView(isRoot()).perform(waitFor(500))
     */
    fun waitFor(millis: Long): ViewAction {
        return object : ViewAction {
            override fun getConstraints(): Matcher<View> {
                return isRoot()
            }

            override fun getDescription(): String {
                return "Wait for $millis milliseconds."
            }

            override fun perform(uiController: UiController, view: View) {
                uiController.loopMainThreadForAtLeast(millis)
            }
        }
    }
}