package tictactoe.droidrank.com.tictactoe.presentation.tictactoe

import android.app.Activity
import android.content.Context
import android.widget.Button

interface MainContract {
    interface View {
        fun onClickedBlock(position: Int)
        fun userMessage(msg: String)
        fun reset()
        fun buttonTitle(title: String)
        fun getActivity(): Activity
        fun blockEnabled(button: Button, flag: Boolean)
    }

    interface Presenter {
        fun verifyReset()
        fun setup(mainActivity: MainActivity, context: Context)
        fun setToMatch(position: Int)
        fun getPlayer(): CharSequence?
    }
}