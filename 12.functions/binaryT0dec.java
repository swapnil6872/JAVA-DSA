public class binaryT0dec {

    public static void biToDec(int binary){
        int dec=0;
        int p =0;
        while (binary>0) {
            int  ld = binary % 10;
            dec =dec+(ld * (int)Math.pow(2,p));
            p++;
            binary /= 10;
        }
      System.out.println(dec);
    }
    public static void main(String args[]){
        biToDec(1000);

    }
}
