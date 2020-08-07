package Table;

public abstract class Table{

    protected int sixs;
    protected int fours;
    protected int twos;
    protected int gTable;
    protected int Tfnum;
    protected int Ttnum;
    protected int Tsnum;
    protected int Tgnum;
    protected int Tnum;
    protected int nog;
    protected char Type;
    protected int ReservationId;
    
    public abstract float AddCharge(float BillAmount);
    public abstract String ReturnTableName(int Tnum);
    

 

    Table(){                        // Default constructor
        sixs = 10;      //six seater
        fours = 10;     //Four seater
        twos = 10;      //Two seater
        gTable=10;      //Group Table
        Tfnum=39;       //4_(number in '_' describes table number of 4 seater)
        Ttnum=19;
        Tsnum=59;
        Tgnum=9;        //Table Group Num
        Tnum = 0;
        nog = 0;
        Type = 'N';
        ReservationId = 0;
        }

    public Table(int nog,char Type){        // Parameterised constructor
        this.Type=Type;
        this.nog=nog;
        sixs = 10;      //six seater
        fours = 10;     //Four seater
        twos = 10;      //Two seater
        gTable=10;      //Group Table
        Tfnum=39;       //4_(number in '_' describes table number of 4 seater)
        Ttnum=19;
        Tsnum=59;
        Tgnum=9;        //Table Group Num
    }

    
        
    public int ReturnTableNumber( int nog,char Type){
        if(nog<=2&&twos>0)
        {   Ttnum+=1;
            twos-=1;
            Tnum=Ttnum;
            
        }
        else if(nog>2&&nog<=4&&fours>0)
        {   Tfnum+=1;
            fours-=1;
            Tnum=Tfnum;
        }
        else if(nog>4&&nog<=6&&sixs>0)
        {   Tsnum+=1;
            sixs-=1;
            Tnum=Tsnum;
        }    
        
        else {
            Tgnum+=1;
            gTable-=1;
            Tnum=Tgnum;
        }

        
        return Tnum;
        
        
    }
    
    
    public void FreeTable(int Tnum){              

        if(Tnum/10==2)
        twos+=1;
        else if(Tnum/10==4)
        fours+=1;
        else if(Tnum/10==6)
        sixs+=1;
        else
        Tgnum+=1;


        
    }
}