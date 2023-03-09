package com.example.wavitpaypax.ui.viewModel

import android.annotation.SuppressLint
import android.app.Application
import androidx.databinding.ObservableField
import com.example.wavitpaypax.Base.BaseViewModel
import com.example.wavitpaypax.R
import com.example.wavitpaypax.utils.GlobalUtil
import com.example.wavitpaypax.utils.constant.AppConstants


/**
 * This view model is used to write business logic of About us screen
 */
open class AboutViewModel: BaseViewModel() {

    var mVersion: ObservableField<String>? = ObservableField(
        AppConstants.Constants.BLANK)

    @SuppressLint("NotConstructor")
    fun AboutViewModel(application: Application) {
        //super(application)
        mApplicationContext?.let { init(true, false, false, false, it.getString(R.string.menu_about)) }
        mVersion!!.set(application.applicationContext.getString(R.string.version) + GlobalUtil.getVersionName())
    }

//
//    @Override
//    protected fun onCleared() {
//        super.onCleared()
//        mVersion = null
//    }
//
//    /**
//     * This method is used to fire activity OK event
//     */
//    fun clickedOnOk(v: View?) {
//        back(v)
//    }



}