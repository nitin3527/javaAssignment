class Bank{
    public void getDetais(){
        System.out.println("Your Bank details are");
    }
}
class Icici extends Bank{
    @Override
    public void getDetais() {
        super.getDetais();
        System.out.println("This is ICICI bank");

    }
}
class Sbi extends  Bank{
    @Override
    public void getDetais() {
        super.getDetais();
        System.out.println("This is SBI bank");
    }
}
class Boi extends Bank{
    @Override
    public void getDetais() {
        super.getDetais();
        System.out.println("This is BOI bank");
    }
}
public class Q11 {
    public static void main(String[] args) {
        Icici icici = new Icici();
        Sbi sbi = new Sbi();
        Boi boi = new Boi();
        icici.getDetais();
        sbi.getDetais();
        boi.getDetais();
    }
}
