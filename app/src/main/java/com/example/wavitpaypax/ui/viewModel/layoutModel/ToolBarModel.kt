package com.example.wavitpaypax.ui.viewModel.layoutModel

import android.view.View
import androidx.databinding.ObservableField

/**
 * This class used to handle Toolbar items.
 */

class ToolBarModel {

    val isUploadIconShown: ObservableField<Boolean> = ObservableField()
    val isFilterIconShown: ObservableField<Boolean> = ObservableField()
    var isBackButtonShown: ObservableField<Boolean> = ObservableField()
    var isMenuIconShown: ObservableField<Boolean> = ObservableField()
    var title: ObservableField<String> = ObservableField("")//com.example.wavitpaypax.utils.constant.AppConstants.BLANK
    private var mOnToolbarClick: OnToolbarClickListener? =
        null


    fun setBackButtonShown(backButtonShown: Boolean) {
        isBackButtonShown.set(backButtonShown)
    }

    fun setMenuIconShown(menuIconShown: Boolean) {
        isMenuIconShown.set(menuIconShown)
    }

    fun setUploadIconShown(uploadIconShown: Boolean) {
        isUploadIconShown.set(uploadIconShown)
    }

    fun setIsFilterIconShown(filterIconShown: Boolean) {
        isFilterIconShown.set(filterIconShown)
    }

    fun setOnToolbarClickListener(onToolbarClick: OnToolbarClickListener?) {
        mOnToolbarClick = onToolbarClick
    }

    fun setTitle(topTitle: String?) {
        title.set(topTitle)
    }

    /**
     * This method is used to handle the click event for Back button
     */
    fun clickedOnBack(v: View?) {
        mOnToolbarClick?.onBack(v)
    }

    /**
     * This method is used to handle the click event for Menu icon
     */
    fun onMenuOptionClick(v: View?) {
        mOnToolbarClick?.onMenuIcon(v)
    }

    /**
     * This method is used to handle the click event for Upload icon
     */
    fun onUploadClick() {
        mOnToolbarClick?.onUploadIcon()
    }

    /**
     * This method is used to handle the click event for Filter icon
     */
    fun onFilterClick() {
        mOnToolbarClick?.onFilterIcon()
    }

    /**
     * This method is used to clear data

    fun onCleared() {
        mOnToolbarClick = null
        isBackButtonShown = null
        isMenuIconShown = null
        title = null
    } */

    interface OnToolbarClickListener {
        fun onBack(v: View?)

        fun onMenuIcon(v: View?)

        fun onUploadIcon()

        fun onFilterIcon()
    }

}