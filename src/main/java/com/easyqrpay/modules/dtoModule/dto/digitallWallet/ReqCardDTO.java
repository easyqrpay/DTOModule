package com.easyqrpay.modules.dtoModule.dto.digitallWallet;

import com.easyqrpay.modules.dtoModule.dto.utils.CreditCardDateFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DateFormat;
import java.util.Date;

@Data
@NoArgsConstructor
public class ReqCardDTO {
    private String title;
    private String to;
    private Long cardNumber;
    private Integer key;

    public ReqCardDTO(String title, Date to, Long cardNumber, Integer key) {
        this.title = title;
        setTo(to);
        this.cardNumber = cardNumber;
        this.key = key;
    }

    public void setTo(Date date) {
        DateFormat format = CreditCardDateFormat.getCreditCardDateFormatter();
        to = format.format(date);
    }

    public void setTo(String date) {
        this.to = date;
    }

    public static ReqCardDTO parseCardInfo(String cardInfo) {
        ReqCardDTO reqCardDTO = new ReqCardDTO();
        String[] infoArray = cardInfo.split(":");
        reqCardDTO.setTitle(infoArray[0]);
        reqCardDTO.setTo(infoArray[1]);
        reqCardDTO.setCardNumber(Long.parseLong(infoArray[2]));
        reqCardDTO.setKey(Integer.parseInt(infoArray[3]));
        return reqCardDTO;
    }


    @Override
    public String toString() {
        return title + ":" + to + ":" + cardNumber + ":" + key;
    }
}
