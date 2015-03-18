package Apps.CanvasVectorBeta;


import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class FileFunc
{
    public void fileXMLSave(File file, ArrayList<PanelFigures> list) throws FileNotFoundException
    {
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream(file));
        encoder.writeObject(list);
        encoder.flush();
        encoder.close();
    }

    public ArrayList<PanelFigures> fileXMLRead(String filename) throws FileNotFoundException
    {
        XMLDecoder decoder = new XMLDecoder(new FileInputStream((filename)));
        decoder.close();
        return (ArrayList<PanelFigures>) decoder.readObject();
    }


    public void fileJsonSave(File file, ArrayList<PanelFigures> list) throws IOException, IllegalAccessException
    {

        String res = "[";
        String end = "]";
        String s = "";
        Field[] fields = (list.get(0).getClass().getDeclaredFields());

        for (PanelFigures pf : list)
        {
            s += "{";
            for (Field f : fields)
            {
                f.setAccessible(true);
                if (f.getType().equals(int.class) || f.getType().equals(Integer.class))
                {
                    s += "\"" + f.getName() + "\": " + f.get(pf) + ", ";
                }
                else
                {
                    s += "\"" + f.getName() + "\": \"" + f.get(pf) + "\", ";
                }
            }
            s = s.substring(0, s.length() - 2) + "},";
        }
        s = s.substring(0, s.length() - 1);
        res = res + s + end;
        Writer w = new FileWriter(file);
        w.write(res);
        w.flush();
    }


    public List<PanelFigures> fileJsonRead(String filename) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str = br.readLine();
        ArrayList<PanelFigures> list = new ArrayList<PanelFigures>();
        str = str.substring(1, str.length() - 1);
        String[] pfAr = str.split("[},{]");
        System.out.println(pfAr[0]);
        for (int i = 0; i < pfAr.length; i++)
        {
            PanelFigures figure = new PanelFigures();
            String [] smX = pfAr[i].split(":");

        }
        return list;
    }


}
