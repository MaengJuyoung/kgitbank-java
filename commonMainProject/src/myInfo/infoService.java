package myInfo;

import commonMainProject.MainDTO;
import javafx.scene.Parent;

public interface infoService {
	public void out(Parent root, MainDTO dto);
	public void modify(Parent root, String id, MainDTO dto);
}
