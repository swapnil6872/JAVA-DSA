public class ArrayReferance {

    public static void updateArray(int marks[]) {

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 98;
        marks[1] = 22;
        marks[2] = 99;
        // old marks
        System.out.println("chemistry:" + marks[0]);
        System.out.println("Maths:" + marks[1]);
        System.out.println("physics:" + marks[2]);

        updateArray(marks);
        for (int j = 0; j < marks.length; j++) {
            System.out.println(marks[j]);
        }

    }
}
// Array works as a call by refernaces in function that means if in function any array value changed that also refelact on main function.basically in function value changes same change reflect on origanal array value.