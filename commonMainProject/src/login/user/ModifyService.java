package login.user;

import javafx.scene.Parent;

public interface ModifyService {
	public void setRoot(Parent root);
	public void btnDel(int result);
	public void delId(String id, String pwd, String email);
	public int del();
	public void btnModi();
	public void modiId(String pwd, String name, String email, String id);
	public int modi();
}
