package com.easyqrpay.modules.dtoModule.dto.transaction;

import com.easyqrpay.modules.dtoModule.dto.types.TransactionStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
public class ResTransactionDTO {
    private Long id;
    private Date genDate;
    private TransactionStatus transactionStatus;
    private Double totalAmount;
    private String cardNumber;
}
