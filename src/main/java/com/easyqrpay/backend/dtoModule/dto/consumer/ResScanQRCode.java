package com.easyqrpay.backend.dtoModule.dto.consumer;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class ResScanQRCode {
    private Long invoiceNumber;
    private Date data;
    private Double tripFare;
    private Double tripExtraFee;
    private Double tax;
    private Double grandTotal;
}
