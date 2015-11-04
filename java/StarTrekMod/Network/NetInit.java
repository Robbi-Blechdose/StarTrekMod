package StarTrekMod.Network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;


public class NetInit {
	public static SimpleNetworkWrapper stNetwork;

	public static void init(){
		stNetwork = NetworkRegistry.INSTANCE.newSimpleChannel("StarTrekModChannel");
		
		//Register your messages here:
		
	}
	
}
