public class IncrementExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        // Pre-increment: ++variable
        int preIncrement = ++a;  // a is incremented to 6, then preIncrement is assigned 6
        System.out.println("Pre-Increment: a = " + a + ", preIncrement = " + preIncrement);

        // Post-increment: variable++
        int postIncrement = b++;  // postIncrement is assigned 5 (current value of b), then b is incremented to 6
        System.out.println("Post-Increment: b = " + b + ", postIncrement = " + postIncrement);
    }
}
