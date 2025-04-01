public class checkEven {

    public static boolean isEven(int a){
        if (a%2==0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print(isEven(13));
    }
}