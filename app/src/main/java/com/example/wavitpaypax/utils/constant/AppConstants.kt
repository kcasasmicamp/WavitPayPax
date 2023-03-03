package com.example.wavitpaypax.utils.constant

import android.annotation.SuppressLint
import java.text.SimpleDateFormat


/**
 * This interface is used to define applications constants.
 */
interface AppConstants {

    val DB_NAME: String
        get() = "wav_db"
    val FTP_HOST_NAME: String
        get() = "devmishare.westus2.cloudapp.azure.com"
    val HOST_USER_NAME: String
        get() = "ShareUser"
    val HOST_USER_PASSWORD: String
        get() = "MiCamp1825!"
    val FTP: String
        get() = "ftp://"
    val SEPARATOR: String
        get() = "/"
    val MERCHANT_ID: String
        get() = "2d68263b-ac48-463b-a8a2-8d9607d94210"

    val SPACE: String
        get() = " "
    val COLON: String
        get() = ":"
    val DOT: String
        get() = "."
    val BLANK: String
        get() = ""
    val UNKNOWN: String
        get() = "No name"
    val PAX_DECIMAL_FORMAT: String
        get() = "#.00"
    val DECIMAL_FORMAT: String
        get() = "%.2f"
    val REGEX_PATTERN: String
        get() = "[^a-zA-Z0-9]"
    val FUNC: String
        get() = "func"
    val CUSTOMER: String
        get() = "Customer"
    val MERCHANT: String
        get() = "Merchant"
    val QR_CODE: String
        get() = "QRScan"
    val INVOICE_TENDER: String
        get() = "Invoice"
    val COMPANY_NAME: String
        get() = "MiCamp Solutions"
    val COMPANY_Address1: String
        get() = "4021 North 75th Street"
    val COMPANY_Address2: String
        get() = "Scottsdale, Arizona 85251"
    val COMPANY_Address3: String
        get() = "800-396-0246"

    /**
     * PAX Device Details
     */
    val DEVICE_TYPE: String
        get() = "PAX"
    val APP_KEY_DEV: String
        get() = "XUDREID9D475ZPWCV8OO"
    val APP_KEY_PROD: String
        get() = "TL3SD2VHY99SMDGMI0LR"
    val APP_SECRET_DEV: String
        get() = "BDKIM39ACYTW6HAO580V1TWBL5PDUNQDS406UXQ0"
    val APP_SECRET_PROD: String
        get() = "VUP2IJD2LTZUDUNXO69166TDCXTT115ANVKXKSQV"
    val TIMEOUT: String
        get() = "60000"
    val SERIAL_PORT: String
        get() = "COM1"
    val BAUD_RATE: String
        get() = "9600"
    val DESTINATION_PORT: String
        get() = "10009"
    val MODEL_E: String
        get() = "E"
    val MODEL_A9: String
        get() = "A9"
    val TOKEN_TAG: String
        get() = "<TokenRequest>1</TokenRequest>"
    val FORCE_TAG: String
        get() = "<Force>T</Force>"
    val Tender_Type: String
        get() = "Tender Type"
    val SCANNER_TYPE: String
        get() = "Scanner Type"
    val Trans_Type: String
        get() = "Trans Type"
    val TOKEN: String
        get() = "Token"
    val NAME_ON_CARD: String
        get() = "PLNameOnCard"
    val ECR_REF_NUM: String
        get() = "ECRRefNum"
    val BATCH_NUM: String
        get() = "BatchNum"
    val CARD_BIN: String
        get() = "CARDBIN"
    val EXPIRE_DATE: String
        get() = "ExpDate"
    val INIT: String
        get() = "INIT"
    val GETVAR: String
        get() = "GETVAR"
    val SETVAR: String
        get() = "SETVAR"
    val MANAGE: String
        get() = "Manage"
    val SUCCESS_CODE: String
        get() = "000000"
    val TIMEOUT_RESPONSE: String
        get() = "Timeout"
    val FAILURE_RESPONSE: String
        get() = "Failure"

    val XML_DATA: String
        get() = "XML Data"
    val JSON_DATA: String
        get() = "JSON Data"
    val JSON_EXCEPTION: String
        get() = "JSON exception"
    val ERROR: String
        get() = "Error :  "
    val PAYMENT_RESPONSE: String
        get() = "Payment Response :  "
    val PTR_CODE: String
        get() = "Process Transaction Result Code :  "
    val FINISH: String
        get() = "Scanner Finish"
    val NOT_OPENED_SCANNER: String
        get() = "You have not opened Scanner"
    val DIALOG_DISMISSED: String
        get() = "Cancel Button Clicked"

    /*
     * Logfile constants
     * */
    @get:SuppressLint("SimpleDateFormat")
    val SIMPLE_FORMAT: SimpleDateFormat
        get() = SimpleDateFormat("MM_dd_yyyy")
    val LOG_FILE_NAME: String
        get() = "WAVitLog"
    val LOG_FILE_FORMAT: String
        get() = ".txt"
    val LOG_TIME_FORMAT: String
        get() = "yyyy-MM-dd hh:mm:ss"

    @get:SuppressLint("SimpleDateFormat")
    val SIMPLE_DATE_FORMAT: SimpleDateFormat
        get() = SimpleDateFormat(LOG_TIME_FORMAT)
    val LOG_DROP_DOWN_FORMAT: String
        get() = "MM/dd/yyyy"
    val LOG_DIRECTORY_NAME: String
        get() = "WAVit Payments"
    val LOG_FILE_DIRECTORY_NAME: String
        get() = "Log files"

    /*
     * local variables
     * */
    val CANCELED: String
        get() = "Cancelled"
    val PAID: String
        get() = "Paid"
    val KEY_TRANSACTION: String
        get() = "transaction"
    val KEY_PAYMENT: String
        get() = "payment"
    val DEFAULT_PAYMENT_ID: String
        get() = "00000000-0000-0000-0000-000000000000"
    val KEY_METHOD: String
        get() = "transaction_method"
    val CASH: String
        get() = "Cash"
    val QR_PAYMENT: String
        get() = "WAVit"
    val DEBIT: String
        get() = "Debit"
    val CREDIT: String
        get() = "Credit"
    val REFUND_TRANSACTION: String
        get() = "Refund"
    val VOID_TRANSACTION: String
        get() = "Void"
    val SUBTOTAL: String
        get() = "Sub-Total"
    val TOTAL: String
        get() = "Total"
    val AMOUNT: String
        get() = "Amount"
    val TRANSACTION_ID: String
        get() = "Transaction ID"
    val SIGNATURE: String
        get() = "Signature"
    val TAX: String
        get() = "Tax"
    val _TIP: String
        get() = "Tip"
    val DOLLAR_SYMBOL: String
        get() = "$"
    val COMMA_SYMBOL: String
        get() = ","
    val MINUS_SYMBOL: String
        get() = "-"
    val S_DEFAULT_AMOUNT: String
        get() = "0.00"

    @get:SuppressLint("SimpleDateFormat")
    val SDF: SimpleDateFormat
        get() = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")

    @get:SuppressLint("SimpleDateFormat")
    val SDF1: SimpleDateFormat
        get() = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    val PRE_AUTH: String
        get() = "Pre-Auth"
    val UTC: String
        get() = "UTC"
    val ELEMENTS: String
        get() = "elements"
    val YES: String
        get() = "Yes"
    val NO: String
        get() = "No"
    val DATE_FORMAT_YYYY_MM_DD: String
        get() = "yyyy-MM-dd"
    val TIME_FORMAT_HH_MM_SS: String
        get() = "HH:mm:ss aa"
    val AT: String
        get() = " at "

    @get:SuppressLint("SimpleDateFormat")
    val mDateFormat: SimpleDateFormat
        get() = SimpleDateFormat(DATE_FORMAT_YYYY_MM_DD)

    @get:SuppressLint("SimpleDateFormat")
    val mTimeFormat: SimpleDateFormat
        get() = SimpleDateFormat(TIME_FORMAT_HH_MM_SS)
    val STATUS_API_INTERVAL: Int
        get() = 10000
    val CANCEL_API_INTERVAL: Int
        get() = 20000
    val UNLOCK_PIN_LENGTH: Int
        get() = 4
    val LOG_FILE_DELETE_DAY: Int
        get() = -7
    val PRIORITY_INTERCEPT: Int
        get() = 200
    val API_TIMEOUT_SECONDS: Int
        get() = 60
    val ZERO: Int
        get() = 0
    val ONE: Int
        get() = 1
    val TWO: Int
        get() = 2
    val THREE: Int
        get() = 3
    val FOUR: Int
        get() = 4
    val FIVE: Int
        get() = 5
    val SIX: Int
        get() = 6
    val PROGRESS: Int
        get() = 100
    val VERIFY: Int
        get() = 200
    val INITIALIZE: Int
        get() = 400
    val PIN: Int
        get() = 2002
    val SETTINGS: Int
        get() = 202
    val BACK: Int
        get() = 501
    val TRANSACTIONS: Int
        get() = 502
    val LOGOUT: Int
        get() = 503
    val ABOUT: Int
        get() = 504
    val MENU: Int
        get() = 505
    val TIP: Int
        get() = 506
    val PAYMENT: Int
        get() = 507
    val STATUS: Int
        get() = 508
    val PRE_AUTH_CAPTURE: Int
        get() = 509
    val SUPPORT: Int
        get() = 510
    val CANCEL: Int
        get() = 511
    val CITCON_CANCEL: Int
        get() = 518
    val SPLASH: Int
        get() = 512
    val REFUND: Int
        get() = 513
    val MENU_OPTIONS: Int
        get() = 514
    val FILTER_OPTIONS: Int
        get() = 515
    val QR_SCAN_CODE: Int
        get() = 516
    val CITCON_REFUND: Int
        get() = 517
    val INVOICE: Int
        get() = 520
    val INVOICE_DETAILS: Int
        get() = 519
    val RESEND: Int
        get() = 521
    val TRANSACTION_SUCCEED: Int
        get() = 601
    val TRANSACTION_TIMEOUT: Int
        get() = 602
    val TRANSACTION_ERROR: Int
        get() = 603
    val TIMER: Int
        get() = 1000
    val SEC_03_TIMER: Int
        get() = 3000
    val SEC_04_TIMER: Int
        get() = 4000
    val SEC_60_TIMER: Int
        get() = 60000
    val SEC_30_TIMER: Int
        get() = 30000
    val SEC_15_TIMER: Int
        get() = 15000
    val DEFAULT_AMOUNT: Double
        get() = 0.00
    val DEFAULT_TIP_AMOUNT: Double
        get() = 9999999999999999999999999999.99
    val ONE_DOLLAR: Double  //100.00 cents
        get() = 100.00

}