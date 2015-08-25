import org.zkoss.zk.ui.Component;
import org.zkoss.zul.Label;

public class BankImpl implements Bank {
	public void wireMoney(Component comp) {
		new Label("Wire money ...").setPage(comp.getPage());
	}
}
