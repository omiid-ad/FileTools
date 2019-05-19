/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mr_aki
 */
public class TestFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        
//        FileInputStream in = null;
//        FileOutputStream out = null;
//        
//        try {
//            
//            in =new FileInputStream("text.txt");
//            out = new FileOutputStream("text2.txt");
//            int readed;
//            while((readed = in.read()) != -1)
//            {
//                out.write(readed);
//            }
//            
//            
//        } catch (Exception e) {
//            
//            e.printStackTrace();
//        }
//        finally
//        {
//            in.close();
//            out.close();
//        }


//        FileReader in = null;
//        FileWriter out = null;
//        
//        try {
//            
//            in =new FileReader("text.txt");
//            out = new FileWriter("text2.txt");
//            int readed;
//            while((readed = in.read()) != -1)
//            {
//                out.write(readed);
//            }
//            
//            
//        } catch (Exception e) {
//            
//            e.printStackTrace();
//        }
//        finally
//        {
//         if (in != null) {
//            in.close();
//         }
//         if (out != null) {
//            out.close();
//         }
//        }


//          InputStreamReader in = null;
//          
//          try {
//            in = new InputStreamReader(System.in);
//            
//            char c;
//            
//            do {
//                c = (char) in.read();
//                System.out.print(c);
//            }while(c != 'e');
//        } catch (Exception e) {
//            
//            e.printStackTrace();
//        }
//          finally
//          {
//              if( in != null)
//                  in.close();
//          }
        
//
//            String dir = "/home/mr_aki/Desktop/mydirectory";
//            boolean isCreated = false;
//            try {
//                
//                File f = new File(dir);
//                isCreated = f.mkdir();
//                System.out.println("created!");
//                
//            
//        } catch (Exception e) {
//            if(isCreated == false)
//            {
//                    System.out.println("dir not created!");
//                    return;
//            }
//            e.printStackTrace();
//        }

            
            try {
                
                File f = new File("file.txt");
                if(f.exists() == false)
                {
                    System.out.println("file not exist!");
                    f.createNewFile();
                    System.out.println("file created!");
                    
                }
                System.out.println("File name :"+f.getName()+"\n"
                        + "File Size (Bytes):"+f.length()+"\n"
                                + "File path :"+f.getAbsolutePath()+"\n"
                                        + "read only:"+f.canRead()+"\n"
                                                + "write only:"+f.canWrite()+"\n"
                                                        );

                
                
        } catch (Exception e) {
                System.out.println("file already exists!");
                e.printStackTrace();
        }
            
    }
    
}
