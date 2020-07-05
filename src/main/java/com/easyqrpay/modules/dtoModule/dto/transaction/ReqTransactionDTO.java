package com.easyqrpay.modules.dtoModule.dto.transaction;

import com.easyqrpay.modules.dtoModule.dto.types.TransactionStatus;
import com.easyqrpay.modules.dtoModule.dto.types.UserType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class ReqTransactionDTO {
    private Long from;
    private Long to;
    private TransactionStatus status;
    private UserType userType;

    public ReqTransactionDTO(Long from, Long to, TransactionStatus transactionStatus, UserType userType) {
        this.from = from;
        this.to = to;
        this.status = transactionStatus;
        this.userType = userType;
    }

}
