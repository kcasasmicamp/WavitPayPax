package com.example.wavitpaypax.Base

import android.app.Application
import android.content.Context

class WavitApplication: Application() {
    companion object {
        private val mWAVitApplication: WavitApplication? = null
        fun getAppContext(): Context? {
            return mWAVitApplication?.applicationContext
        }
    }



}