package com.easyqrpay.modules.dtoModule.dto.types;

//        1 ---------> INITIALIZE
//        2 ---------> All
//        3 ---------> Pending
//        4 ---------> Paid
//        5 ---------> Void
//        6 ---------> Expired


public enum TransactionStatus {
    INITIALIZE,
    ALL,
    PENDING,
    PAID,
    VOID,
    EXPIRED
}
