
// К калькулятору из предыдущего дз добавить логирование.
//Реализовать простой калькулятор (+ - / *)
//  Ввод числа ->
//  Ввод знака ->
//  Ввод числа ->
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
public class HW2_task3 {
    public static void main(String[] args){
        String file_name = "calc.txt";
        File bubble = new File(file_name);
        try{
            FileWriter writer = new FileWriter(bubble, true);

        Scanner sn = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sn.nextInt();
        System.out.println();
        System.out.print("Введите знак арифметического действия: ");
        String st = sn.next();
        System.out.println();
        System.out.print("Введите второе число: ");
        int b = sn.nextInt();
        System.out.println();
        StringBuilder line = new StringBuilder();

        if(st.equals("+")) {
            System.out.println(a+" + "+b+" = "+(a+b));
            line.append(Integer.toString(a)).append(" + ")
                    .append(Integer.toString(b)).append(" = ")
                    .append(Integer.toString(a+b));
        }
        if(st.equals("-")) {
            System.out.println(a+" - "+b+" = "+(a-b));
            line.append(Integer.toString(a)).append(" - ")
                    .append(Integer.toString(b)).append(" = ")
                    .append(Integer.toString(a-b));
        }
        if(st.equals("/")) {
            System.out.println(a+" / "+b+" = "+((double)a/b));
            line.append(Integer.toString(a)).append(" / ")
                    .append(Integer.toString(b)).append(" = ")
                    .append(Double.toString((double)a/b));
        }
        if(st.equals("*")) {
            System.out.println(a+" * "+b+" = "+(a*b));
            line.append(Integer.toString(a)).append(" * ")
                    .append(Integer.toString(b)).append(" = ")
                    .append(Integer.toString(a*b));
        }
            writer.write(line.toString());
            writer.write("\n");


            writer.close();
            System.out.println("Done!");

    }
        catch (Exception e){ System.out.println("Something's gone wrong");}

    }
}