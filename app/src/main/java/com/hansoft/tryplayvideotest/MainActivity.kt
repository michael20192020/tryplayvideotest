package com.hansoft.tryplayvideotest

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val uri = Uri.parse("android.resource://$packageName/${R.raw.map}")
        vvVideo.setVideoURI(uri)
        btnPlay.setOnClickListener {
            if (!vvVideo.isPlaying) {
                vvVideo.start()
                Log.d("MainActivity", "video is playing")
                Log.d("MainActivity", "onCreate: aaa")
                Log.d("MainActivity", "onCreate: bbb")
            }
        }
        btnPause.setOnClickListener {
            if (vvVideo.isPlaying) {
                vvVideo.pause()
                Log.d("aaa", "onCreate: aaa")
            }
        }
        btnReplay.setOnClickListener {
            if (vvVideo.isPlaying) {
                vvVideo.resume()
                Log.d("aaa", "onCreate: bbb")
                Log.d("aaa", "onCreate: ccc")
                Log.d("aaa", "onCreate: ddd")

            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        vvVideo.suspend()
    }
}