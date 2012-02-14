import com.hp.gagawa.java.elements.*;

public class HTMLWriter {

	public static void main(String[] args)
	{
		/*Div div = new Div();
		div.setId("mydiv").setCSSClass("myClass");
		
		A link = new A();
		link.setHref("http://www.cs.duke.edu").setTarget("_blank");
		div.appendChild(link);
		
		A link2 = new A();
		link2.setHref("http://www.google.com").setTarget("_blank");
		div.appendChild(link2);
		
		Img image = new Img( "some alt", "some-image.png" );
		image.setCSSClass( "frame" ).setId( "myimageid" );
		link.appendChild( image );
		
		System.out.print(div.write());	*/
		
		 Html html = new Html();
         Head head = new Head();
         
         html.appendChild( head );
         
         Title title = new Title();
         title.appendChild( new Text("Example Page Title") );
         head.appendChild( title );
         
         Body body = new Body();
         
         html.appendChild( body );
         
         H1 h1 = new H1();
         h1.appendChild( new Text("Example Page Header") );
         body.appendChild( h1 );
         
         System.out.println( html.write() );
		
		
	}
}
