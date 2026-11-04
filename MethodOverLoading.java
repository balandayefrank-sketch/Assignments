
public class MethodOverLoading {
 
    static void multiUse(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


 static void multiUse(int x, int y) {
System.out.println("avenger: " + ( x + (double)y) / 2);
 }

 static void multiUse(int x, int y, int z) {
    System.out.println("Maximum: " + Math.max(x, Math.max(y, z)));
 }

 public static void main(String[] args) {
    multiUse(5);
    multiUse(10, 20);
    multiUse(10, 20, 30);
 }
}

