package cloud.docsclient.hotdoctor.plugin.mysqlpapibridge;

import cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.managers.IdentifierManager;

public class BridgePlugin{
	
	private IdentifierManager identifierManager = new IdentifierManager(this);
	
	
	public IdentifierManager getIdentifierManager() {
		return identifierManager;
	}
}
