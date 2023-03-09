package com.example.wavitpaypax.utils.constant

import android.annotation.SuppressLint
import java.text.SimpleDateFormat


/**
 * This interface is used to define applications constants.
 */
interface AppConstants {

    class Constants:AppConstants {
      companion object {
          const val DB_NAME = "wav_db"
          const val FTP_HOST_NAME = "devmishare.westus2.cloudapp.azure.com"
          const val HOST_USER_NAME = "ShareUser"
          const val HOST_USER_PASSWORD = "MiCamp1825!"
          const val FTP = "ftp://"
          const val SEPARATOR = "/"
          const val MERCHANT_ID = "2d68263b-ac48-463b-a8a2-8d9607d94210"

          const val SPACE = " "
          const val COLON = ":"
          const val DOT = "."
          const val BLANK = ""
          const val UNKNOWN = "No name"
          const val PAX_DECIMAL_FORMAT = "#.00"
          const val DECIMAL_FORMAT = "%.2f"
          const val REGEX_PATTERN = "[^a-zA-Z0-9]"
          const val FUNC = "func"
          const val CUSTOMER = "Customer"
          const val MERCHANT = "Merchant"
          const val QR_CODE = "QRScan"
          const val INVOICE_TENDER = "Invoice"
          const val COMPANY_NAME = "MiCamp Solutions"
          const val COMPANY_Address1 = "4021 North 75th Street"
          const val COMPANY_Address2 = "Scottsdale, Arizona 85251"
          const val COMPANY_Address3 = "800-396-0246"

          /**
           * PAX Device Details
           */
          const val DEVICE_TYPE = "PAX"
          const val APP_KEY_DEV = "XUDREID9D475ZPWCV8OO"
          const val APP_KEY_PROD = "TL3SD2VHY99SMDGMI0LR"
          const val APP_SECRET_DEV = "BDKIM39ACYTW6HAO580V1TWBL5PDUNQDS406UXQ0"
          const val APP_SECRET_PROD = "VUP2IJD2LTZUDUNXO69166TDCXTT115ANVKXKSQV"
          const val TIMEOUT = "60000"
          const val SERIAL_PORT = "COM1"
          const val BAUD_RATE = "9600"
          const val DESTINATION_PORT = "10009"
          const val MODEL_E = "E"
          const val MODEL_A9 = "A9"
          const val TOKEN_TAG = "<TokenRequest>1</TokenRequest>"
          const val FORCE_TAG = "<Force>T</Force>"
          const val Tender_Type = "Tender Type"
          const val SCANNER_TYPE = "Scanner Type"
          const val Trans_Type = "Trans Type"
          const val TOKEN = "Token"
          const val NAME_ON_CARD = "PLNameOnCard"
          const val ECR_REF_NUM = "ECRRefNum"
          const val BATCH_NUM = "BatchNum"
          const val CARD_BIN = "CARDBIN"
          const val EXPIRE_DATE = "ExpDate"
          const val INIT = "INIT"
          const val GETVAR = "GETVAR"
          const val SETVAR = "SETVAR"
          const val MANAGE = "Manage"
          const val SUCCESS_CODE = "000000"
          const val TIMEOUT_RESPONSE = "Timeout"
          const val FAILURE_RESPONSE = "Failure"

          const val XML_DATA = "XML Data"
          const val JSON_DATA = "JSON Data"
          const val JSON_EXCEPTION = "JSON exception"
          const val ERROR = "Error :  "
          const val PAYMENT_RESPONSE = "Payment Response :  "
          const val PTR_CODE = "Process Transaction Result Code :  "
          const val FINISH = "Scanner Finish"
          const val NOT_OPENED_SCANNER = "You have not opened Scanner"
          const val DIALOG_DISMISSED = "Cancel Button Clicked"

          /*
       * Logfile constants
       * */
          @SuppressLint("SimpleDateFormat")
          val SIMPLE_FORMAT = SimpleDateFormat("MM_dd_yyyy")
          const val LOG_FILE_NAME = "WAVitLog"
          const val LOG_FILE_FORMAT = ".txt"
          const val LOG_TIME_FORMAT = "yyyy-MM-dd hh:mm:ss"

          @SuppressLint("SimpleDateFormat")
          val SIMPLE_DATE_FORMAT = SimpleDateFormat(AppConstants.Constants.LOG_TIME_FORMAT)
          const val LOG_DROP_DOWN_FORMAT = "MM/dd/yyyy"
          const val LOG_DIRECTORY_NAME = "WAVit Payments"
          const val LOG_FILE_DIRECTORY_NAME = "Log files"

          /*
       * local variables
       * */
          const val CANCELED = "Cancelled"
          const val PAID = "Paid"
          const val KEY_TRANSACTION = "transaction"
          const val KEY_PAYMENT = "payment"
          const val DEFAULT_PAYMENT_ID = "00000000-0000-0000-0000-000000000000"
          const val KEY_METHOD = "transaction_method"
          const val CASH = "Cash"
          const val QR_PAYMENT = "WAVit"
          const val DEBIT = "Debit"
          const val CREDIT = "Credit"
          const val REFUND_TRANSACTION = "Refund"
          const val VOID_TRANSACTION = "Void"
          const val SUBTOTAL = "Sub-Total"
          const val TOTAL = "Total"
          const val AMOUNT = "Amount"
          const val TRANSACTION_ID = "Transaction ID"
          const val SIGNATURE = "Signature"
          const val TAX = "Tax"
          const val _TIP = "Tip"
          const val DOLLAR_SYMBOL = "$"
          const val COMMA_SYMBOL = ","
          const val MINUS_SYMBOL = "-"
          const val S_DEFAULT_AMOUNT = "0.00"

          @SuppressLint("SimpleDateFormat")
          val SDF = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")

          @SuppressLint("SimpleDateFormat")
          val SDF1 = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
          const val PRE_AUTH = "Pre-Auth"
          const val UTC = "UTC"
          const val ELEMENTS = "elements"
          const val YES = "Yes"
          const val NO = "No"
          const val DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd"
          const val TIME_FORMAT_HH_MM_SS = "HH:mm:ss aa"
          const val AT = " at "

          @SuppressLint("SimpleDateFormat")
          val mDateFormat = SimpleDateFormat(DATE_FORMAT_YYYY_MM_DD)

          @SuppressLint("SimpleDateFormat")
          val mTimeFormat = SimpleDateFormat(TIME_FORMAT_HH_MM_SS)
          const val STATUS_API_INTERVAL = 10000
          const val CANCEL_API_INTERVAL = 20000
          const val UNLOCK_PIN_LENGTH = 4
          const val LOG_FILE_DELETE_DAY = -7
          const val PRIORITY_INTERCEPT = 200
          const val API_TIMEOUT_SECONDS = 60
          const val ZERO = 0
          const val ONE = 1
          const val TWO = 2
          const val THREE = 3
          const val FOUR = 4
          const val FIVE = 5
          const val SIX = 6
          const val PROGRESS = 100
          const val VERIFY = 200
          const val INITIALIZE = 400
          const val PIN = 2002
          const val SETTINGS = 202
          const val BACK = 501
          const val TRANSACTIONS = 502
          const val LOGOUT = 503
          const val ABOUT = 504
          const val MENU = 505
          const val TIP = 506
          const val PAYMENT = 507
          const val STATUS = 508
          const val PRE_AUTH_CAPTURE = 509
          const val SUPPORT = 510
          const val CANCEL = 511
          const val CITCON_CANCEL = 518
          const val SPLASH = 512
          const val REFUND = 513
          const val MENU_OPTIONS = 514
          const val FILTER_OPTIONS = 515
          const val QR_SCAN_CODE = 516
          const val CITCON_REFUND = 517
          const val INVOICE = 520
          const val INVOICE_DETAILS = 519
          const val RESEND = 521
          const val TRANSACTION_SUCCEED = 601
          const val TRANSACTION_TIMEOUT = 602
          const val TRANSACTION_ERROR = 603
          const val TIMER = 1000
          const val SEC_03_TIMER = 3000
          const val SEC_04_TIMER = 4000
          const val SEC_60_TIMER = 60000
          const val SEC_30_TIMER = 30000
          const val SEC_15_TIMER = 15000
          const val DEFAULT_AMOUNT = 0.00
          const val DEFAULT_TIP_AMOUNT = 9999999999999999999999999999.99
          const val ONE_DOLLAR = 100.00 //100.00 cents
      }
    }
}