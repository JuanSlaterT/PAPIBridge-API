package cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.managers;

import java.util.List;

import cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.BridgePlugin;
import cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.utils.Identifier;

public class IdentifierManager {
	@SuppressWarnings("unused")
	private BridgePlugin plugin;

	public IdentifierManager(BridgePlugin plugin) {
		this.plugin = plugin;
	}
	
	public List<Identifier> getIdentifiersEnabled() {
		return null;
	}
	
	public Identifier getIdentifierByName(String name) {
		return null;
	}
	@SuppressWarnings("null")
	public boolean existsIdentifier(String name) {
		return (Boolean) null;
	}
	
	@SuppressWarnings("null")
	public boolean isSINGLE_UPLOAD(Identifier identifier) {
		return (Boolean) null;
	}
	@SuppressWarnings("null")
	public boolean isUPLOAD(Identifier identifier) {
		return (Boolean) null;
	}
	@SuppressWarnings("null")
	public boolean isSINGLE_DOWNLOAD(Identifier identifier) {
		return (Boolean) null;
	}
	
	@SuppressWarnings("null")
	public boolean isDOWNLOAD(Identifier identifier) {
		return (Boolean) null;
	}
	@SuppressWarnings("null")
	public boolean isCOMMUNICATION(Identifier identifier) {
		return (Boolean) null;
	}
}
