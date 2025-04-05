public class CreationOfArrray {
    public static void main(String[] args) {

        int marks[] = new int[50];
        // int numbers[] = { 1, 2, 3 };
        // String fruits[] = { "apple", "mango", "orange" };

        marks[0] = 98;
        marks[1] = 22;
        marks[2] = 99;
        System.out.println("chemistry:" + marks[0]);
        System.out.println("Maths:" + marks[1]);
        System.out.println("physics:" + marks[2]);
        marks[1] = 98;
        System.out.println("updated marks Maths:" + marks[1]);
    }
}
