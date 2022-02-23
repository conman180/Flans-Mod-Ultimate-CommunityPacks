package com.flansmod.newparts.common;

import com.flansmod.common.FlansMod;
import com.flansmod.common.IFlansContentProvider;
import cpw.mods.fml.common.Mod;

@Mod(modid = NewPartsPackMod.MODID,
        name = "Next-Gen Parts Pack",
        version = NewPartsPackMod.VERSION,
        dependencies = "required-after:" + FlansMod.MODID)
public class NewPartsPackMod implements IFlansContentProvider {
    public static final String MODID = "newpartspack";
    public static final String VERSION = "0.1beta";
    public static final String NAME = "Next-Gen Parts Pack";

    @Override
    public String getContentDirectory() {
        return "Next-Gen Parts Pack";
    }

    @Override
    public void registerModelLocations() {
        FlansMod.registerModelLocation("newparts", "com.flansmod.newparts.client.model");
    }
}
