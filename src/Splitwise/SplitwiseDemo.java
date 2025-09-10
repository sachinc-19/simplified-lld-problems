package Splitwise;

import Splitwise.Strategy.EqualSplitStrategy;


public class SplitwiseDemo {
    public static void main(String[] args) {

        System.out.println("------S P L I T W I S E------");
        BalanceSheet balanceSheet = new BalanceSheet();
        // Create Users
        User A = new User("U1", "Alice", "alice@mail.com");
        User B = new User("U2", "Bob", "bob@mail.com");
        User C = new User("U3", "Charlie", "charlie@mail.com");

        Group trip = new Group("G1", "Goa Trip");
        trip.addMember(A);
        trip.addMember(B);
        trip.addMember(C);

        Expense dinner = new Expense("E1", 3000, A, new EqualSplitStrategy(), trip.getMembers());
        trip.addExpense(dinner, balanceSheet);

        // Expense 2: Bob paid 1500 for taxi (equal split)
        Expense taxi = new Expense("E2", 1500, B, new EqualSplitStrategy(), trip.getMembers());
        trip.addExpense(taxi, balanceSheet);

        // Show balances
        System.out.println("Final Balances:");
        balanceSheet.showBalances();

    }
}
