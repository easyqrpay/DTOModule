package com.easyqrpay.modules.dtoModule.dto.digitallWallet;

import lombok.Data;


@Data
public class ResCardDTO {
    private String token;
    private String title;
    private String to;
    private String cardNumber;

    private ResCardDTO() {}

    private ResCardDTO(String title, String to, Long cardNumber) {
        this();
        setTitle(title);
        setCardNumber(cardNumber);
        setTo(to);
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    private void setCardNumber(Long cardNumber) {
        String strCardNumber = String.valueOf(cardNumber);
        StringBuilder builder = new StringBuilder();

        char[] strArr = strCardNumber.toCharArray();
        for (int index = 0; index < strArr.length; index++) {
            System.out.println("Index: "  + index);
            if (index < 4 || index > 12) {
                builder.append(strArr[index]);
            } else {
                builder.append("*");
            }
        }
        setCardNumber(builder.toString());
    }

    public static ResCardDTO getResCardDTO(ReqCardDTO reqCardDTO) {
        return new ResCardDTO(reqCardDTO.getTitle(), reqCardDTO.getTo(), reqCardDTO.getCardNumber());
    }

    @Override
    public String toString() {
        return "ResCardDTO{" +
                "title='" + title + '\'' +
                ", to='" + to + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
