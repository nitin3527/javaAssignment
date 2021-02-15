enum Fruits {
    apple(150),banana(40),mango(60),orange(50),pineapple(70);
    int price;
    Fruits(int i) {
        price = i;
    }
    int getPrice(){
        return price;
    }
}
public class Q9 {
    public static void main(String[] args) {
        System.out.println("Prices of fruits are");
        for(Fruits f: Fruits.values()){
            System.out.println(f + " will cost you " + f.getPrice() + " rupees");
        }
    }
}
