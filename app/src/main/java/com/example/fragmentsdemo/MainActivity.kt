package com.example.fragmentsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    private lateinit var fragmentManager:FragmentManager
    private lateinit var fragmentTransaction:FragmentTransaction
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TTT","Activity on create")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    private fun addFragment(){
        fragmentManager = supportFragmentManager
        fragmentTransaction = fragmentManager.beginTransaction()
        val fragment:Fragment = when(fragmentManager.backStackEntryCount){
            0-> SampleFragment()
            1-> SampleFragment2()
            2-> SampleFragment3()
            else -> SampleFragment()

        }
        fragmentTransaction.add(R.id.fragment_container,fragment)
        fragmentTransaction.addToBackStack("fragmentStack1")
        fragmentTransaction.commit()
    }

    override fun onStart() {
        Log.d("TTT","Activity on start")
        super.onStart()
    }

    override fun onResume() {
        Log.d("TTT","Activity on resume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("TTT","Activity on Pause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("TTT","Activity on Stop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("TTT","Activity on Destroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d("TTT","Activity on restart")
        super.onRestart()
    }

    fun doSomething(view: View) {
        addFragment()
    }
}