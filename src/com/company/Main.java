package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while(true){
            try{
                bankAccount.withDraw(6000);
                System.out.println(" На счете осталось " + bankAccount.getAmount());
            }
            catch (LimitException limitException){
                bankAccount.withDraw((int) limitException.getRemainingAmount());
                System.out.println("Были сняты последние " + limitException.getRemainingAmount()+ ". На счету не осталось денег ");
                break;
            }

        }

    }
}
