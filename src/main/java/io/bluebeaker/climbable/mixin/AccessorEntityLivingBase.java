package io.bluebeaker.climbable.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.entity.EntityLivingBase;

@Mixin(EntityLivingBase.class)
public interface AccessorEntityLivingBase {
    @Accessor
    boolean getIsJumping();
}
