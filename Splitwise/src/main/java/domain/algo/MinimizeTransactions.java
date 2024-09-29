package domain.algo;

import domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimizeTransactions {

    public Map<User, Double> minimizeTxn(Map<User, Double> txnMaps) {
        List<User> creditors = new ArrayList<>();
        List<User> debtors = new ArrayList<>();
        Map<User, Double> result = new HashMap<>();

        // Divide users into creditors and debtors based on net balances
        for (Map.Entry<User, Double> entry : txnMaps.entrySet()) {
            if (entry.getValue() > 0) {
                creditors.add((User) entry.getKey());
            } else if (entry.getValue() < 0) {
                debtors.add((User) entry.getKey());
            }
        }
        int i = 0, j = 0;
        while (i < debtors.size() && j < creditors.size()) {
            User debtor = debtors.get(i);
            User creditor = creditors.get(j);
            Double debtorAmount = -txnMaps.get(debtor);
            Double creditorAmount = txnMaps.get(creditor);

            // Find the minimum amount to settle
            Double settleAmount = Math.min(debtorAmount, creditorAmount);
            result.put(debtor, -settleAmount);
            result.put(creditor, -settleAmount);


            // Update the balances
            txnMaps.put(debtor, txnMaps.get(debtor) + settleAmount);
            txnMaps.put(creditor, txnMaps.get(creditor) - settleAmount);

            // Move to the next debtor or creditor
            if (txnMaps.get(debtor) == 0) i++;
            if (txnMaps.get(creditor) == 0) j++;
        }

        return result;
    }
}

