package com.easyqrpay.modules.dtoModule.dto.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class CreditCardDateFormat {
    public static DateFormat getCreditCardDateFormatter() {
        return new SimpleDateFormat("MM/yyyy");
    }
}
