package data_helpers;

import data_objects.RootData;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlHelper {
    private final static Logger applicationLogger = Logger.getLogger("applicationLogger");
    private final static String XML_FILE_PATH = "C:\\hackathon\\database\\testdata.xml";

    public static RootData getRootDataFromXml(){
       try {
           File file = new File(XML_FILE_PATH);
           JAXBContext jaxbContext = JAXBContext.newInstance(RootData.class);
           Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
           RootData rootData = (RootData) jaxbUnmarshaller.unmarshal(file);
           return rootData;

       } catch (JAXBException e) {
           applicationLogger.error(e);
           return null;
       }
   }
}
