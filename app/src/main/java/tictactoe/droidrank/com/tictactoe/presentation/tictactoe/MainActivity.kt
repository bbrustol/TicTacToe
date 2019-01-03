package tictactoe.droidrank.com.tictactoe.presentation.tictactoe

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import tictactoe.droidrank.com.tictactoe.R

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter = MainPresenter()
        mPresenter.setup(this, applicationContext)
        setupButtons()
        allBlockSetEnabled(false)
    }

    override fun onRestart() {
        super.onRestart()

    }

    private fun setupButtons() {
        bt_block0.setOnClickListener { onClickedBlock(0); bt_block0.text = mPresenter.getPlayer(); blockEnabled(bt_block0, false)}
        bt_block1.setOnClickListener { onClickedBlock(1); bt_block1.text = mPresenter.getPlayer(); blockEnabled(bt_block1, false) }
        bt_block2.setOnClickListener { onClickedBlock(2); bt_block2.text = mPresenter.getPlayer(); blockEnabled(bt_block2, false) }
        bt_block3.setOnClickListener { onClickedBlock(3); bt_block3.text = mPresenter.getPlayer(); blockEnabled(bt_block3, false) }
        bt_block4.setOnClickListener { onClickedBlock(4); bt_block4.text = mPresenter.getPlayer(); blockEnabled(bt_block4, false) }
        bt_block5.setOnClickListener { onClickedBlock(5); bt_block5.text = mPresenter.getPlayer(); blockEnabled(bt_block5, false) }
        bt_block6.setOnClickListener { onClickedBlock(6); bt_block6.text = mPresenter.getPlayer(); blockEnabled(bt_block6, false) }
        bt_block7.setOnClickListener { onClickedBlock(7); bt_block7.text = mPresenter.getPlayer(); blockEnabled(bt_block7, false) }
        bt_block8.setOnClickListener { onClickedBlock(8); bt_block8.text = mPresenter.getPlayer(); blockEnabled(bt_block8, false) }
        bt_restart_game.setOnClickListener { mPresenter.verifyReset() }
    }

    override fun onClickedBlock(position: Int) {
        mPresenter.setToMatch(position)
    }

    override fun buttonTitle(title: String) {
        bt_restart_game.text = title
    }

    override fun userMessage(msg: String) {
        tv_show_result.text = msg
        allBlockSetEnabled(false)
    }

    override fun reset() {
        bt_block0.text = ""
        bt_block1.text = ""
        bt_block2.text = ""
        bt_block3.text = ""
        bt_block4.text = ""
        bt_block5.text = ""
        bt_block6.text = ""
        bt_block7.text = ""
        bt_block8.text = ""
        tv_show_result.text = ""
        allBlockSetEnabled(true)
    }

    private fun allBlockSetEnabled(flag: Boolean) {
        blockEnabled(bt_block0, flag)
        blockEnabled(bt_block1, flag)
        blockEnabled(bt_block2, flag)
        blockEnabled(bt_block3, flag)
        blockEnabled(bt_block4, flag)
        blockEnabled(bt_block5, flag)
        blockEnabled(bt_block6, flag)
        blockEnabled(bt_block7, flag)
        blockEnabled(bt_block8, flag)
    }

    override fun blockEnabled (button: Button, flag: Boolean) {
        button.isEnabled = flag
    }

    override fun getActivity ():Activity {
        return this
    }
}
