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
            }
        }
        btnPause.setOnClickListener {
            if (vvVideo.isPlaying) {
                vvVideo.pause()
            }
        }
        btnReplay.setOnClickListener {
            if (vvVideo.isPlaying) {
                vvVideo.resume()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        vvVideo.suspend()
    }
}