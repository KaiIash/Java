package ResultsPkg;
//REMOVE AFTER TESTING
import java.util.*;

public class Data{
  public Data(){
    String[] RollC ={"20311A12C1","20311A12C2","20311A12C3","20311A12C4","20311A12C5","20311A12C6","20311A12C7","20311A12C8","20311A12C9"};
    String[] RollD={"20311A12D0","20311A12D1","20311A12D2","20311A12D3","20311A12D4","20311A12D5","20311A12D6","20311A12D7","20311A12D8","20311A12D9"};
    String[] RollE={"20311A12E0","20311A12E1","20311A12E2","20311A12E3","20311A12E4","20311A12E5","20311A12E6","20311A12E7","20311A12E8","20311A12E9"};
    String[] RollF={"20311A12F0","20311A12F1","20311A12F2","20311A12F3","20311A12F4","20311A12F5","20311A12F6","20311A12F7","20311A12F8","20311A12F9"};
    String[] RollG={"20311A12G0","20311A12G1","20311A12G2","20311A12G3","20311A12G4","20311A12G5","20311A12G6","20311A12G7","20311A12G8","20311A12G9"};
    String[] RollH={"20311A12H0","20311A12H1","20311A12H2","20311A12H3","20311A12H4","20311A12H5","20311A12H6","20311A12H7","20311A12H8","20311A12H9"};
  }
  public static void main(String[] args){
    Data D=new Data();
    Scanner S = new Scanner(System.in);
    System.out.print("Enter Your RollNo: ");
    String RollNo=S.next();
    char A = RollNo.charAt(8);
    int Value=A;
    if(Value>=99 || Value<=106){
      Value -=32;
      A = (char)Value;
    }
    System.out.println(A);
  }
}
