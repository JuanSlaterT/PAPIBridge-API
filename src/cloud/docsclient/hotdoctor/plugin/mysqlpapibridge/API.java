package cloud.docsclient.hotdoctor.plugin.mysqlpapibridge;

import cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.managers.IdentifierManager;

public class API {
	
	private static IdentifierManager manager;
	public API(BridgePlugin plugin) {
		
	}
	
	
	static IdentifierManager getIdentifierManager() {
		return manager;
	}

}