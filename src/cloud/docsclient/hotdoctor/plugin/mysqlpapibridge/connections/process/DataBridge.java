package cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.connections.process;

import cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.database.RAMDatabase;
import cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.utils.Identifier;

public abstract class DataBridge {
	
	private Identifier id;
	private RAMDatabase database;
	
	public Identifier getIdentifier() {
		return id;
	}
	public RAMDatabase getRAMDatabase() {
		return database;
	}
	
	public abstract void run();

}
