package dk.sidereal.lumm.architecture.concrete;

import dk.sidereal.lumm.architecture.LummScene;
import dk.sidereal.lumm.architecture.LummSceneLayer;

/**
 * Conveniance class to be extended when the user does not want to have the
 * entire {@link LummSceneLayer} API visible, the user being able to override
 * certain parts of the API if necessary.
 *
 * @author Claudiu Bele
 */
public class ConcreteLummSceneLayer extends LummSceneLayer {

    public ConcreteLummSceneLayer(LummScene scene, String tag) {
        super(scene, tag);
    }


}
