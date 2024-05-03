package wallet.banking.model;

import lombok.Data;

@Data
public class TopUpDto {
    private String accountNumber;
    private int amount;
}
