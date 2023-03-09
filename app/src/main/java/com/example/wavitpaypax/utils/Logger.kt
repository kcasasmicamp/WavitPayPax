package com.example.wavitpaypax.utils

import android.util.Log
import java.io.File


/**
* Class contains methods to show the log and write ot on file.
*/
class Logger {
companion object {
    private var logFile: File? = null

    /**
     * @param tag           String
     * @param msg           String
     * @param isWriteInFile boolean
     * Method to display writeLog messages in Error section.
     */
    fun e(tag: String?, msg: String, isWriteInFile: Boolean) {
        Log.e(tag, msg)
        if (isWriteInFile) {
            writeLog(msg)
        }
    }

    /**
     * @param val String
     * This method is used to write writeLog on file.
     */
    private fun writeLog(`val`: String) {
//        try {
//            val current = Date()
//            if (logFile != null && logFile!!.exists()) {
//                if (!AppConstants.Constants.SIMPLE_FORMAT.format(Date(logFile!!.lastModified()))
//                        .equals(AppConstants.Constants.SIMPLE_FORMAT.format(current))
//                ) {
//                    resetFile()
//                }
//            }
//            if (logFile == null) {
//                val root: File = File(
//                    WavitApplication.getAppContext()
//                        ?.getExternalFilesDir(AppConstants.Constants.BLANK) + File.separator + AppConstants.Constants.LOG_DIRECTORY_NAME,
//                    AppConstants.Constants.LOG_FILE_DIRECTORY_NAME
//                )
//                if (!root.exists()) {
//                    root.mkdirs()
//                }
//                logFile = File(
//                    root,
//                    AppConstants.Constants.LOG_FILE_NAME + AppConstants.Constants.SIMPLE_FORMAT.format(current) + AppConstants.Constants.LOG_FILE_FORMAT
//                )
//                if (!logFile!!.exists()) {
//                    logFile!!.createNewFile()
//                }
//            }
//            Log.e("CreatedPath", logFile!!.absolutePath + " " + logFile!!.exists())
//            val fOut = FileOutputStream(logFile, true)
//            val myOutWriter = OutputStreamWriter(fOut)
//            myOutWriter.append(AppConstants.Constants.SIMPLE_DATE_FORMAT.format(Date(GlobalUtil.getTime())))
//            myOutWriter.append(AppConstants.Constants.SPACE).append(`val`).append("\n\n")
//            myOutWriter.close()
//            fOut.close()
//        } catch (e: Exception) {
//            e.printStackTrace()
//            com.example.wavitpaypax.utils.Logger.e(
//                com.example.wavitpaypax.utils.Logger::class.java.getName(),
//                ((GlobalUtil.getCurrentClassAndFunctionName(e) + e.toString() + AppConstants.Constants.SPACE).toString() + e.message + AppConstants.Constants.SPACE).toString() + `val`,
//                false
//            )
//        }
    }

    fun resetFile() {
        logFile = null
    }
}

}



