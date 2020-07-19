package com.easyqrpay.modules.dtoModule.dto.invoice;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class ResInvoiceDTO {
    private Long id;
    private String qr;
    private Double totalAmount;
    private Date generatedDate;
    private Date dueDate;
    private Long producerId;
    private Long consumerId;
}
