class rbi{
    float roi = 2.0f;
    void rbi_bank(){

    }
}
class hdfc extends rbi{
    float hroi = 6.0f;
    void hdfc_baank(){
        System.out.println("The Rate of Interest of HDFC Bank : "+(roi + hroi));
    }
}

class sbi extends rbi{
    float sroi = 7.0f;
    void sbi_bank(){
        System.out.println("The Rate of Interest of SBI Bank : "+ (roi + sroi));
    }
}
class icici extends rbi{
    float iroi = 8.0f;
    void icici_bank(){
        System.out.println("The Rate of Interest of ICICI Bank : "+(roi + iroi));
    }
}

public class hierarichal {
    public static void main(String[] args) {
        hdfc h = new hdfc();
        h.hdfc_baank();
        sbi s = new sbi();
        s.sbi_bank();
        icici i = new icici();
        i.icici_bank();
    }
}
