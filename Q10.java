public class Q10 {
    public int add(int a, int b) {return a+b;}
    public double add(double a, double b) {return a+b;}
    public int multiply(int a, int b) {return a*b;}
    public float multiply(float a, float b) {return a*b;}
    public String concatStr(String a, String b) {return a.concat(b);}
    public String concatStr(String a, String b, String c) {return a.concat(b).concat(c);}
    public static void main(String[] args) {
        Q10 overLoadMethods = new Q10();
        //A
        System.out.println(overLoadMethods.add(5,10));
        //B
        System.out.println(overLoadMethods.add(6.55, 8.456));
        //C
        System.out.println(overLoadMethods.multiply(3.2f, 6.8f));
        //D
        System.out.println(overLoadMethods.multiply(3,8));
        //E
        System.out.println(overLoadMethods.concatStr("hello ", "world"));
        //F
        System.out.println(overLoadMethods.concatStr("Hello", "world", "again"));
    }
}
