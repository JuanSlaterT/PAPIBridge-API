package cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.events;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.BridgePlugin;
import cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.utils.Identifier;

public class AsyncIdentifierCompleteTaskEvent extends Event{
	private final HandlerList HANDLERS = new HandlerList();
	@Override
	public HandlerList getHandlers() {
		// TODO Auto-generated method stub
		return HANDLERS;
	}
	private OfflinePlayer player;
	private Identifier identifier;
	
	public AsyncIdentifierCompleteTaskEvent(OfflinePlayer player, Identifier identifier, BridgePlugin plugin) {
		this.player = player;
		this.identifier = identifier;
	}
	
	public OfflinePlayer getInvolvedOfflinePlayer() {
		return player;
	}
	public Identifier getInvolvedIdentifier() {
		return identifier;
	}
	

}
