package com.example.newwordapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var clMain: ConstraintLayout
    lateinit var words : ArrayList<String>
    lateinit var btsubmit: Button
    lateinit var etWord: EditText
    lateinit var rvMain: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        words = arrayListOf()

        clMain = findViewById(R.id.clMain)
        etWord = findViewById(R.id.etWord)
        btsubmit = findViewById(R.id.btSubmit)
        rvMain = findViewById(R.id.rvMain)
        rvMain.adapter = RVAdapter(words)

        rvMain.layoutManager = LinearLayoutManager(this)
        btsubmit.setOnClickListener{ submitWord() }



    }
    private fun submitWord(){
        val text = etWord.text.toString()
        if(text.isNotEmpty()){
            words.add(text)
            etWord.text.clear()
            etWord.clearFocus()
            rvMain.adapter!!.notifyDataSetChanged()


        }else{
            Snackbar.make(clMain, "Enter your new word", Snackbar.LENGTH_LONG).show()
        }


    }
}