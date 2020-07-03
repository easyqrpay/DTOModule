package com.easyqrpay.backend.dtoModule.dto.invoice;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReqInvoiceDTO {
    private Long id;
    private Long consumerId;
    private Long producerId;
    @JsonAlias(value = {"qrCode"})
    private String qr;
    private Double totalAmount;
}
