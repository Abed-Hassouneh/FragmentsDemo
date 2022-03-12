package com.example.fragmentsdemo

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SampleFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("TTT","Fragment on Create view ")
        return inflater.inflate(R.layout.fragment_sample,container,false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.d("TTT","Fragment on Create")
        super.onCreate(savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("TTT","Fragment on view created ")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.d("TTT","Fragment On view State Restored")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        Log.d("TTT","Fragment on start")
        super.onStart()
    }

    override fun onResume() {
        Log.d("TTT","Fragment on resumed")
        super.onResume()
    }

    override fun onPause() {
        Log.d("TTT","Fragment on paused")
        super.onPause()
    }

    override fun onStop() {
        Log.d("TTT","Fragment on stop")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d("TTT","Fragment on saved instance")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.d("TTT","Fragment on destroy view")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("TTT","Fragment on destroyed")
        super.onDestroy()
    }

    override fun onAttach(context: Context) {
        Log.d("TTT","Fragment on Attach")
        super.onAttach(context)
    }

    override fun onDetach() {
        Log.d("TTT","Fragment on Deattach")
        super.onDetach()
    }
}