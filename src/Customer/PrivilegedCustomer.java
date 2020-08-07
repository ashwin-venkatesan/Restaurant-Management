package Customer;

import Table.*;

public class PrivilegedCustomer extends Customer{

    final int Discount = 10;

    PrivilegedCustomer(){
        super();
    }

    public PrivilegedCustomer(String Name, long PhoneNumber, float BillAmount, int NoOfGuests, Table TableNo){
        super(Name, PhoneNumber, BillAmount, NoOfGuests, TableNo);       
        this.calcBill();
    }

    public void calcBill() {
        BillAmount = BillAmount - ((float) Discount / 100) * BillAmount;
    }

    public void calcBill(int Discount) throws IllegalArgumentException {
        if (Discount > -1 && Discount < 101)
            BillAmount = BillAmount - ((float)Discount/100)*BillAmount;         
        else 
            throw new  IllegalArgumentException("Illegal Discount Applied");       
    }

    public float getBill(){
        return (BillAmount);
    }
}