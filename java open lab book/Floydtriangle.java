import java.util.Scanner;
class Floydtriangle{
  public static void main(String[] args){
    int rows, number=1, counter, j;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number of rows for the floyd triangle:");
    rows=input.nextInt();
    System.out.println("floyd triangle");
    System.out.println("************************");
    for(counter =1;counter<=rows;counter++){
      for(j=1;j<=counter;j++){
        System.out.println(number+ " ");
        number++;
      }
      System.out.println();
    }
  }
}