public class whours {

    static double TAH;
    //TH=Total Actual Hours worked
    static double RWH=48.00;
    //RWH=Regular Working hours
    static double reghours() {
        if (TAH <= RWH) {
            return TAH;}
        else if (TAH<0.00) {
            return 0.00;
        } else
            return RWH;}

    static double OTHours() {
        if (TAH > RWH)
            return (TAH-RWH);
        else if (TAH<0.00)
            return 0.00;
        else
            return 0.00;}

    static double LateUTHours() {
        if (TAH < RWH)
            return (RWH-TAH);
        else if (TAH<0.00)
            return 0.00;
        else
            return 0.00;}
    static double regOTRate() {
        return (125.00/100.00);}
}
