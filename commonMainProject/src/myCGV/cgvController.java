package myCGV;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import commonMainProject.MainClass;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import reserve.dto.ReserveDTO;

public class cgvController implements Initializable{
	@FXML public ImageView purchaseImage;
	@FXML public Label movieName;
	@FXML public Label moviePlace;
	@FXML public Label movieDate;
	@FXML public Label movieTime;
	@FXML public Label cinema;

	ReserveDTO rdto;
	Parent root;
	String path;
	String moviename;
	String movieplace;
	String moviedate;
	String movietime;
	String Cinema;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Thread thread = new Thread() {
			@Override
			public void run() {

				Platform.runLater(()->{
					for( ;rdto == null; );
//					System.out.println("영화 이름 : " + rdto.getMovie());
//					System.out.println("영화 장소 : " + rdto.getPlace());
//					System.out.println("영화 관 : " + rdto.getTheater());
//					System.out.println("영화 날짜 : " + rdto.getDate());
//					System.out.println("영화 시간 : " + rdto.getTime());
					moviename = rdto.getMovie();
					movieplace = rdto.getPlace();
					moviedate = rdto.getDate();
					movietime = rdto.getTime();
					Cinema = rdto.getTheater();
					path = Paths.get("").toAbsolutePath().toString();
					path = "file:/" + path + "/src/info";
					String index = null;
					switch (rdto.getIndex()) {
					case 0: index = "01"; break;
					case 1: index = "02"; break;
					case 2: index = "03"; break;
					case 3: index = "04"; break;
					case 4: index = "05"; break;
					case 5: index = "06"; break;
					case 6: index = "07"; break;
					case 7: index = "08"; break;
					case 8: index = "09"; break;
					case 9: index = "10"; break;
					}
					path = path + "/" + index + ".jpg";
					purchaseImage.setImage(new Image(path));;
					movieName.setText(moviename);
					moviePlace.setText(movieplace);
					movieDate.setText(moviedate);
					movieTime.setText(movietime);
					cinema.setText(Cinema);
				});
			}
		};
		thread.start();
	}
	public void setRoot(Parent root, ReserveDTO rdto) {
		System.out.println("영화 이름 : " + rdto.getMovie());
		this.root = root;
		this.rdto = rdto;
	}
	public void backButton() {
		MainClass mc = new MainClass();
		mc.viewFx(root);
	}
}
