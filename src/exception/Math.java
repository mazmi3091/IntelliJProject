package exception;

public class Math {
    public static void main(String[] args) {
        try {
            int num = 20;
            int result = num / 0;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
