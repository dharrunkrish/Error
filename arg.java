import java.util.Scanner;

public class arg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int values=sc.nextInt();

            double sum=0;
            for(int i=0;i<values;i++){
            System.out.println("Enter the value1"+(i+1)+":");
            sum=sum+sc.nextInt();
        }
        double average= sum/values;
        System.out.println("Average="+average);

        sc.close();


        
    }
}





        /* 
     float[] dha={37.7F,674.2F};
     System.out.println(dha[0]);
    }
}
    */