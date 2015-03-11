package Apps.CanvasVectorAlfa;


import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class FileFunc
{
    public void fileSave(File file, ArrayList<PanelFigs> list) throws FileNotFoundException
    {
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream(file));
        encoder.writeObject(list);
        encoder.flush();
        encoder.close();
    }

    public ArrayList<PanelFigs> fileRead(String filename) throws FileNotFoundException
    {
        XMLDecoder decoder = new XMLDecoder(new FileInputStream((filename)));
        decoder.close();
        return (ArrayList<PanelFigs>) decoder.readObject();
    }
}
