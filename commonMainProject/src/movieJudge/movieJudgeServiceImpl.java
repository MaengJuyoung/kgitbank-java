package movieJudge;

import javafx.scene.Parent;

public class movieJudgeServiceImpl implements movieJudgeService{
	
	Parent root;
	
	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}
}
