import java.util.Scanner;
public class App{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value in num:");
    int day=sc.nextInt();
    String week=getthe(day);
    System.out.println("Day "+day+" of the week is :"+week);
    sc.close();
}
public static String getthe(int day){
    String days;
    switch(day){
        case 1:
        days="MONDAY";
        break;

        case 2:
        days="TUESDAY";
        break;

        case 3:
        days="WEDNESDAY";
        break;

        case 4:
        days="THURSDAY";
        break;

        case 5:
        days="FRIDAY";
        break;

        case 6:
        days="SATURDAY";
        break;

        case 7:
        days="SUNDAY";
        break;

        default:
        days="invalid";
    }
    return days;
}
}

        
    
