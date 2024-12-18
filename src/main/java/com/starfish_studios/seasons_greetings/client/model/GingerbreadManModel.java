package com.starfish_studios.seasons_greetings.client.model;

import com.starfish_studios.seasons_greetings.SeasonsGreetings;
import com.starfish_studios.seasons_greetings.common.entity.GingerbreadMan;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

@Environment(EnvType.CLIENT)
public class GingerbreadManModel extends DefaultedEntityGeoModel<GingerbreadMan> {

    public GingerbreadManModel() {
        super(SeasonsGreetings.id("gingerbread_man"), true);
    }

    @Override
    public ResourceLocation getModelResource(GingerbreadMan gingerbreadMan) {
        return SeasonsGreetings.id("geo/entity/gingerbread_man.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GingerbreadMan gingerbreadMan) {
        return SeasonsGreetings.id("textures/entity/gingerbread_man.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GingerbreadMan gingerbreadMan) {
        return SeasonsGreetings.id("animations/gingerbread_man.animation.json");
    }

    @Override
    public void setCustomAnimations(GingerbreadMan gingerbreadMan, long instanceId, AnimationState<GingerbreadMan> animationState) {

        super.setCustomAnimations(gingerbreadMan, instanceId, animationState);
        if (animationState == null) return;

        CoreGeoBone root = this.getAnimationProcessor().getBone("rootRot");

    }
}