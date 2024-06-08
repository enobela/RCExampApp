package com.example.rcexamapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowExamActivity : AppCompatActivity() {

    lateinit var stnotext: TextView
    lateinit var seatnotext: TextView
    lateinit var totaltext: TextView
    lateinit var StudentNoArray: Array<String>
    lateinit var SeatArray: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_exam)


        // get the array elements from the ExamHomeActivity

         StudentNoArray = intent.getStringArrayExtra("ArrayStudentNo") ?: arrayOf()
         SeatArray = intent.getStringArrayExtra("ArraySeatNo") ?: arrayOf()

         totaltext= findViewById(R.id.total)
         stnotext= findViewById(R.id.textView)
         seatnotext= findViewById(R.id.textView2)

          // Assgn each array to textview so that it display on the screen
       // var AVG= Get_Sum()/Get_Total()
        totaltext.text=Get_Average().toString()


        stnotext.text = "Student List \n ${StudentNoArray.joinToString("\n")}"
        seatnotext.text = "Exam Seat List \n ${SeatArray.joinToString("\n")}"

    }



    fun Get_Total():Int {

        var count=0
        while (count <StudentNoArray.count())
        {
            count ++
        }
        return count;
    }

    fun Get_Average():Double {

        var sum= 0.0
       for(num in SeatArray)
       {
           // convert num to Int using toInt
           // so that you can perform calculation using numeric values
           val value =num.toInt()
           sum +=value
       }
        val avg= sum/ SeatArray.size
        return avg
    }

}