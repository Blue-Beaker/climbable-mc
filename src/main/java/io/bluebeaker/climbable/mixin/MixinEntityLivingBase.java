package io.bluebeaker.climbable.mixin;

import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import net.minecraft.entity.EntityLivingBase;

@Mixin(EntityLivingBase.class)
public abstract class MixinEntityLivingBase {
    // Convert jump to climb ladder
    @Redirect(method = "travel", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/EntityLivingBase;collidedHorizontally:Z", opcode = Opcodes.GETFIELD))
    private boolean climbLadderOnJump(EntityLivingBase entity) {
        return entity.collidedHorizontally || ((AccessorEntityLivingBase)entity).getIsJumping();
    }
}
