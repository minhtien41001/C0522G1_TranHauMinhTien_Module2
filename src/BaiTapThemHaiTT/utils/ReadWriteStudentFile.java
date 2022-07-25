package BaiTapThemHaiTT.utils;

import BaiTapThemHaiTT.model.Student;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class ReadWriteStudentFile {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line=bufferedReader.readLine())!=null){

                list.add(line);

            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Lỗi File");
        }
        return list;
    }
    public static List<Student> readFileStudent(String path) {
        List<String> newList = readFile(path);
        List<Student> studentList = new ArrayList<>();
        String [] info;
        for (String string:newList) {
            info=string.split(",");
            studentList.add(new Student(info[0],info[1],info[2],info[3],Double.parseDouble(info[4]),info[5]));
        }
        return studentList;
    }
    public static void writeFile(String path,String data){

        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileStudent(String path,List<Student> studentList){

        StringBuilder data = new StringBuilder();
        for (Student student:studentList) {
            data.append(student.getinFor());
        }
        writeFile(path,data.toString());
    }
}
