package cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.events;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.BridgePlugin;
import cloud.docsclient.hotdoctor.plugin.mysqlpapibridge.utils.Identifier;

public class AsyncPreprocessIdentifierCompleteTaskEvent extends Event implements Cancellable{
	private final HandlerList HANDLERS = new HandlerList();
	
	private OfflinePlayer player;
	private Identifier identifier;
	
	public AsyncPreprocessIdentifierCompleteTaskEvent(OfflinePlayer player, Identifier identifier, BridgePlugin plugin) {
		this.player = player;
		this.identifier = identifier;
	}
	@Override
	public boolean isCancelled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCancelled(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HandlerList getHandlers() {
		// TODO Auto-generated method stub
		return HANDLERS;
	}
	
	public OfflinePlayer getInvolvedOfflinePlayer() {
		return player;
	}
	public Identifier getInvolvedIdentifier() {
		return identifier;
	}

}
