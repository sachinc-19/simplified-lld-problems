package Splitwise;

import java.util.ArrayList;

import java.util.List;

class Group {
    private String id;
    private String name;
    private List<User> members = new ArrayList<>();
    private List<Expense> expenses = new ArrayList<>();

    public Group(String id, String name) {
        this.id = id; this.name = name;
    }

    public void addMember(User user) {
        members.add(user);
    }

    public void addExpense(Expense expense, BalanceSheet balanceSheet) {
        if(expense.validate()) {
            expenses.add(expense);
            balanceSheet.updateBalance(expense.getPaidBy(), expense.getSplits());
        } else {
            System.out.println("Invalid expense!");
        }
    }

    public List<User> getMembers() { return members; }
}
