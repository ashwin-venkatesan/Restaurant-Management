package Customer;

import Table.*;

public class NonPrivilegedCustomer extends Customer {

    int Discount;

    NonPrivilegedCustomer(){  
        super();        
        Discount = 0;
    }

    public NonPrivilegedCustomer(String Name, long PhoneNumber, float BillAmount, int NoOfGuests, Table TableNo, int Discount){
        super(Name, PhoneNumber, BillAmount, NoOfGuests, TableNo);
        this.Discount = Discount;
        this.calcBill();
    }

    public void calcBill() throws IllegalArgumentException {
        if (Discount > -1 && Discount < 101)
            BillAmount = BillAmount - ((float)Discount/100)*BillAmount;         
        else 
            throw new  IllegalArgumentException("Illegal Discount Applied");
    }

    public void calcBill(int Discount){
        BillAmount = BillAmount - ((float)Discount/100)*BillAmount;        
    }

    public float getBill(){
        return (BillAmount);
    }
}