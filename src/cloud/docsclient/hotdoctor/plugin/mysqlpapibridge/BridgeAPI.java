package cloud.docsclient.hotdoctor.plugin.mysqlpapibridge;

import cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.managers.IdentifierManager;

public class BridgeAPI {
	
	private static IdentifierManager manager;
	public BridgeAPI(BridgePlugin plugin) {
		
	}
	
	
	static IdentifierManager getIdentifierManager() {
		return manager;
	}

}