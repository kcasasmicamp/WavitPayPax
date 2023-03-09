package com.example.wavitpaypax.Base

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import com.example.wavitpaypax.ui.viewModel.layoutModel.ToolBarModel

/*
 * common business logic for the application
 */
open class BaseViewModel {

    @SuppressLint("StaticFieldLeak")
    val mApplicationContext: Context? = null

    @SuppressWarnings("raw-types")
    var mToolbar: ToolBarModel = ToolBarModel()
    open fun init(
        isBackButtonVisible: Boolean,
        isMenuItem: Boolean,
        isUploadButtonVisible: Boolean,
        isFilterVisible: Boolean,
        title: String?
    ) {
        mToolbar.setBackButtonShown(isBackButtonVisible)
        mToolbar.setMenuIconShown(isMenuItem)
        mToolbar.setTitle(title)
        mToolbar.setUploadIconShown(isUploadButtonVisible)
        mToolbar.setIsFilterIconShown(isFilterVisible)
        mToolbar.setOnToolbarClickListener(object : ToolBarModel.OnToolbarClickListener {
            override fun onBack(v: View?) {
                back(v)
            }

            override fun onMenuIcon(v: View?) {
                openMenus(v)
            }

            override fun onUploadIcon() {
                uploadFile()
            }

            override fun onFilterIcon() {
                filterOptions()
            }
        })
    }
//
/*
     * Used to open the menus
     * */
open fun openMenus(v: View?) {
//    if (mViewInteraction != null) mViewInteraction.postValue(Parameter(AppConstants.MENU, v, this))
}

    /*
     * Send the event to close the current screen
     * */
    open fun back(v: View?) {
//        if (mViewInteraction != null) mViewInteraction.postValue(
//            Parameter(
//                AppConstants.BACK,
//                v,
//                null
//            )
//        )
    }

    /*
     * call on click of logfile upload button
     * */
    open fun uploadFile() {}

    /*
     * call on click of Filter button
     * */
    open fun filterOptions() {}

//    protected open fun onCleared() {
//        super.onCleared()
//        mViewInteraction = null
//        if (mToolbar != null) {
//            mToolbar.onCleared()
//        }
//        mToolbar = null
//        if (mHeader != null) {
//            mHeader.onCleared()
//        }
//        mHeader = null
//    }



}