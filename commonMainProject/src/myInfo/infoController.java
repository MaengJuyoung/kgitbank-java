package myInfo;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import commonMainProject.MainClass2;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class infoController implements Initializable{
	@FXML public ImageView image;
	@FXML public Label name;
	@FXML public Label id;
	
	Parent root;
	String path;
	String id2, name2;
	infoService is;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		is = new infoServiceImpl();
		path = Paths.get("").toAbsolutePath().toString();
		path = "file:/" + path + "/src/resources/image/profile.png";
		System.out.println(path);
		Image img = new Image(path);
		image.setImage(img);
		System.out.println("멍청이");
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				Platform.runLater(()->{
					name.setText(name2);
					id.setText(id2);
				});
			}
		};
		thread.start();
	}

	public void setInfo(String id, String name) {
		System.out.println("바보");
		this.id2 = id;
		this.name2 = name;
		System.out.println(name);
		System.out.println(id);
		System.out.println(this.name2);
		System.out.println(this.id2);
	}
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void backButton() {
		MainClass2 mc = new MainClass2();
		mc.viewFx(root);
	}
	public void out() {
		is.out(root);
	}
	public void modify() {
		is.modify(root, id2);
	}
}
