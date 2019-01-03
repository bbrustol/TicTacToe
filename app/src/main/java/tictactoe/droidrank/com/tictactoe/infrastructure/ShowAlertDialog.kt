package tictactoe.droidrank.com.tictactoe.infrastructure

import android.app.Activity
import android.support.v7.app.AlertDialog

open class ShowAlertDialog {
    fun showAlertDialog(activity: Activity, dialogBuilder: AlertDialog.Builder.() -> Unit) {
        val builder = AlertDialog.Builder(activity)
        builder.dialogBuilder()
        val dialog = builder.create()

        dialog.show()
    }

    fun AlertDialog.Builder.positiveButton(text: String = "OK", handleClick: (which: Int) -> Unit = {}) {
        this.setPositiveButton(text) { _, which-> handleClick(which) }
    }

    fun AlertDialog.Builder.negativeButton(text: String = "CANCEL", handleClick: (which: Int) -> Unit = {}) {
        this.setNegativeButton(text) { _, which-> handleClick(which) }
    }
}