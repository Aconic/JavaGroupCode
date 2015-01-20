package Lesson19;

import java.io.*;

//считывание и копия файла
public class FileInput
{
    public static void main(String[] args) throws IOException
    {
        String inFileName = "C:\\Documents and Settings\\Admin\\Рабочий стол\\mars.txt";
        String outFileName = "C:\\Documents and Settings\\Admin\\Рабочий стол\\marscop.txt";
        String newFileName = "C:\\Documents and Settings\\Admin\\Рабочий стол\\marsnew.txt";
        readFile(inFileName);
        copyFile(inFileName, outFileName);
        createFile(newFileName);
    }

    private static void createFile(String newFileName) throws FileNotFoundException
    {
      String str = "hello!/n Wol";
      FileOutputStream out = new FileOutputStream(newFileName);
       byte[] buffer = str.getBytes();


    }

    public static void readFile(String inFileName) throws IOException
    {
        FileInputStream fis =  new FileInputStream(inFileName);
        byte[] buffer = new byte[fis.available()];
        for(int i=0; i<buffer.length;i++){

            System.out.print((char)buffer[i]);
        }
        fis.close();
    }

    public static void copyFile(String inFileName, String outFileName) throws IOException
    {
       FileInputStream fis = new FileInputStream(inFileName);
       FileOutputStream fos = new FileOutputStream(outFileName);
       while (fis.available() > 0)
        {
        fos.write(fis.read());
    }
        fis.close();;
        fos.close();
    }
}
