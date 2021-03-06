import java.util.ArrayList;

public class Ski {

	private String id;
	private String configurable;
	private String name, category, list;
	private int position, listPosition;
	private double price;
	private ArrayList<String> data;
	private String[] stringData;
	
	public Ski() {
		data = new ArrayList<String>();
	}
	
	public Ski(String theID, String theConfig, String theName, String theCat, String theList, int thePos, int theListP, double thePrice) {
		data = new ArrayList<String>();
		id = theID;
		data.add(id);
		configurable = theConfig;
		data.add(configurable);
		name = theName;
		data.add(name);
		category = theCat;
		data.add(category);
		list = theList;
		data.add(list);
		position = thePos;
		data.add(String.valueOf(position));
		listPosition = theListP;
		data.add(String.valueOf(listPosition));
		price = thePrice;
		data.add(String.valueOf(price));
		stringData = new String[data.size()];
		for (int i = 0; i < data.size(); i++) {
			stringData[i] = data.get(i);
		}
	}
	
	
	
	public String[] toStringArray() {
		 return stringData;
	}
	
	@Override
	public String toString() {
		 String theReturn = "ID: " + id + " Configurable: " + configurable + " Name: " + name + " Category: " + category + " List: " + list + " Position: " + String.valueOf(position) + " ListPosition: " + String.valueOf(listPosition) + " Price: " + String.valueOf(price);
		 theReturn = theReturn.replace(",", "");
		 return theReturn;
	}

// Below are getters and setters!
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String isConfigurable() {
		return configurable;
	}


	public void setConfigurable(String configurable) {
		this.configurable = configurable;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getList() {
		return list;
	}


	public void setList(String list) {
		this.list = list;
	}


	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	}


	public int getListPosition() {
		return listPosition;
	}


	public void setListPosition(int listPosition) {
		this.listPosition = listPosition;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	public ArrayList<String> getSkiList() {
		return data;
	}
	
}
