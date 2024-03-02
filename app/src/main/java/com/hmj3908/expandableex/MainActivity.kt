package com.hmj3908.expandableex

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hmj3908.expandableex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            expandable.setOnExpandListener {
                if (it) {
                    toast("expanded")
                    expandable.spinnerColor = Color.YELLOW
                } else {
                    toast("collapse")
                }
            }
            expandable.parentLayout.setOnClickListener { expandable.toggleLayout() }
            expandable.secondLayout.findViewById<Button>(R.id.button0)
                .setOnClickListener { toast("item0 clicked") }
            expandable.secondLayout.findViewById<Button>(R.id.button1)
                .setOnClickListener { toast("item1 clicked") }
            expandable.secondLayout.findViewById<Button>(R.id.button2)
                .setOnClickListener { toast("item2 clicked") }
            expandable.secondLayout.findViewById<Button>(R.id.button3)
                .setOnClickListener { toast("item3 clicked") }

            expandable1.setOnExpandListener {
                if (it) {
                    toast("expanded")
                } else {
                    toast("collapse")
                }
            }
            expandable1.parentLayout.setOnClickListener { expandable1.toggleLayout() }
            expandable1.secondLayout.setOnClickListener { toast("clicked the second layout") }

            expandable2.setOnExpandListener {
                if (it) {
                    toast("expanded")
                } else {
                    toast("collapse")
                }
            }
            expandable2.parentLayout.setOnClickListener { expandable2.toggleLayout() }
        }
    }

    private fun toast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}