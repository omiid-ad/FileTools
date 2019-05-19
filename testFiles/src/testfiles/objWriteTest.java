/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author mr_aki
 */
public class objWriteTest {
    
    public static final String fileDir = "/home/mr_aki/Desktop/mydirectory/";
    

    public static void main(String[] args) {
        
        File f = new File(fileDir);
        boolean isCreated = false;
        
        try {
            if(f.exists() == false)
            {
                isCreated = f.mkdir();
                System.out.println("directory created!");
            }
            else System.out.println("already exsist!");
            
        } catch (Exception e) {
            if(isCreated == false)
            {
                System.out.println("directory already exists!");
                e.printStackTrace();
            }
            System.out.println("something wrong!");
            e.printStackTrace();
            
        }
        
        
//        Student st = new Student("aki", "adib", 12);
//        Student st2 = new Student("ali", "alipoor", 20);
        
//        ArrayList<Student> list = new ArrayList();
        
//        list.add(st);
//        list.add(st2);
        
      //  writeListToFile(list);
  
      
      Student st = (Student) ReadObjectFromFile();
      
        System.out.println(""+st.toString());
      
      
        
        
        
    
     
    
        
        
//        
//        ArrayList<Student> stList = new ArrayList<>();
//        Student st = new Student("aki", "adib", 12);
//        Student st1 = new Student("mamad", "alizade", 122);
//        stList.add(st);
//        stList.add(st1);
//        
        //writeListToFile(stList);
        
//        ArrayList<Student> readed = new ArrayList();
//        readed = ReadListFromFile();
//        
//        for (Student stu : readed) {
//            System.out.println(""+stu.toString());
//            
//        }
//        
        
//        Object t = ReadObjectFromFile();
//        Student st = (Student) t ;
//        System.out.println(""+st.toString());
        
        
        
//        Student st = new Student("aki", "adib", 19);
//        
//        WriteObjectToFile(st);

        
        
        
        
        
        
        
    }
    
    public static void WriteObjectToFile(Object obj) {
        
         String filePath = fileDir + "output.txt" ;
 
        try {
 
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(obj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static Object ReadObjectFromFile(){
        
        String filePath = fileDir + "output.txt";
        try {
            
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject();
            objectIn.close();
            System.out.println("readed successfully!");
            return obj;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
        
    }
    
    public static  void  writeListToFile(ArrayList arr){
         String filePath = fileDir + "output.txt";
 
        try {
 
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(arr);
            objectOut.close();
            System.out.println("The List  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
    public static  ArrayList  ReadListFromFile(){
         String filePath = fileDir + "output.txt";
         ArrayList list = null ;
 
        try {
 
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            list = new ArrayList();
            list = (ArrayList) objectIn.readObject();
            objectIn.close();
            System.out.println("The List  was succesfully readed from a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        return list;
        
    }
    
    
}
