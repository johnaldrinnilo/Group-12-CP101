public class deds {
    static double taxablebase;
    static double mbs;
    static double wtax() {
//to compute weekly withholding tax
        if (taxablebase < 4808.00)
            return 0.00;
        else if (taxablebase < 7692.00)
            return ((taxablebase-4808.00)*20.00)/100.00;
        else if (taxablebase < 15385.00)
            return ((((taxablebase-7692.00)*25.00)/100.00)+2500.00);
        else if (taxablebase < 38462.00)
            return ((((taxablebase-15385.00)*30.00)/100.00)+10833.33);
        else if (taxablebase < 153846.00)
            return ((((taxablebase-38462.00)*32.00)/100.00)+40833.33);
        else if (taxablebase > 153846.00)
            return ((((taxablebase-153846.00)*35.00)/100.00)+200833.33);
        else return 0.00;
    }
    static double hdmf() {
//to compute weekly HDMF ee share
        if (mbs <= 1500.00)
            return (mbs * 1.00) / 100.00;
        else {
            return (100.00 / 4.00);
        }
    }
        static double sss() {
//to compute weekly SSS share
            if (mbs < 3250.00)
                return (135.00/4.00);
            if (mbs >= 24750.00)
                return (1125.00 / 4.00);

            double filler=0.00, abovemin=157.50;

            for (double bs=3250.00; bs<=24750;bs +=500)
            {
                if (mbs>=bs && mbs < bs+500.00)
                {
                    filler=abovemin;
                    break;
                }
                abovemin+=22.50;
            }
            return (filler/4.00);
        }
    static double ph() {
//to compute weekly PHIC ee share
        if (mbs <= 10000.00)
            return (300.00/4.00);
        else if (mbs <= 59999.99)
            return ((mbs*3)/100)/4.00;
        else
            return (1800.00/4.00);
    }

}
