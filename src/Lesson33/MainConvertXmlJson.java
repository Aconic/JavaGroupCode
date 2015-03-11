package Lesson33;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class MainConvertXmlJson
{
    public static void main(String[] args) throws Exception
    {
        String filename = "toJSON.json";
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(1, "Dash1", "Solo1", 10));
        list.add(new Person(2, "Dash2", "Solo2", 20));
        list.add(new Person(3, "Dash3", "Solo3", 30));
        list.add(new Person(4, "Dash4", "Solo4", 40));
        list.add(new Person(5, "Dash5", "Solo5", 50));
        list.add(new Person(6, "Dash6", "Solo6", 60));
        list.add(new Person(7, "Dash7", "Solo7", 70));
        list.add(new Person(8, "Dash8", "Solo8", 80));
        toJsonManual(list);
        toXmlManual(list);
      fromJsonManual(filename).toArray();

        //toJson(list);
        /*
        Gson gs = new Gson();
        String str = gs.toJson(list);
        System.out.println(str);

        ArrayList<Person> ap = gs.fromJson(str, new TypeToken<List<Person>>()
        {
        }.getType());
        for (Person p : ap)
        {
            System.out.println(p);
        }

        FileOutputStream file = new FileOutputStream(new File("test.xml"));
        XMLEncoder encoder = new XMLEncoder(file);
        encoder.writeObject(list);
        encoder.flush();

        FileInputStream fileInput = new FileInputStream("test.xml");
        XMLDecoder decoder = new XMLDecoder(fileInput);
        ArrayList<Person> pp = (ArrayList<Person>) decoder.readObject();
        for (Person p : pp)
        {
            System.out.println(p);
        }
          */
    }

    public static void toJsonManual(List<Person> list) throws IOException, IllegalAccessException, InvocationTargetException    // универсальный вариант JSON в ручном режиме
    {
        String res = "[";
        String end = "]";
        String s = "";
        Field[] fields = (list.get(0).getClass().getDeclaredFields());

        for (Person p : list)
        {
            s += "{";
            for (Field f : fields)
            {
                f.setAccessible(true);
                if (f.getType().equals(int.class) || f.getType().equals(Integer.class))
                {
                    s += "\"" + f.getName() + "\": " + f.get(p) + ", ";
                }
                else
                {
                    s += "\"" + f.getName() + "\": \"" + f.get(p) + "\", ";
                }
            }
            s = s.substring(0, s.length() - 2) + "},";
        }
        s = s.substring(0, s.length() - 1);
        res = res + s + end;
        //System.out.println(res);
        Writer w = new FileWriter("toJSON.json");
        w.write(res);
        w.flush();
    }

    public static void toXmlManual(List<Person> list) throws IOException, IllegalAccessException, InvocationTargetException    // универсальный вариант JSON в ручном режиме
    {
        String res = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + "<persons>";
        String end = "</persons>";
        String s = "";
        Field[] fields = (list.get(0).getClass().getDeclaredFields());

        for (Person p : list)
        {
            s += "<Person>\n";
            for (Field f : fields)
            {
                f.setAccessible(true);

                s += "<" + f.getName() + ">" + f.get(p) + "</" + f.getName() + ">";
            }
            s += "</Person>\n";
        }
        res = res + s + end;
        Writer w = new FileWriter("toXML.xml");
        w.write(res);
        w.flush();
    }


    public static ArrayList<Person> fromJsonManual(String filename) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str = br.readLine();
        ArrayList<Person> list = new ArrayList<Person>();

        Person p = new Person();
        str = str.substring(1, str.length() - 1);
        String[] persAr = str.split("[},{]");
        System.out.println(persAr[0]);
        for (int i = 0; i < persAr.length; i++)
        {
            Person person = new Person();
            String [] sId = persAr[i].split(":");

         }
        return list;
    }


    public static void toJson(List<Person> list) throws IOException    //JSON в ручном режиме
    {
        String res = "[";
        String end = "]";
        for (Person p : list)
        {
            res += "{" + "\"Id\": " + p.getId() + "," + "\"FName\": " + "\"" + p.getFName() + "\"" + "," + "\"LName\": "
                    + "\"" + p.getLName() + "\"" + "," + "\"Age\": " + p.getAge() + "},";
        }
        res = res.substring(0, res.length() - 1) + end;
        System.out.println(res);
        Writer w = new FileWriter("toJSON.json");
        w.write(res);
        w.flush();
    }
}

