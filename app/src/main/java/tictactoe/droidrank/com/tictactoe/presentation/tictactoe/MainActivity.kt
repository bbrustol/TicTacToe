package tictactoe.droidrank.com.tictactoe.presentation.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import tictactoe.droidrank.com.tictactoe.R

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var mPresenter: MainContract.Presenter

    override fun onClickedBlock() {
        mPresenter.verifyWinnner()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBlocks()
    }

    private fun setupBlocks() {
        bt_block0.setOnClickListener {onClickedBlock()}
        bt_block1.setOnClickListener {onClickedBlock()}
        bt_block2.setOnClickListener {onClickedBlock()}
        bt_block3.setOnClickListener {onClickedBlock()}
        bt_block4.setOnClickListener {onClickedBlock()}
        bt_block5.setOnClickListener {onClickedBlock()}
        bt_block6.setOnClickListener {onClickedBlock()}
        bt_block7.setOnClickListener {onClickedBlock()}
        bt_block8.setOnClickListener {onClickedBlock()}
    }
}
