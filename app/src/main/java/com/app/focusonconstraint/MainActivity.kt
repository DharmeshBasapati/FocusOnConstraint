package com.app.focusonconstraint

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.Group

class MainActivity : AppCompatActivity() {

    private var group: Group? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_groups)
        group = findViewById(R.id.group)
    }

    fun manageGroupVisibility(view: View) {
        when (view.id) {
            R.id.btnVisible -> {
                group?.visibility = View.VISIBLE
            }
            R.id.btnInvisible -> {
                group?.visibility = View.INVISIBLE
            }
            R.id.btnGone -> {
                group?.visibility = View.GONE
            }
        }
    }

}