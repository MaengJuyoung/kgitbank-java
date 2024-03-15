package myInfo;

import javafx.scene.Parent;
import login.user.LoginDeleteMain;
import login.user.LoginModifyMain;

public class infoServiceImpl implements infoService{
	@Override
	public void out(Parent root) {
		LoginDeleteMain ld = new LoginDeleteMain();
		ld.delFx(root);
	}
	@Override
	public void modify(Parent root, String id) {
		LoginModifyMain lm = new LoginModifyMain();
		lm.loginmodifymain(root, id);
	}
}
