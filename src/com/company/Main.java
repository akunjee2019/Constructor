package com.company;

public class Main {

    public static void main(String[] args) {

        Acco myacc = new Acco("123",1200,"Taufik","taufik@mail.com","01987");
        System.out.println(myacc.getNumber());
        System.out.println(myacc.getBalance());


        myacc.deposit(10000.00);
        myacc.withdrawal(593.00);




	// write your code here
    }
}
