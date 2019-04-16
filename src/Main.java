import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

	ListView<String> skiView;
	DataGetter dataGet;
	
	public static void main(String[] args) {
		
		launch(args);
		
		}

	@Override
	public void start(Stage primaryStage) throws Exception {
		dataGet = new DataGetter();
		primaryStage.setTitle("Skis");
		
		String[] skiData = dataGet.getFileData("Skis.csv");
		
		skiView = new ListView<String>();
		skiView.getItems().addAll(skiData.);
		skiView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		skiView.setPrefSize(120, 120);
		StackPane layout = new StackPane();
		
		layout.getChildren().add(skiView);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}

}
