package Apps.CanvasVectorBeta;


import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class FileFunc
{
    public void fileSave(File file, ArrayList<PanelFigures> list) throws FileNotFoundException
    {
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream(file));
        encoder.writeObject(list);
        encoder.flush();
        encoder.close();
    }

    public ArrayList<PanelFigures> fileRead(String filename) throws FileNotFoundException
    {
        XMLDecoder decoder = new XMLDecoder(new FileInputStream((filename)));
        decoder.close();
        return (ArrayList<PanelFigures>) decoder.readObject();
    }
}
