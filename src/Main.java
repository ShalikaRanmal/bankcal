import com.Banks.*;
import com.bank.Bank;
import com.ratecal.RateCalculate;

public class Main {
    public static void main(String[] args) {

        Bank sampath = new Sampath(0.12, 1000);
        Bank commercial = new Commercial(0.12, 1000);
        Bank boc= new BOC(0.11, 1000);
        Bank peoples = new Peoples(0.15,1000);
        Bank hsbc = new HSBC(0.13, 1000);

        RateCalculate rateCal = new RateCalculate();

        System.out.println("Sampath bank interest:"+ rateCal.rateCalculate(sampath));
        System.out.println("Commercial bank interest:"+ rateCal.rateCalculate(commercial));
        System.out.println("BOC interest:"+ rateCal.rateCalculate(boc));
        System.out.println("Peoples bank interest:"+ rateCal.rateCalculate(peoples));
        System.out.println("HSBC interest:"+ rateCal.rateCalculate(hsbc));

    }
}