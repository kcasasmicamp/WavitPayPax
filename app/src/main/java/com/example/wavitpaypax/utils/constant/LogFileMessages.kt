package com.example.wavitpaypax.utils.constant

interface LogFileMessages {

    class Messages:LogFileMessages {

        companion object {
            const val INFO = "INFO : "
            const val ERR = "ERR : "
            const val PRINTING = INFO + "Printing is initializing..."
            const val PRINT_ERROR = ERR + "Something went wrong during printing: "
            const val PAYMENT_REQUEST = INFO + "Created Payment Request: "
            const val MANAGE_REQUEST = INFO + "Created Manage Request: "
            const val PROCESS_TRANS_RESULT = INFO + "Process Transaction Result: "
            const val PROCESS_TRANS_ERROR = ERR + "Process Transaction Error: "
            const val CARD_ACTION = INFO + "Card detected action is: "
            const val SALE_RESPONSE = INFO + "PAX Sale Response: "
            const val REFUND_RESPONSE = INFO + "Refund Payment Response: "
            const val VOID_RESPONSE = INFO + "Void Payment Response: "
            const val PRE_AUTH_RESPONSE = INFO + "PAX PreAuth Response: "
            const val PRE_AUTH_CAPTURE_RESPONSE = INFO + "PAX PreAuth Capture Response: "
            const val ADJUST_TIP_RESPONSE = INFO + "PAX Adjust Tip Response: "
            const val ERROR_TRANSACTION = ERR + "Error during transaction "
            const val ERROR_REFUND = ERR + "Error during refund the transaction "
            const val ERROR_VOID = ERR + "Error during void the transaction "
            const val ERROR_IN_PARSE_DATA = ERR + "Error during parseData "
            const val URL = INFO + "API URL: "
            const val PARAM = INFO + "Request Param: "
            const val RESPONSE = INFO + "API Response: "
            const val MAIN_RESPONSE = INFO + "API Main Response: "
            const val API_RESPONSE_CODE = INFO + "API Response code: "
            const val RESPONSE_ERROR = ERR + "API Response Error: "
            const val DIRECTORY_NOT_FOUND = INFO + "Application directory not found"
            const val EXCEPTION_IN_CURSOR_POSITION = ERR + "Exception in cursor position"
            const val EXCEPTION_DURING_AUTH = "Exception in auth"
            const val CONVERSION_ERROR = ERR + "Error converting to list- "
            const val TIP_ADJUST_REQUEST = INFO + "Tip adjust request: "
            const val READY_FILE_TO_UPLOAD = INFO + "Log file is ready to upload"
            const val FILE_IS_UPLOADING = INFO + "Log file is uploading"
            const val FILE_HAS_UPLOADED = INFO + "Log file has uploaded"
            const val FTP_REPLY_CODE = INFO + "Reply code:"
            const val FTP_REPLY_MESSAGE = " Reply message:"
            const val NETWORK_NOT_AVAIL = INFO + "Network not available"
            const val SIGNAL_R_ALREADY_CONNECTED = INFO + "SignalR already connected"
            const val SIGNAL_R_CONNECTING = INFO + "SignalR connecting"
            const val SIGNAL_R_RECONNECTING = INFO + "SignalR reconnecting"
            const val SIGNAL_R_CONNECTED = INFO + "SignalR connected"
            const val SIGNAL_R_DISCONNECTING = INFO + "SignalR disconnecting"
            const val SIGNAL_R_DISCONNECTED = INFO + "SignalR disconnected"
            const val SIGNAL_R_NOT_PAYMENT = INFO + "Payment not found"
            const val SIGNAL_R_PAYMENT_ERR = ERR + "Payment error: "
            const val SIGNAL_R_NOT_CONNECTED =
                INFO + "HubConnection is not connected while calling SignalR method "
            const val CALL_SIGNAL_R_METHOD = INFO + "From Terminal calling SignalR Method "
            const val LISTEN_SIGNAL_R_METHOD = INFO + "Receive message in SignalR Method "
            const val SIGNAL_R_ERROR = ERR + "Receive error during to call SignalR Method "
            const val HUB_DISCONNECTED = "Hub disconnected"
            const val SOMETHING_NULL = INFO + "Something found null"
            const val POS_LINK_SCANNER_RESULT = INFO + "Scanner Result: "
            const val POS_LINK_SCANNER_ERROR = ERR + "Scanner Error: "
            const val SCANNER_FORMAT = INFO + "Format: "
            const val SCANNER_CONTENT = INFO + "Content: "
            const val HOST_IP_ADDRESS = INFO + "Host IP Address: "
        }
    }
        }


