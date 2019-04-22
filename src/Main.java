import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	ListView<String> skiView;
	DataGetter dataGet;
	String[] skiData;

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		dataGet = new DataGetter();
		primaryStage.setTitle("Skis");

		skiData = dataGet.getFileData("Skis.csv");

		
		skiView = new ListView<String>();
		for (int i = 0; i < skiData.length; i++) {
			skiView.getItems().add(getSkiName(skiData[i]));
		}
		skiView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		skiView.setPrefSize(120, 120);
		StackPane layout = new StackPane();

		layout.getChildren().add(skiView);

		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	private String getSkiName(String dat) {
		dat = dat.split(",")[2].replace("\"", "");
		dat = dat.replace(",", "");
		return dat;
	}

}
