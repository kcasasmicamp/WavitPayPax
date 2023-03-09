package com.example.wavitpaypax.utils

import com.example.wavitpaypax.utils.constant.AppConstants
/**
 * This class is define utility methods.
 */

class GlobalUtil {

    companion object {
        /**
         * @return return version name
         * This method is used to return version name
         */
        open fun getVersionName(): String? {
            var version: String? = null
//            try {
//                val pInfo: PackageInfo? =
//                    WavitApplication.getAppContext()?.let {
//                        WavitApplication.getAppContext()?.getPackageManager()?.getPackageInfo(
//                            it.getPackageName(), 0
//                        ) ?:
//                    }
//                if (pInfo != null) {
//                    version = pInfo.versionName
//                }
//            } catch (e: PackageManager.NameNotFoundException) {
//                Logger.e(
//                    ContentValues.TAG,
//                    (LogFileMessages.Messages.ERR + e.message + AppConstants.Constants.SPACE).toString() + getCurrentClassAndFunctionName(
//                        e
//                    ),
//                    true
//                )
//            }
            return version
        }

        /**
         * This method is used to return system's current time.
         */
        fun getTime(): Long {
            return System.currentTimeMillis()
        }

        /**
         * @param e Exception
         *          This method is used to get the details from the generated exception.
         */
        fun getCurrentClassAndFunctionName(e: java.lang.Exception): String? {
            return e.stackTrace[0].className + " " + e.stackTrace[0].methodName + AppConstants.Constants.SPACE
        }
    }
}