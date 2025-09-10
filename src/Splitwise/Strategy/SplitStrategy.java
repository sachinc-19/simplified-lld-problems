package Splitwise.Strategy;

import Splitwise.Split;
import Splitwise.User;

import java.util.List;

public interface SplitStrategy {
    List<Split> splitExpense(double amount, List<User> users);
}
