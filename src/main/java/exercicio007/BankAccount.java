package exercicio007;

import java.util.Objects;
import java.util.Scanner;

public class BankAccount {
    public int accountNumber;
    protected String accountType;
    private String accountOwner;
    private  float accountBalance;
    private boolean accountStatus;

    public void showState() {
        System.out.println("---------------------------------");
        System.out.println("Conta de número " + getAccountNumber());
        System.out.println("Do tipo " + getAccountType());
        System.out.println("O dono é " + getAccountOwner());
        System.out.println("O saldo atual é de: " + getAccountBalance());
        System.out.println("A conta esta aberta? " + getAccountStatus());
    }

    public BankAccount() {
        this.setAccountBalance(0);
        this.setAccountStatus(false);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int clientNumber) {
        this.accountNumber = clientNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String type) {
        this.accountType = type;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String name) {
        this.accountOwner = name;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float balance) {
        this.accountBalance = balance;
    }

    public boolean getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(boolean status) {
        this.accountStatus = status;
    }
    public void openAccount(String type) throws Exception {
        setAccountType(type);
        this.setAccountStatus(true);
        if(Objects.equals(type, "CC")) {
            this.setAccountBalance(50);
            System.out.println("Conta corrente criada com sucesso!");
        } else if (Objects.equals(type, "CP")) {
            this.setAccountBalance(150);
            System.out.println("Conta poupança criada com sucesso!");
        } else {
            throw new Exception("Tipo de conta não existente!");
        }
    }
    public void closeAccount(){
        if(this.getAccountBalance() > 0){
            System.out.println("Impossivel fechar conta. Ainda a saldo em sua conta.");
        } else if(this.getAccountBalance() < 0){
            System.out.println("Impossivel fechar conta. A conta possui debito.");
        } else {
            this.setAccountStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }
    public void deposit(float depositAmount){
        if(this.getAccountStatus()){
            setAccountBalance(this.getAccountBalance() + depositAmount);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getAccountOwner() + "!");
        } else {
            System.out.println("Impossivel realizar deposito em uma conta fechada ou inexistente!");
        }
    }
    public void withdraw(float withdrawalValue){
        if(this.getAccountStatus()){
            if(this.getAccountBalance() >= withdrawalValue) {
                this.setAccountBalance(this.getAccountBalance() - withdrawalValue);
                System.out.println("O valor foi sacado com sucesso na conta de " + this.getAccountOwner() + "!");
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        }else {
            System.out.println("Impossivel realizar um sacar em uma conta fechada ou inexistente!");
        }
    }
    public void payMonthlyBill(){
        int monthlyFee = 0;
        if(Objects.equals(getAccountType(), "CC")){
            monthlyFee = 12;
        } else if(Objects.equals(getAccountType(), "CP")) {
            monthlyFee = 20;
        }
        if(getAccountStatus()){
            this.setAccountBalance(this.getAccountBalance() - monthlyFee);
            System.out.println("Mensalidade paga com sucesso senhor(a) " + this.getAccountOwner() + "!");
        } else {
            System.out.println("Impossivel pagar por uma conta inexistente");
        }
    }
}
