package day1;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class BankAccount {
    //states

    //you can assign value like this to resolve null point exception

    private AccountType accountType;
    private String accountNumber = "";
    private String accountOwner;
    private double balance;
    //    Arrays statement;
    private Address address;
    private String openingDate;
    private String openingBranch;
    private String socialSecurityNumber;
    private final String BANK_NAME = "Jp Morgan Chase";

    String licenceNumber;

    public BankAccount() {}

    public BankAccount(String accountNumber, String accountOwner, double balance, Address address, String openingDate, String openingBranch, String socialSecurityNumber) {
        this.accountNumber = accountNumber;
        this.accountOwner = Objects.requireNonNullElse(accountOwner,"Guest-" + UUID.randomUUID());
        this.balance = balance;
        this.address = address;
        this.openingDate = openingDate;
        this.openingBranch = openingBranch;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public BankAccount(String accountNumber, String accountOwner, double balance, Address address, String openingDate, String openingBranch, String socialSecurityNumber, String licenceNumber) {
//        this.accountNumber = accountNumber;
//        this.accountOwner = accountOwner;
//        this.balance = balance;
//        this.address = address;
//        this.openingDate = openingDate;
//        this.openingBranch = openingBranch;
//        this.socialSecurityNumber = socialSecurityNumber;
        this(accountNumber,accountOwner,balance,address,openingDate,openingBranch,socialSecurityNumber);
        this.licenceNumber = licenceNumber;
    }

    public BankAccount(String accountNumber, String abhijeet, double balance, String city, String openingDate, String haltom, String socialSecurityNumber) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
        this.address = address;
        this.openingDate = openingDate;
        this.openingBranch = openingBranch;
        this.socialSecurityNumber = socialSecurityNumber;
//        this.address.setCity(city);
    }

    //getters and setters
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOwner() {
        return this.accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getOpeningDate() {
        return this.openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public String getOpeningBranch() {
        return this.openingBranch;
    }

    public void setOpeningBranch(String openingBranch) {
        this.openingBranch = openingBranch;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getBANK_NAME() {
        return this.BANK_NAME;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    //Behaviour(bank application)

    //check balance
    public double checkBalance(){

        return this.balance;
    }
    //statements
    public String statement(String startingDate, String endingDate){
        //write your logic
        return this.accountNumber;
    }

    //deposit
    public double deposit(BankAccount toAccount, double amountToBeDeposited) {
        return 0.00;
    }

    //withdrawal
    public double withdrawal(BankAccount fromAccount, double amountToBeWithdrawal) {
        return 0.00;
    }

    //order checks
    public boolean orderChecks(BankAccount accountNumber){
        return true;
    }

    // transfer funds
    public boolean transferFunds(BankAccount toAccount, BankAccount fromAccount, double amountToBeTransfered){
        // some logic to transfer balance
        return true;
    }

    //link credit card
    public void linkCreditCard(String creditCardNumber){
        //write your logic here...

        // this le chai jun function le yaslai call garirako chha tyasaiko object bujauchha
    }

}