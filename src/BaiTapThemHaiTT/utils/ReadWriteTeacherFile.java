package BaiTapThemHaiTT.utils;

import BaiTapThemHaiTT.model.Teacher;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class ReadWriteTeacherFile {
    /**
     *
     *Đọc file
     */
    public static List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line= bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  stringList;
    }

    /**
     *
     * Lấy dữ liệu vừa đọc
     */

    public  static List<Teacher> readFileTeacher(String path){
        List<String> stringList = readFile(path);
        List<Teacher> teacherList = new ArrayList<>();
        String []info ;
        for (String string:stringList) {
            info=string.split(",");
            teacherList.add(new Teacher(info[0],info[1],info[2],info[3],info[4]));
        }
        return teacherList;
    }

    /**
     *
     * Ghi file
     */

    public static void  writeFile(String path,String data){
        File file = new File(path);
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeFileTeach(List<Teacher> teacherList){
        String PATH ="src\\BaiTapThemHaiTT\\QuanLyCodeGym\\data\\teacher.csv";
        StringBuilder data = new StringBuilder();
        for (Teacher teacher:teacherList) {
            data.append(teacher.getinFor());
        }
        writeFile(PATH,data.toString());
    }
}
