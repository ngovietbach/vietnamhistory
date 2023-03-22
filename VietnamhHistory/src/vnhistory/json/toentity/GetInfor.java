package vnhistory.json.toentity;

import vnhistory.entity.Dynasty;
import vnhistory.entity.Event;
import vnhistory.entity.Festival;
import vnhistory.entity.Figure;
import vnhistory.entity.Place;
import vnhistory.test.VNHistoryTest;

public class GetInfor {
	private static final String wikiDS = "VNHistoryData/wiki";
	private static final String nksDS = "VNHistoryData/nguoikesu";

	GetInforFromJsonFile<Figure> getKing = new GetFigure();
	GetInforFromJsonFile<Dynasty> getDyn = new GetDynasty();
	GetInforFromJsonFile<Festival> getFes = new GetFestival();
	GetInforFromJsonFile<Place> getPlace = new GetPlace();
	GetInforFromJsonFile<Event> getEvent = new GetEvent();

	public void getFromWiki() {
		getKing.getEntityInfor(VNHistoryTest.figurestore, wikiDS + "/vua.json");
		getDyn.getEntityInfor(VNHistoryTest.dynstore, wikiDS + "/trieudai.json");
		getFes.getEntityInfor(VNHistoryTest.festivalstore, wikiDS + "/lehoi.json");
	}

	public void getFromNguoikesu() {
		getPlace.getEntityInfor(VNHistoryTest.placestore, nksDS + "/diadiem.json");
		getEvent.getEntityInfor(VNHistoryTest.eventstore, nksDS + "/sukien.json");
	}
}
