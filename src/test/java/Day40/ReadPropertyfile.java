package Day40;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		prop.load(file);
		
		String email=prop.getProperty("email");
		//System.out.println(email);
		
		Set<String>keys=prop.stringPropertyNames();
	    Collection<Object> values=	prop.values();
	    
	    System.out.print(values);
		
		
		file.close();

	}

}
