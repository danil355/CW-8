package kz.step.cw_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class StudentActivity : AppCompatActivity() {

var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        initializeViews()
        initializeLiseners()
    }

    private fun initializeViews() {
        textView = findViewById(R.id.textView)
    }

    private fun initializeLiseners() {
        var listInfo: StudentsInformationFragment = StudentsInformationFragment()
        textView?.text = listInfo.initializeLiseners().toString()
    }


}