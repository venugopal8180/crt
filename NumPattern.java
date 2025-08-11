import java.util.Scanner;
//1)
// class NumPattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number of Rows: ");
//         int n=sc.nextInt();
//         int c=0;

//         for(int i=0;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print(" "+c++);
//             }
//             System.out.println(" ");
//         }
//         for(int i=n-1;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print(" "+c--);
//             }
//             System.out.println(" ");
//         }
//     }
// }


/*     0
    1 2
   3 4 5
  6 7 8 9
 10 11 12 13 14
  15 14 13 12
   11 10 9
    8 7
     6
*/


//2)
class NumPattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int n=sc.nextInt();
       // int c=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int k=2;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println(" ");
        }
    }
}

/*
1 
12
123
1234
12345
*/

