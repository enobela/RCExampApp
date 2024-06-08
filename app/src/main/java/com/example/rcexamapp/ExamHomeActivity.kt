package com.example.rcexamapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ExamHomeActivity : AppCompatActivity() {


    lateinit var SeatArray: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam_home)



       val  studentNo:EditText= findViewById(R.id.editTextText)
        val  seatNo:EditText= findViewById(R.id.editTextText2)
        val showbutton:Button= findViewById(R.id.buttonshow)

 showbutton.setOnClickListener {
    //Covert elements types  into Array

   val StudentNoArray=studentNo.text.toString().split(",").map { it.trim() }.toTypedArray()
   SeatArray=seatNo.text.toString().split(",").map { it.trim() }.toTypedArray()
     //SeatArray.toList()
   val intent2= Intent(this,ShowExamActivity::class.java).apply {

   // pass Arrays into ShowExamActivity
   putExtra("ArrayStudentNo",StudentNoArray)
   putExtra("ArraySeatNo",SeatArray)
    }
     startActivity(intent2)
   }

    }
}