package cn.leomc.mobfarmutilities.common.network;

import cn.leomc.mobfarmutilities.MobFarmUtilities;
import cn.leomc.mobfarmutilities.common.network.message.RedstoneModeChangeMessage;
import me.shedaniel.architectury.networking.NetworkChannel;
import net.minecraft.util.ResourceLocation;


public class NetworkHandler {
    private static final String PROTOCOL_VERSION = "1";
    public static NetworkChannel INSTANCE;

    public static void register() {
        INSTANCE = NetworkChannel.create(new ResourceLocation(MobFarmUtilities.MODID, "main"));

        INSTANCE.register(RedstoneModeChangeMessage.class, RedstoneModeChangeMessage::encode, RedstoneModeChangeMessage::decode, RedstoneModeChangeMessage::handle);
    }

}
