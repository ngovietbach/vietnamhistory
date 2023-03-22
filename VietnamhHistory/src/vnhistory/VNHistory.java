package vnhistory;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vnhistory.entity.Dynasty;
import vnhistory.entity.Event;
import vnhistory.entity.Festival;
import vnhistory.entity.Figure;
import vnhistory.entity.Place;
import vnhistory.json.toentity.GetDynasty;
import vnhistory.json.toentity.GetEvent;
import vnhistory.json.toentity.GetFestival;
import vnhistory.json.toentity.GetKing;
import vnhistory.json.toentity.GetPlace;
import vnhistory.screen.MenuScreen;
import vnhistory.store.EntityStore;

public class VNHistory extends Application {
	public static EntityStore<Figure> figurestore = new EntityStore<>();
	public static EntityStore<Dynasty> dynstore = new EntityStore<>();
	public static EntityStore<Place> placestore = new EntityStore<>();
	public static EntityStore<Event> eventstore = new EntityStore<>();
	public static EntityStore<Festival> festivalstore = new EntityStore<>();

	public static void main(String[] args) throws IOException {
		GetKing getKing = new GetKing();
		getKing.getEntityInfor(figurestore, "VNHistoryData/wiki/vua.json");
		GetEvent getEvent = new GetEvent();
		getEvent.getEntityInfor(eventstore, "VNHistoryData/nguoikesu/sukien.json");
		GetPlace getPlace = new GetPlace();
		getPlace.getEntityInfor(placestore, "VNHistoryData/nguoikesu/diadiem.json");
		GetDynasty getDynasty = new GetDynasty();
		getDynasty.getEntityInfor(dynstore, "VNHistoryData/wiki/trieudai.json");
		GetFestival getFestival = new GetFestival();
		getFestival.getEntityInfor(festivalstore, "VNHistoryData/wiki/lehoi.json");
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Scene menu = new MenuScreen().getMenuScene(arg0);
		arg0.setTitle("Lmao");
		arg0.setScene(menu);
		arg0.show();
	}

}