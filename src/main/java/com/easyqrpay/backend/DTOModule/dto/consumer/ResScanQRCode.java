package com.easyqrpay.backend.DTOModule.dto.consumer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResScanQRCode {
    private Long invoiceNumber;
    private Data data;
    private Double tripFare;
    private Double tripExtraFee;
    private Double tax;
    private Double grandTotal;
}
