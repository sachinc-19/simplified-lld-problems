package Splitwise;

import Splitwise.Strategy.SplitStrategy;

import java.util.List;

class Expense {
    private String id;
    private double amount;
    private User paidBy;
    private List<Split> splits;

    public Expense(String id, double amount, User paidBy,
                   SplitStrategy strategy, List<User> participants) {
        this.id = id;
        this.amount = amount;
        this.paidBy = paidBy;
        this.splits = strategy.splitExpense(amount, participants);
    }

    public User getPaidBy() { return paidBy; }
    public List<Split> getSplits() { return splits; }
    public double getAmount() { return amount; }

    public boolean validate() {
        double total = 0;
        for(Split s : splits) total += s.getAmount();
        return Math.abs(total - amount) < 0.01;
    }
}

