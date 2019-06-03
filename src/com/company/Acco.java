package com.company;

public class Acco {

    private String number;
    private double balance;
    private String user_name;
    private String user_mail;
    private String user_phno;

    public Acco(String number, double balance, String user_name,String user_mail,String user_phno){

        System.out.println("Last Constructor has created");
        this.number = number;
        this.balance = balance;
        this.user_name = user_name;
        this.user_mail = user_mail;
        this.user_phno = user_phno;
    }

    public Acco(){
        System.out.println("First Constructors has created");
    }

    public void deposit(double deposit_amount){
        this.balance += deposit_amount;
        System.out.println("Deposited "+deposit_amount+" processed. Balance is "+this.balance);
    }

    public void withdrawal(double withdrawal_amount){
        if(this.balance - withdrawal_amount <= 0){
            System.out.println("Only " + this.balance +" available. Withdrawal balance not possible");
        }else{
            this.balance -= withdrawal_amount;
            System.out.println("Withdrawal "+withdrawal_amount+" Processed. Remaining Balance is "+this.balance);
        }
    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_mail() {
        return user_mail;
    }

    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }

    public String getUser_phno() {
        return user_phno;
    }

    public void setUser_phno(String user_phno) {
        this.user_phno = user_phno;
    }
}
