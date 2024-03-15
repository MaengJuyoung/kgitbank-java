package noticeBoard;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import commonMainProject.MainClass2;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import movieJudge.movieJudgeMain;
import movieTest.movieTestMain;

public class Controller implements Initializable{
	@FXML public ImageView imageProfile;
	@FXML public ImageView movie1Profile;
	@FXML public ImageView movie2Profile;
	@FXML public ImageView movie3Profile;
	@FXML public ImageView movie4Profile;
	@FXML public Label idName;
	@FXML public Label movie1Name;
	@FXML public Label movie2Name;
	@FXML public Label movie3Name;
	@FXML public Label movie4Name;
	
	ObservableList<String> imageArr;
	String path;
	String path1;
	Parent root;
	String mvpath1, mvpath2, mvpath3, mvpath4;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		path1 = Paths.get("").toAbsolutePath().toString();
		path1 += "/src/resources/image";
		String basicStr = "file:/" + path1 + "/profile.png";
		
		Image basicImg = new Image(basicStr);
		imageProfile.setImage(basicImg);
		
		page1();
	}
	public void page1() {
		path = Paths.get("").toAbsolutePath().toString();
		path += "/src/resources/images";
		
		imageArr = FXCollections.observableArrayList();
		File fileList = new File(path);
		for(String p : fileList.list() ) {
			imageArr.add(p);
		}
		
		int mok = imageArr.size() / 4; 
		int nmg = imageArr.size() % 4; 
		if (mok >= 1) {
			for (int i = 0; i < 4; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 0) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath1 = imageArr.get(i);
				}else if (i == 1) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath2 = imageArr.get(i);
				}else if (i == 2) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath3 = imageArr.get(i);
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath4 = imageArr.get(i);
				}
			}
		}else {
			for (int i = 0; i < nmg; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 0) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath1 = imageArr.get(i);
				}else if (i == 1) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath2 = imageArr.get(i);
				}else if (i == 2) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath3 = imageArr.get(i);
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath4 = imageArr.get(i);
				}
			}
		}
	}
	public void page2() {
		int mok = imageArr.size() / 4; 
		int nmg = imageArr.size() % 4; 
		path = Paths.get("").toAbsolutePath().toString();
		path += "/src/resources/images";
		
		imageArr = FXCollections.observableArrayList();
		File fileList = new File(path);
		imageArr = FXCollections.observableArrayList();
		for(String p : fileList.list() ) {
			imageArr.add(p);
		}
		if (mok >= 2) {
			for (int i = 4; i < 8; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 4) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath1 = imageArr.get(i);
				}else if (i == 5) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath2 = imageArr.get(i);
				}else if (i == 6) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath3 = imageArr.get(i);
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath4 = imageArr.get(i);
				}
			}
		}else {
			for (int i = 4; i < 4 + nmg; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 0) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath1 = imageArr.get(i);
				}else if (i == 1) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath2 = imageArr.get(i);
				}else if (i == 2) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath3 = imageArr.get(i);
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath4 = imageArr.get(i);
				}
			}
		}
	}
	public void page3() {
		int mok = imageArr.size() / 4; 
		int nmg = imageArr.size() % 4; 
		path = Paths.get("").toAbsolutePath().toString();
		path += "/src/resources/images";
		
		imageArr = FXCollections.observableArrayList();
		File fileList = new File(path);
		imageArr = FXCollections.observableArrayList();
		for(String p : fileList.list() ) {
			imageArr.add(p);
		}
		if (mok >= 3) {
			for (int i = 8; i < 12; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 8) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath1 = imageArr.get(i);
				}else if (i == 9) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath2 = imageArr.get(i);
				}else if (i == 10) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath3 = imageArr.get(i);
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath4 = imageArr.get(i);
				}
			}
		}else {
			for (int i = 8; i < 8+nmg + nmg; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 8) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath1 = imageArr.get(i);
				}else if (i == 9) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath2 = imageArr.get(i);
				}else if (i == 10) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath3 = imageArr.get(i);
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath4 = imageArr.get(i);
				}
			}
		}
	}
	
	public void watchMovieButton() {
		page1();
	}
	
	public void movieTestButton() {
		movieTestMain mtm = new movieTestMain();
		mtm.viewFx(root);
	}
	movieJudgeMain mjm = new movieJudgeMain();
	
	public void movie1judge() {
		System.out.println(root);
		String name;
		name = movie1Name.getText();
		mjm.viewFx(root, name, mvpath1);
	}
	public void movie2judge() {
		String name;
		name = movie2Name.getText();
		mjm.viewFx(root, name, mvpath2);
	}
	public void movie3judge() {
		String name;
		name = movie3Name.getText();
		mjm.viewFx(root, name, mvpath3);
	}
	public void movie4judge() {
		String name;
		name = movie4Name.getText();
		mjm.viewFx(root, name, mvpath4);
	}
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void backButton() {
		MainClass2 mc = new MainClass2();
		mc.viewFx(root);
	}
}
