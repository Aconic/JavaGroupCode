package Apps.XMLJSONStart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        String filenameXml = "xml-writeF.xml";
        String filenameJson = "json-writeF.json";
        FileXml fileXml = new FileXml();
        FileJson fileJson = new FileJson();
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(1, "Dash1", "Solo1", 10));
        list.add(new Person(2, "Dash2", "Solo2", 20));
        list.add(new Person(3, "Dash3", "Solo3", 30));
        list.add(new Person(4, "Dash4", "Solo4", 40));
        list.add(new Person(5, "Dash5", "Solo5", 50));
        list.add(new Person(6, "Dash6", "Solo6", 60));
        list.add(new Person(7, "Dash7", "Solo7", 70));
        list.add(new Person(8, "Dash8", "Solo8", 80));

        fileXml.writeXml(filenameXml, list);
        System.out.println(Arrays.toString(fileXml.readXML(filenameXml).toArray()));
        fileJson.writeJson(list, filenameJson);
        fileJson.readJson(filenameJson);
        fileXml.convertToXml(list.get(0));
    }
}
