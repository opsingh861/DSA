
class combinedPyramid {
    public  static void printDiamond(int n) {
        // Your code here
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
                for(int i=n;i>=1;i--){
            for(int j=0;j<n;j++){
                if(j<n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    printDiamond(3);
}
   
}
