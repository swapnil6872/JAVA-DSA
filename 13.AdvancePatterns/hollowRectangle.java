public class hollowRectangle {

    public static void hr(int row ,int col ){
        for(int i =1 ; i <=row ;i++ ){

            for(int j=1; j<=col ; j++){
                if(i==1 || j==1 || i==row || j==col ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         hr(4, 4);

    }
}
