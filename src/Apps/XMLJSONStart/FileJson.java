package Apps.XMLJSONStart;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileJson
{
    Gson gson = new Gson();

    public void writeJson(List<Person> person, String filename) throws IOException
    {
        String json = gson.toJson(person);
        FileWriter writer = new FileWriter(filename);
        writer.write(json);
        writer.close();
    }

    public void readJson(String filename) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        List<Person> personList = gson.fromJson(br, new com.google.gson.reflect.TypeToken<List<Person>>()
        {
        }.getType());
        for (Person person : personList)
        {
            System.out.println(person.getId() + " " + person.getFName()+ " " +  person.getLName()+ " " + person.getAge());
        }
    }
 }
