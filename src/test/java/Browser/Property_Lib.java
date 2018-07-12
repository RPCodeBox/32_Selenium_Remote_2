package Browser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Property_Lib extends AutomationConstants {
	public static String getPropertyValue(String filePath, String key) {
		String value = "";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(filePath));
			value = properties.getProperty(key);
		} catch (Exception e) {
		}
		return value;
	}

	public static String setPropertyValue(String filePath, String key) {
		String value = "";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(filePath));
			int count = Integer.parseInt(properties.getProperty(key));
			OutputStream output = null;
			count++;
			String abc = Integer.toString(count);
			output = new FileOutputStream(filePath);
			count++;
			properties.setProperty("Count", abc);
			properties.store(output, null);

		} catch (Exception e) {
		}
		return value;
	}
}
