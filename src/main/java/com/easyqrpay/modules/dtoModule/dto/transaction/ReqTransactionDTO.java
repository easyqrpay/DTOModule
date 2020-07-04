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
    private Date from;
    private Date to;
    private TransactionStatus status;
    @JsonIgnore
    private UserType userType;
}
