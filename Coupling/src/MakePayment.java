

public class MakePayment {
    Payment p;
    MakePayment(Payment p){
        this.p = p;
    }
    public void makePayment(){
        p.pay();
    }
    public static void main(String args[]){
        MakePayment mp1 = new MakePayment(new DebitCard());
        MakePayment mp2 = new MakePayment(new CreditCard());
        MakePayment mp3 = new MakePayment(new Cash());
        mp1.makePayment();
        mp2.makePayment();
        mp3.makePayment();
    }
}
