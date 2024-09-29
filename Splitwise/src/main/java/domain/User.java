package domain;

import domain.BalanceSheet.BalanceSheet;

import java.util.List;

public class User {
    int userId;
    String userName;
    String userEmail;
    BalanceSheet balanceSheet;
    List<Group> groups;

    public User(String userName, String userEmail, BalanceSheet balanceSheet, List<Group> groups) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.balanceSheet = balanceSheet;
        this.groups = groups;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    public void setBalanceSheet(BalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
