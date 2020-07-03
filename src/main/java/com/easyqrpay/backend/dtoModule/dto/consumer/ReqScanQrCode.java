package com.easyqrpay.backend.dtoModule.dto.consumer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReqScanQrCode {
    private String qrCode;
}
