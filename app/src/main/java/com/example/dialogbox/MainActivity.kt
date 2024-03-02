package com.example.dialogbox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dialogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//question 1
        binding.t1.setOnClickListener {
            val option = arrayOf("Python Bytecode","JavaScript","JVM Bytecode","PHP")
            val builder1 = AlertDialog.Builder(this)
            var selectedOp = 0
            builder1.setTitle("Which platform does Kotlin primarily target?")
            builder1.setSingleChoiceItems(option,-1,DialogInterface.OnClickListener { dialogInterface, i ->
               selectedOp = i
            })

            builder1.setPositiveButton("Submit"){ dialogInterface, i ->
                when (selectedOp){
                    0->{
                        Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
                    }
                    1->{
                    Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
                    }
                    2-> {
                    Toast.makeText(this,"Correct Answer!",Toast.LENGTH_SHORT).show()
                    }
                    3->{
                        Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
                    }

                }
            }
            builder1.setNegativeButton("Cancel"){ dialogInterface, i ->

            }
            builder1.show()
        }


//question 2
        binding.t2.setOnClickListener {
            val option = arrayOf("True","False")
            val builder2 = AlertDialog.Builder(this)
            var selectedOp = 0
            builder2.setTitle("Are semicolons (;) mandatory at the end of code statements in Kotlin?")
            builder2.setSingleChoiceItems(option,-1,DialogInterface.OnClickListener { dialogInterface, i ->
                selectedOp = i
            })

            builder2.setPositiveButton("Submit"){ dialogInterface, i ->
                when (selectedOp){
                    0->{
                        Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
                    }
                    1-> {
                        Toast.makeText(this,"Correct Answer!",Toast.LENGTH_SHORT).show()
                    }
                }
            }
            builder2.setNegativeButton("Cancel"){ dialogInterface, i ->

            }
            builder2.show()
        }

        //question 3

        binding.t3.setOnClickListener {
            val option = arrayOf("Only Object-Oriented","Procedural","Only functional","Both 1 & 3")
            val builder3 = AlertDialog.Builder(this)
            var selectedOp = 0
            builder3.setTitle("What paradigm(s) does the Kotlin programming language follow?")
            builder3.setSingleChoiceItems(option,-1,DialogInterface.OnClickListener { dialogInterface, i ->
                selectedOp = i
            })

            builder3.setPositiveButton("Submit"){ dialogInterface, i ->
                when (selectedOp){
                    0->{
                        Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
                    }
                    1->{
                        Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
                    }
                    3-> {
                        Toast.makeText(this,"Correct Answer!",Toast.LENGTH_SHORT).show()
                    }
                    2->{
                        Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
                    }

                }
            }
            builder3.setNegativeButton("Cancel"){ dialogInterface, i ->

            }
            builder3.show()
        }

//question 4
        binding.t4.setOnClickListener {
            val option = arrayOf("var","val","const","final  ")
            val builder4 = AlertDialog.Builder(this)
            var selectedOp = 0
            builder4.setTitle("How do you define a variable in Kotlin that cannot be reassigned?")
            builder4.setSingleChoiceItems(option,-1,DialogInterface.OnClickListener { dialogInterface, i ->
                selectedOp = i
            })

            builder4.setPositiveButton("Submit"){ dialogInterface, i ->
                when (selectedOp){
                    0->{
                        Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
                    }
                    2->{
                        Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
                    }
                    1-> {
                        Toast.makeText(this,"Correct Answer!",Toast.LENGTH_SHORT).show()
                    }
                    3->{
                        Toast.makeText(this,"Incorrect",Toast.LENGTH_SHORT).show()
                    }

                }
            }
            builder4.setNegativeButton("Cancel"){ dialogInterface, i ->

            }
            builder4.show()
        }

        //exit button
        binding.exit.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Do you want to Exit?")
            builder.setPositiveButton("Exit",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("Cancel",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder.show()
        }
    }
}