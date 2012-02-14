import java.io.*;
import java.util.*;

import org.jdom.*;
import org.jdom.input.*;

public class JDomTest {
    public static void main(String[] args) throws JDOMException {
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File("C:\\Users\\Hui\\Desktop\\CS108\\spring12_cps108_06_tivo\\dukecal.xml");
        
        try {
            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            List list = rootNode.getChildren("events");
            
            for (int i = 0; i < list.size(); i++)
            {
                Element node = (Element) list.get(i);
                System.out.println("First Name : " + node.getChildText("event"));
            }
        }catch (IOException e)
        {
            
        }
    }
}