package login.service;

import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public interface LoginService {
	public void loginFunc(Parent root, TextField fxId, TextField fxPwd, CheckBox chkId);
	public void registerFunc(Parent root);
	public void idfindFunc(Parent root);
	public void pwdfindFunc(Parent root);
	public void btnFind(String idf);
	public void btnPwd(String pwd);
	public String idid();
	public String btnfind();
}
