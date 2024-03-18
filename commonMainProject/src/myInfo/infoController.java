package myInfo;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import commonMainProject.MainClass2;
import commonMainProject.MainDTO;
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
	@FXML public Label email;
	
	Parent root;
	String path;
	String id2, name2;
	infoService is;
	MainDTO dto;
	infoDAO dao;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		is = new infoServiceImpl();
		path = Paths.get("").toAbsolutePath().toString();
		path = "file:/" + path + "/src/resources/image/profile.png";
		System.out.println(path);
		Image img = new Image(path);
		image.setImage(img);
		System.out.println("멍청이");
		dao = new infoDAO();
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				Platform.runLater(()->{
					name.setText(dto.getName());
					id.setText(dto.getId());
					email.setText(dto.getEmail());
					System.out.println(dto);
					System.out.println(dto.getId());
					System.out.println(dto.getEmail());
					
				});
			}
		};
		thread.start();
	}

	public void setInfo(MainDTO dto) {
		System.out.println(dto.getId());
		//System.out.println("바보");
		this.id2 = dto.getId();
		this.name2 = dto.getName();
		this.dto = dto;
//		System.out.println(name);
//		System.out.println(id);
//		System.out.println(this.name2);
//		System.out.println(this.id2);
	}
	public void setRoot(Parent root) {
		this.root = root;
	}
	public void setRoot2(MainDTO dto) {
		this.dto = dto;
	}
	public void backButton() {
		MainClass2 mc = new MainClass2();
		System.out.println(dto.getId());
		mc.viewFx(root, dto);
	}
	public void out() {
		is.out(root, dto);
	}
	public void modify() {
		is.modify(root, id2, dto);
	}
}
