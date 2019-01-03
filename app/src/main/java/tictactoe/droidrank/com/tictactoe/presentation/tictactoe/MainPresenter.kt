package tictactoe.droidrank.com.tictactoe.presentation.tictactoe

import android.content.Context
import tictactoe.droidrank.com.tictactoe.R
import tictactoe.droidrank.com.tictactoe.infrastructure.ShowAlertDialog
import tictactoe.droidrank.com.tictactoe.infrastructure.WinnerPositions

class MainPresenter : MainContract.Presenter, ShowAlertDialog() {
    private var mPlayer = 1
    private var mCountClicks = 0
    private lateinit var mView: MainContract.View
    private lateinit var mContext: Context
    private var mFlagReset = true

    companion object {
        private const val MAX_CLICKS = 9
    }

    private fun setPlayerTurn() {
        mPlayer = if (mCountClicks % 2 == 1) { 1 } else { 2 }
    }

    private fun verifyWinnner() {
        var countWin = 0
        for (arPos in WinnerPositions.winnerPositions) {
            countWin = 0
            for (i in 0 until arPos.size) {
                if (arPos[i] != 0 && WinnerPositions.match[i] == mPlayer) {
                    countWin++
                }
            }
            if (countWin == 3) {
                mView.userMessage(mContext.getString(R.string.player_wins, mPlayer))
                break
            }
        }
        if (mCountClicks == MAX_CLICKS && countWin != 3) {
            mView.buttonTitle(mContext.getString(R.string.restart_button_text_initially))
            mView.userMessage(mContext.getString(R.string.draw))
            mFlagReset = true
        }else if (mCountClicks == MAX_CLICKS || countWin == 3) {
            mView.buttonTitle(mContext.getString(R.string.restart_button_text_initially))
            mFlagReset = true
        } else {
            mView.buttonTitle(mContext.getString(R.string.restart_button_text_in_middle_of_game))
            mFlagReset = false
        }
    }

    private fun reset() {
        mPlayer = 1
        mCountClicks = 0
        mFlagReset = false
        for (i in 0 .. WinnerPositions.winnerPositions.size) {
            WinnerPositions.match[i] = 0
        }
        mView.buttonTitle(mContext.getString(R.string.restart_button_text_in_middle_of_game))
        mView.reset()
    }

    override fun setup(mainActivity: MainActivity, context: Context) {
        mView = mainActivity
        mContext = context
    }

    override fun verifyReset() {
        if (mFlagReset) {
            reset()
        } else {
            showAlertDialog(mView.getActivity()) {
                setMessage(mContext.getString(R.string.restart_message))
                positiveButton { reset() }
                negativeButton{/*Nothing to do*/}
            }
        }
    }

    override fun getPlayer(): CharSequence? {
        return if (mPlayer == 1)
            { mContext.getString(R.string.player_1_move) }
        else
            { mContext.getString(R.string.player_2_move) }
    }

    override fun setToMatch(position: Int) {
        println(WinnerPositions.match.asList())
        if (WinnerPositions.match[position] == 0) {
            mCountClicks++
            setPlayerTurn()
            WinnerPositions.match[position] = mPlayer
            verifyWinnner()
        }
    }
}