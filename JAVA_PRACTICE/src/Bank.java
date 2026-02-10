public class Bank {
    private int balance;
    private int account_number;
    int amount;
      public void deposit(int amount) {
          if (balance > 0) {
             this.balance += amount;
              System.out.println("remaining balance =" + balance);
          } else {
              System.out.println("invalid stmt");
          }
      }
        public void withdraw(int amount){
            if (amount > 0 && amount <= balance) {
               this.balance -=  amount;
                System.out.println(balance);
            }
            else{
                System.out.println("invalid");
            }
        }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        Bank b= new Bank();
        b.account_number=45125;
        b.setBalance(120);

        b.deposit(50);
        b.withdraw(30);
        System.out.println(b.account_number);

}

}
