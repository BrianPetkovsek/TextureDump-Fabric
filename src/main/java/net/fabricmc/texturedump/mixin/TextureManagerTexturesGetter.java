package net.fabricmc.texturedump.mixin;

import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(TextureManager.class)
public interface TextureManagerTexturesGetter {
    @Accessor("textures")
    Map<Identifier, AbstractTexture> getTextures();
}
