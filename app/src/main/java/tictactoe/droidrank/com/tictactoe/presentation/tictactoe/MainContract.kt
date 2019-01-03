package tictactoe.droidrank.com.tictactoe.presentation.tictactoe

interface MainContract {
    interface View {
        fun onClickedBlock()
    }

    interface Presenter {
        fun verifyWinnner()
    }
}