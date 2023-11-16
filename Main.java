package java;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
  int x;
  int y;
  String yep = "hello";
  List<Integer> list = new ArrayList<>();
  List<Integer> lip = new ArrayList<>();
  List<Integer> lil = new ArrayList<>();
  public static void main(String[] args) {
    Main yo = new Main();
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter your first int");
    yo.x = Integer.parseInt(sc.nextLine());
    System.out.println("please enter your second int");
    yo.y = Integer.parseInt(sc.nextLine());
    System.out.println("---------------------------------------------------------------");
    yo.yes(yo.x ,yo.y);
    System.out.println("---------------------------------------------------------------");
  }

  public void  yes(int x , int y) {
    Main yo = new Main();
    for(Integer i = 0; i < (x-y)+1 ; i++){
      yo.lip.add(x-i);
    }
    if (x<y){
      System.out.println("please enter x more than y");
      return;
    }
    for(int i = 0; i < (x-y)+1 ; i++ ){//start from the x and go down till y
      int ki = x-i;//current value we have to find if it's prime
      for(int j = 1; j<ki; j++){
        if(ki-j > 1){
          int e = ki-j;
          if(ki%e ==0){
            yo.list.add(ki);//ki list is the list that is not prime number
            break;
          }
        }
      }
    }
    int il = 0;
    for (Integer i = 0; i < yo.list.size(); i++) {
        il++;
    }
    for(Integer i: yo.lip){
      if(!yo.list.contains(i)){
        yo.lil.add(i);
      }
    }
    String prim = yo.lil.toString();
    int ki = (x-y)-il;
    System.out.println("there are total of " + ki+ "prime numbers");
    System.out.println("and those numbers are" + prim);
  }
}// find all of the prime number between 2 int