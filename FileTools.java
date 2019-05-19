/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialize;

import java.util.ArrayList;

/**
 *
 * @author e-vas
 */
public class FileTools<E> {

    public  void Write(ArrayList<E> input, String fileName) {
        try {
            //تعریف یک فایل خروجی
            java.io.FileOutputStream fileOut = new java.io.FileOutputStream(fileName);
            //ریختن اطلاعات بصورت سریالی در فایل از طریق ظرف
            java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(fileOut);
            out.writeObject(input);
            out.close();
            fileOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<E> Read(String fileName) {
        try {
            //ایجاد فایل ورودی برای دریافت اطلاعات از فایل
            java.io.FileInputStream fileIn = new java.io.FileInputStream(fileName);
            //ایجاد شی سریال برای خواندن رکورد اطلاعاتی از فایل
            java.io.ObjectInputStream in = new java.io.ObjectInputStream(fileIn);
            ArrayList<E> result = (ArrayList<E>) in.readObject();
            in.close();
            fileIn.close();
            return result;
        } catch (java.io.IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("not found");
        }   
        return null;
    }
}
