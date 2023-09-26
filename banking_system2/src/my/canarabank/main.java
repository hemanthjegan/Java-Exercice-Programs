package my.canarabank;

import cashwithdraw.withdraw;
import openacc.createacc;

public class main {
    public static void main(String[] args) {
        createacc c = new createacc();
        c.acc();
        withdraw w = new withdraw();
        w.disp();
    }
}
