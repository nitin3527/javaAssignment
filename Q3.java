public class Q3 {
    public static void main(String[] args) {
        String str = "java is a very nice programming language";
        int count = str.length() - str.replace("a", "").length();
        System.out.println("a letter is repated " + count + " times");
    }
}
