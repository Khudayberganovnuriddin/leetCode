package leetcode.WixEngineering.ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvalidTransactions {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> result = new ArrayList<>();
        Map<String, List<Transaction>> records = new HashMap<>();
        for (String trans : transactions) {
            final Transaction transaction = new Transaction(trans);
            if (records.containsKey(transaction.name)) {
                records.get(transaction.name).add(transaction);
            } else {
                List<Transaction> list = new ArrayList<>();
                list.add(transaction);
                records.put(transaction.name, list);
            }
        }

        for (String trans : transactions) {
            Transaction transaction = new Transaction(trans);
            if (!isValid(records.get(transaction.name), transaction)) {
                result.add(trans);
            }
        }
        return result;
    }

    private boolean isValid(List<Transaction> transactions, Transaction transaction) {
        if (transactions.size() <= 1 && transaction.amount < 1000) return true;
        for (Transaction trans : transactions) {
            if (transaction.invalidTransaction(trans.city, trans.time)) {
                return false;
            }
        }
        return true;
    }

    private class Transaction {
        String name;
        int time;
        int amount;
        String city;


        public Transaction(String trans) {
            String[] t = trans.split(",");
            name = t[0];
            time = Integer.parseInt(t[1]);
            amount = Integer.parseInt(t[2]);
            city = t[3];
        }

        public boolean invalidTransaction(String city, int time) {
            return invalidAmount() || differentCity(city, time);
        }

        private boolean differentCity(String city, int time) {
            return !this.city.equals(city) && Math.abs(this.time - time) <= 60;
        }

        private boolean invalidAmount() {
            return this.amount > 1000;
        }
    }
}
