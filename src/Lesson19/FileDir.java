package Lesson19;

import java.io.File;

public class FileDir
{
    public static void main(String[] args)
    {
        String fileName = "C:\\Documents and Settings\\Admin\\Рабочий стол\\mars.txt";
        String path = "C:\\Documents and Settings\\Admin\\Рабочий стол\\Паспорта";
        File userFile = new File(fileName);
        File userPath = new File(path);
        print("Filename: " + userFile.getName());
        print("Path: " + userFile.getPath());
        print("Absolute path: " + userFile.getAbsolutePath());
        print("File size: " + userFile.length() + " bytes");
        int count =0;
        listOfFiles(userPath, count);
     }

    static void print(String str)
    {
        System.out.println(str);
    }

    static void listOfFiles(File userPath, int count)
    {
        File path = userPath;
        File[] pathList = path.listFiles();

        for (File i : pathList)
        {
            if (i.isDirectory())
            {
                for (int j = 0; j < count; j++)
                {
                    System.out.print(" ");
                }
                count++;
                listOfFiles(i,count);
            }
            System.out.println(i.getAbsolutePath());
        }
    }
}
