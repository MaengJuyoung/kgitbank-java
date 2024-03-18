package myInfo;

import commonMainProject.MainDTO;
import javafx.scene.Parent;
import login.user.LoginDeleteMain;
import login.user.LoginModifyMain;

public class infoServiceImpl implements infoService{
	@Override
	public void out(Parent root, MainDTO dto) {
		LoginDeleteMain ld = new LoginDeleteMain();
		ld.delFx(root, dto);
	}
	@Override
	public void modify(Parent root, String id, MainDTO dto) {
		LoginModifyMain lm = new LoginModifyMain();
		lm.loginmodifymain(root, id, dto);
	}
}
