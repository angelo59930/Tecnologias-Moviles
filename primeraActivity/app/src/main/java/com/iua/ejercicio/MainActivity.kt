package com.iua.ejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.iua.ejercicio.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

  private lateinit var binding : ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    /* Creamos el binding */
    binding = ActivityMainBinding.inflate(layoutInflater)
    val view = binding.root
    setContentView(view)

    /* LOG DEL STATE */
    Log.d("state","On-Create")
    /* CREACIÓN DEL TOAST */
    Toast.makeText(applicationContext, "Toast On-Create", Toast.LENGTH_SHORT).show()
    /* TITLE */
    setTitle(R.string.title)

    /* CREAMOS LA SNACKBAR*/
    binding.button.setOnClickListener {
      Snackbar.make(view,R.string.snack,Snackbar.LENGTH_SHORT).show()
    }

  }

  override fun onStart() {
    super.onStart()
    Log.d("state","On_Start")
  }

  override fun onPause() {
    super.onPause()
    Log.d("state","On-Pause")
    Toast.makeText(applicationContext, "Toast On-Pause", Toast.LENGTH_SHORT).show()
  }

  override fun onDestroy() {
    super.onDestroy()
    Log.d("state","On-Destroy")
  }

  override fun onResume() {
    super.onResume()
    Log.d("state","On-Resume")
  }

  override fun onRestart() {
    super.onRestart()
    Log.d("state","On-Restart")
  }

  override fun onStop() {
    super.onStop()
    Log.d("state","On-Stop")
  }
}