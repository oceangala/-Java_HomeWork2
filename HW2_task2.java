import java.io.BufferedReader;
import java.io.FileReader;



// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


public class HW2_task2 {
    public static void main(String[] args) {
        String file_name = "src/students.txt";
        read_s(file_name);

    }

    static void read_s(String file_name){
        String[] marks_list;
        // FileReader fr = new FileReader(file_name);


        try{
            BufferedReader bufReader = new BufferedReader(new FileReader(file_name));
            System.out.println("file.existed");
            //String line = bufReader.readLine();
            String line;
            while ((line = bufReader.readLine()) !=null) {

                marks_list = line.split(",");

                for (int i = 0; i < marks_list.length; i++) {
                    //System.out.println(marks_list[i]+" "+i);
                }

                StringBuilder res = new StringBuilder();

                for (String col : marks_list)
                {
                    String[] a = col.split(":");

                    if(a[0].equals("\"фамилия\"")){
                        res.append("Студент ").append(a[1].replaceAll("\"", "")).append(" ");
                        //System.out.println(res.toString());
                    }
                    else if(a[0].equals("\"оценка\"")){
                        res.append("получил ").append(a[1].replaceAll("\"", "")).append(" ");
                        //System.out.println(res.toString());
                    }
                    else if (a[0].equals("\"предмет\"")) {
                        res.append("по предмету ").append(a[1].replaceAll("\"", "")).append(".");
                        //System.out.println(res.toString());
                    }

                }
                System.out.println(res.toString());

            }

            bufReader.close();
        }
        catch (Exception e){
            System.out.println("Something's gone wrong");}

    }

}
