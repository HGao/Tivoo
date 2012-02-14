import java.util.List;
import java.io.File;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.*;

public class SimplePrototype {


	public static void main (String[] args) {

		Document doc = null;
		SAXBuilder sb = new SAXBuilder();

		try {
			doc = sb.build(new File("C://Users/Sam/Desktop/Compsci/"));
		}
		catch (JDOMException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		Element rootNode = doc.getRootElement();
		List list = rootNode.getChildren("row");

		for (int i = 0; i < list.size(); i++) {

			Element node = (Element) list.get(i);

			System.out.println("Location:" + node.getChildText("Col15"));
		}

	}


}
