package vnhistory.screen;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vnhistory.entity.Dynasty;
import vnhistory.entity.King;

public class DynastyDetailScreen {
DynastyDetailScreenController controller = new DynastyDetailScreenController();
	
	public Scene getDynastyDetailScene(Stage stage) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/DynastyDetail.fxml"));
		loader.setController(controller);
		Parent root = loader.load();
		return new Scene(root);
	}
	
	public void setController(Dynasty dynasty) {
		controller.setDynasty(dynasty);
	}
}
