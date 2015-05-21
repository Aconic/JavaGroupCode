package com.aconic.apps.XMLJSONStart;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileXml              //способ 1
{
    Document doc;
    Element elemPerson = null;
    Person person;
    ArrayList<Person> personList;

    public void writeXml(String filename, List<Person> personList) throws ParserConfigurationException, TransformerException, FileNotFoundException
    {
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = f.newDocumentBuilder();
        doc = builder.newDocument();
        Element rootElem = doc.createElement("persons");
        doc.appendChild(rootElem);
        for (int i = 0; i < personList.size(); i++)
        {
            elemPerson = doc.createElement("Person");
            rootElem.appendChild(elemPerson);

            Attr attrId = doc.createAttribute("Id");
            attrId.appendChild(doc.createTextNode(String.valueOf(personList.get(i).getId())));
            elemPerson.setAttributeNode(attrId);

            Element elemFName = doc.createElement("FName");
            elemFName.appendChild(doc.createTextNode(personList.get(i).getFName()));
            elemPerson.appendChild(elemFName);

            Element elemLName = doc.createElement("LName");
            elemLName.appendChild(doc.createTextNode(personList.get(i).getLName()));
            elemPerson.appendChild(elemLName);

            Element elemAge = doc.createElement("Age");
            elemAge.appendChild(doc.createTextNode(String.valueOf(personList.get(i).getAge())));
            elemPerson.appendChild(elemAge);
        }
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer tr = factory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(filename));
        tr.transform(source, result);
        System.out.println("Done!");
    }

    public ArrayList<Person> readXML(String filename) throws ParserConfigurationException, IOException, SAXException
    {
        File file = new File(filename);
        personList = new ArrayList<Person>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("Person");

        for (int i = 0; i < nodeList.getLength(); i++)
        {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element element = (Element) node;
                person = new Person();
                person.setId(Integer.parseInt(element.getAttribute("Id")));
                person.setFName(element.getElementsByTagName("FName").item(0).getTextContent());
                person.setLName(element.getElementsByTagName("LName").item(0).getTextContent());
                person.setAge(Integer.parseInt(element.getElementsByTagName("Age").item(0).getTextContent()));
                personList.add(person);
            }
        }
        return personList;
    }

    public void writeXmlEncoder(Object person, String filename) throws Exception
    {
        XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)));
        encoder.writeObject(person);
        encoder.flush();
        encoder.close();
    }

    public void convertToXml(Person person) throws Exception            //способ 2
    {
        JAXBContext ctx = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        FileOutputStream stream = new FileOutputStream("ololo-convertF.xml");
        marshaller.marshal(person, stream);
        stream.close();
    }

    public Object readXmlDecoder(String filename) throws Exception       //чтение из XML   вариант 1
    {
        XMLDecoder decoder =
                new XMLDecoder(
                        new BufferedInputStream(
                                new FileInputStream(filename)));
        return decoder.readObject();
    }

      /* public Document readXmlParse(String filename) throws IOException, SAXException, ParserConfigurationException
    {
        File file = new File(filename);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(file);

        return document;
    }



 public void readXml(Node node, int level)
    {
        NodeList nodeList = node.getChildNodes();
        String parent = "";
        for (int i = 0; i < nodeList.getLength(); i++)
        {
            node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                if (nodeList.item(i).getNodeType() == Node.TEXT_NODE)
                {
                    parent = nodeList.item(i).getParentNode().getNodeName();
                    txt = nodeList.item(i).getNodeValue();
                    if (parent == "Id")
                    {
                        person.setId(num);
                    }
                    if (parent == "FName")
                    {
                        person.setFName(txt);
                    }
                    if (parent == "LName")
                    {
                        person.setLName(txt);
                    }
                    if (parent == "Age")
                    {
                        person.setAge(num);
                    }
                }
                else
                {
                    if (nodeList.item(i).getNodeName().equals("Apps.com.aconic.lessons.XMLJSONStart.Person"))
                    {
                        person = new Person();
                        personList.add(person);
                    }
                }
                System.out.println(nodeList.item(i).getNodeName() + " = " + nodeList.item(i).getNodeValue());
                readXml(nodeList.item(i), level + 1);
            }
        }
    }
       public void domParser(String filename) throws IOException, SAXException, ParserConfigurationException
    {
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        f.setValidating(false);
        DocumentBuilder builder = f.newDocumentBuilder();
        Document doc = builder.parse(new File(filename));
        personList = new ArrayList<Person>();
        readXml(doc, 0);
    }






           */

}
