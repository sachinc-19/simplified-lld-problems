package Splitwise.Strategy;

import Splitwise.Split;
import Splitwise.User;

import java.util.ArrayList;
import java.util.List;

public class EqualSplitStrategy implements SplitStrategy{
    @Override
    public List<Split> splitExpense(double amount, List<User> users) {
        double share = amount / users.size();
        List<Split> splits = new ArrayList<>();
        for(User user : users) {
            splits.add(new Split(user, share));
        }
        return splits;
    }
}