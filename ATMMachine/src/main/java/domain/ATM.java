package domain;

import domain.Command.DispenseCashCommand;
import domain.DispenseStrategy.DispenseStrategy;
import domain.enums.Denominations;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ATM {

    Map<Denominations, Integer> denomMap;
    DispenseStrategy dispenseStrategy;
    User user;

    public boolean depositMoney(int totalAmount, Map<Denominations, Integer> denomMap) {
        for (Map.Entry entry : denomMap.entrySet()) {
            Denominations denominations = (Denominations) entry.getKey();
            int noteCount = (int) entry.getValue();
            denomMap.put(denominations, denomMap.getOrDefault(denominations, 0) + noteCount);
        }
        return true;
    }

    public void dispenseMoney(int totalAmount) {
        DispenseCashCommand dispenseCashCommand = new DispenseCashCommand(this ,user, totalAmount);
    }

}
