package cn.leomc.mobfarmutilities.common.api;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public interface IProxy {

    void init();

    PlayerEntity getClientPlayer();

    World getClientWorld();

}
