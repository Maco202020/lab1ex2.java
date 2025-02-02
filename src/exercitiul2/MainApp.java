package exercitiul2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\macov\\Desktop\\java_laboratoare\\lab1ex2\\src\\exercitiul2\\in.txt"));

        int[] n =new int[6];
        int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int i=0;
        while (sc.hasNextLine()) {
            n[i]= sc.nextInt();
            i++;
        }
        sc.close();

        for( i = 0; i < n.length; i++)
        {
            sum+=n[i];
            if(max<n[i])max=n[i];
            if(n[i]<min)min=n[i];
            System.out.println(n[i]);
        }
        double ma= (double) sum /n.length;

        System.out.println("Sum="+sum);
        System.out.println("Min="+min);
        System.out.println("Max="+max);
        System.out.println("Media aritmetica="+ma);

        FileWriter fw=new FileWriter(new File("C:\\Users\\macov\\Desktop\\java_laboratoare\\lab1ex2\\src\\exercitiul2\\out.txt"));

        fw.write(sum+"\n");
        fw.write(max+"\n" +min+"\n");
        fw.write(ma+"\n");

        fw.close();
    }

}
