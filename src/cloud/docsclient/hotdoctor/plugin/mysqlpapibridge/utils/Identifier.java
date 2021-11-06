package cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.utils;

import cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.connections.process.DataBridge;

public class Identifier {
	
	private DataBridge databridge;
	private String identifier;
	private String type;
	
	public DataBridge getDatabridge() {
		return databridge;
	}
	public String getType() {
		return type;
	}
	public String getIdentifierName() {
		return identifier;
	}
	
}
