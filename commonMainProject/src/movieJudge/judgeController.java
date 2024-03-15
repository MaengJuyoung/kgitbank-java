package movieJudge;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import noticeBoard.noticeBoardMain;
import noticeBoard.noticeBoardMain2;

public class judgeController implements Initializable{
	@FXML public Label judgeName;
	@FXML public ImageView judgeProfile;
	@FXML public TextArea judgeText;
	
	Parent root;
	movieJudgeService mjs;
	String name;
	movieJudgeDAO dao;
	String path;
	String mvpath;
	
	public void setRoot(Parent root, String name, String mvpath) {
		mjs.setRoot(root);
		this.root = root;
		this.name = name;
		this.mvpath = mvpath;
		judgeName.setText(name);
		
		path = "file:/" + path + "/src/resources/images" + "/" + mvpath;
		Image img = new Image(path);
		judgeProfile.setImage(img);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mjs = new movieJudgeServiceImpl();
		path = Paths.get("").toAbsolutePath().toString();
	}
	
	public void review() {
		dao = new movieJudgeDAO();
		dao.reviewSet(judgeText.getText(), mvpath);
	}
	public void backButton() {
		noticeBoardMain2 mtm = new noticeBoardMain2();
		mtm.viewFx(root);
	}
}
