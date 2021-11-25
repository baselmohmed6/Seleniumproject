package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class loadproperties {

	
	public static Properties userData= loadproperties(System.getProperty("user.dir")+"\\src\\main\\java\\Properties\\userdata.properties");

	private static Properties loadproperties(String path) {
		// TODO Auto-generated method stub
        Properties pro=new Properties();
        try {
			FileInputStream stream=new FileInputStream(path);
			try {
				pro.load(stream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return pro;
	}
}
