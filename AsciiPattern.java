import java.util.Scanner;
// 1)
// class AsciiPattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number of Rows: ");
//         int n=sc.nextInt();
//          int c=64;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print((char)(c+i)+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

/*
A  
B B
C C C
D D D D
E E E E E
*/

//2)
// class AsciiPattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number of Rows: ");
//         int n=sc.nextInt();
//          int c=64;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print((char)(c+j)+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

/* 
A  
A B
A B C
A B C D
A B C D E
*/

//3)

// class AsciiPattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number of Rows: ");
//         int n=sc.nextInt();
//          int c=65;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print((char)(c)+" ");
//                 c++;
//             }
//             System.out.println(" ");
//         }
//     }
// }

/*
A  
B C
D E F
G H I J
K L M N O
*/

//4)

// class AsciiPattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number of Rows: ");
//         int n=sc.nextInt();
//          int c=65;

//         for(int i=1;i<=n-2;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print((char)(c)+" ");
//                 c+=3;
//             }
//             System.out.println(" ");
//         }
//     }
// }

/*
A  
D G
J M P
*/

//5)

// class AsciiPattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number of Rows: ");
//         int n=sc.nextInt();
//          int c=65;

//         for(int i=1;i<=n;i++){
//             for(int k=1;k<=n-i;k++){
//                  System.out.print(" ");
//           }
//             for(int j=1;j<=i;j++){
//                 System.out.print(" Gopal ");
//                 c+=3;
//             }
//             System.out.println(" ");
//         }
//     }
// }

/*
     Gopal  
    Gopal  Gopal
   Gopal  Gopal  Gopal
  Gopal  Gopal  Gopal  Gopal
 Gopal  Gopal  Gopal  Gopal  Gopal
*/


//6)

// class AsciiPattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number of Rows: ");
//         int n=sc.nextInt();
//          int c=1;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print(c++ +" ");
            
//             }
//             System.out.println(" ");
//         }
//     }
// }

/*
1 2 3 4 5  
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/

//7) calender
// class AsciiPattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number of Rows: ");
//         int n=sc.nextInt();
//          int c=1;

//         for(int i=0;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(c<=9){
//                     System.out.print("0");
//                 }
//                 if(c==32)
//                     break;
//                 System.out.print(c+" ");
//                 c++;
//             }
//             System.out.println(" ");
//         }
//     }
// }

/*
01 02 03 04 05 06  
07 08 09 10 11 12
13 14 15 16 17 18
19 20 21 22 23 24
25 26 27 28 29 30
31
*/

//8)

// class AsciiPattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number of Rows: ");
//         int n=sc.nextInt();
//         // int c=1;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1||i==n||j==1||j==n||i+j==6||i==j){
//                     System.out.print("*"+" ");
//                 }
//                 else{
//                     System.out.print(" "+" ");
//                     }
//             }
//             System.out.println();
//         }
//     }
// }

/*

* * * * * 
* *   * *
*   *   *
* *   * *
* * * * *

*/

//9)

// class AsciiPattern{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number of Rows: ");
//         int n=sc.nextInt();
//         // int c=1;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1||i==n||j==1||j==n||i+j==6||i==j){
//                     System.out.print("v     "+" ");
//                 }
//                 else{
//                     System.out.print("Gopal "+" ");
//                     }
//             }
//             System.out.println();
//         }
//     }
// }

/*
v      v      v      v      v      
v      v      Gopal  v      v
v      Gopal  v      Gopal  v
v      v      Gopal  v      v
v      v      v      v      v

*/