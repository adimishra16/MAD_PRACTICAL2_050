package com.example.mad_practical2_050

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toast(msg:String)
    {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }
    fun snackbar(msg:String)
    {
        Snackbar.make(findViewById(R.id.layout1),msg,Snackbar.LENGTH_SHORT).show();
    }
    override fun onStart() {
        super.onStart()
        toast("on Start Called")
        snackbar("On Start Called")
        Log.i("ACtivity","On start Called")
    }
    override fun onResume() {
        super.onResume()
        toast("On Resume Called")
        snackbar("On Resume Called")
        Log.i("ACtivity","On Resume Called")
    }
    override fun onPause() {
        super.onPause()
        toast("on Pause Called")
        snackbar("On Pause Called")
        Log.i("ACtivity","On Pause Called")
    }
    override fun onStop() {
        super.onStop()
        toast("On Stop Called")
        snackbar("On Stop Called")
        Log.i("ACtivity","On Stop Called")
    }
    override fun onDestroy() {
        super.onDestroy()
        toast("On Destroy Called")
        snackbar("On Destroy Called")
        Log.i("ACtivity","On Destroy Called")
    }
}