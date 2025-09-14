package Splitwise;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BalanceSheet {
    private Map<User, Map<User, Double>> balances = new HashMap<>();
    public void updateBalance(User paidBy, List<Split> splits) {
        for(Split split : splits) {
            User owedBy = split.getUser();
            if(owedBy.equals(paidBy)) continue;

            balances.putIfAbsent(paidBy, new HashMap<>());
            balances.putIfAbsent(owedBy, new HashMap<>());

            balances.get(paidBy)
                    .put(owedBy, balances.get(paidBy).getOrDefault(owedBy, 0.0) + split.getAmount());

            balances.get(owedBy)
                    .put(paidBy, balances.get(owedBy).getOrDefault(paidBy, 0.0) - split.getAmount());
        }
    }

    public void showBalances() {
        boolean empty = true;
        for(User u1 : balances.keySet()) {
            for(User u2 : balances.get(u1).keySet()) {
                double amount = balances.get(u1).get(u2);
                if(amount > 0) {
                    empty = false;
                    System.out.println(u2.getName() + " owes " + u1.getName() + ": " + amount);
                }
            }
        }
        if(empty) System.out.println("No balances remaining!");
    }
}