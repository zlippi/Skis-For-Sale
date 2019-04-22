import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DataGetter {
	private String[] data;
	private ArrayList<String> rawData;

	public DataGetter() {
		rawData = new ArrayList<String>();
	}

	public String[] getFileData(String fileDir) throws IOException {

		BufferedReader bfr = new BufferedReader(new FileReader(fileDir));
		String line = "";
		
		while ((line = bfr.readLine()) != null) {
			rawData.add(line);
		}
		
		data = new String[rawData.size()];
		for (int i = 0; i < rawData.size(); i++) {
			data[i] = rawData.get(i);
		}
		
		
		
		
		bfr.close();
		return data;
	}

}