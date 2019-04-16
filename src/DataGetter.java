import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DataGetter {
	private String[] data;
	private ArrayList<Ski> skis;
	
	public DataGetter() {
		skis = new ArrayList<Ski>();
	}
	
	
	
	
	public ArrayList<Ski> getFileData(String fileDir) throws IOException {
		BufferedReader bfr = new BufferedReader(new FileReader(fileDir));
		String line = "";
		while ((line += bfr.readLine()) != null) {
		}
		data = line.split(",");
		
		
		bfr.close();
		if (data.length % 8 == 0) {
			for (int i = 0; i < (data.length / 8); i++) {
				skis.add(new Ski(data[i], data[i + 1], data[i + 2], data[i + 3], data[i + 4], Integer.parseInt(data[i + 5]), Integer.parseInt(data[i + 6]), Double.parseDouble(data[i + 7])));
				return skis;
			}
		}else {
			System.out.println("Error has occured! getFileData() method's data not divisible by 8!");
			return null;
		}
		return null;
	}
	
}
