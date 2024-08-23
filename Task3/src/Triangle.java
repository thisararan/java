public class Triangle implements Shape{
    @java.lang.Override
    public void draw() {
        for (int i=1;i<=5;i++){
            for (int j=5;j>i;j--){
                System.out.print(" ");
            }
            for (int k =0; k<(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
