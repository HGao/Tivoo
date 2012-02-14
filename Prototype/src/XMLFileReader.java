import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jdom.input.*;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;

import com.hp.gagawa.java.Node;
import com.hp.gagawa.java.elements.Body;
import com.hp.gagawa.java.elements.Br;
import com.hp.gagawa.java.elements.Head;
import com.hp.gagawa.java.elements.Html;


public class XMLFileReader {

	public static void main(String[] args) {
		
		XMLFileReader reader = new XMLFileReader();
		reader.readXML();
	}
	

	private void readXML ()
	{

		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File("c://users/Peggy/Desktop/CompSci/Tivoo/Prototype/DukeBasketball.xml");

		
		try {
			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			BufferedWriter out = new BufferedWriter(new FileWriter("tivoo.html"));
			
			Html html = new Html();
			Head head = new Head();
			html.appendChild(head);
		
			Body body = new Body();
			html.appendChild(body);
			
			List list = rootNode.getChildren();
			ArrayList<String> dates = new ArrayList<String>();
			
			for (int i = 0; i < list.size(); i++)
			{
				Element node = (Element) list.get(i);
				if (node.getChildText("Location").equals("Cameron Indoor Stadium"))
				{
					dates.add(node.getChildText("StartDate"));
				}
			}
			
			for (String d : dates)
			{
				body.appendText(d);
				body.appendChild(new Br());
			}
			
			out.write(html.write());
			out.close();


		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}

	}


}
