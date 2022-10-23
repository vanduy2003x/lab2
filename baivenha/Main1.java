package baivenha;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student>students=new ArrayList<>();
        System.out.println("Tên");
        String name = scanner.nextLine();
        System.out.println("ID");
        int id = scanner.nextInt();
        System.out.println("Điểm môn toán");
        int scoreMath = scanner.nextInt();
        System.out.println("Điểm thể chất");
        int scorePhysic = scanner.nextInt();
        System.out.println("Điểm Môn Hóa");
        int scoreChemistry = scanner.nextInt();
        int avgscore1 = (scoreChemistry+scoreMath+scorePhysic)/3;
        Student student = new Student(name,id,scoreMath,scorePhysic,scoreChemistry,avgscore1);
        Avgscore avgscore = new Avgscore();
        avgscore.setStudents(student);
        System.out.println(avgscore.toString());
    }
}
