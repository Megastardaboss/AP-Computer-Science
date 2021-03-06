import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
        //vars
        Scanner scan = new Scanner(System.in);
        int[] values;
        String[] inp;
        boolean loop;
        
        //input
        System.out.println("Enter numbers seperated by spaces : ");
        inp = scan.nextLine().split(" ");
        values = new int[inp.length];
        for(int i = 0; i < inp.length; i ++){
            values[i] = Integer.parseInt(inp[i]);
        }
        
        //loop
        bubble(values);
    }
    
    public static int[] bubble(int[] values){
        boolean loop;
        do{
            loop = false;
            for(int i = 0; i < values.length-1; i ++){
                if(values[i] > values[i+1]){
                    int temp = values[i];
                    values[i] = values[i+1];
                    values[i+1] = temp;
                    loop = true;
                }
            }
            printArray(values);
        }while(loop);
        return values;
    }
    
    public static void printArray(int[] values){
        for(int i = 0; i < values.length; i ++){
            System.out.print(values[i] + " ");
        }
        System.out.print("\n");
    }
}