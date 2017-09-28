package mm.com.abstactfactorydpactivity.Factory;

import mm.com.abstactfactorydpactivity.version.Marshmellow;
import mm.com.abstactfactorydpactivity.version.Oreo;

/**
 * Created by aswrath on 9/28/2017.
 */

public class SamsungFactory implements VersionFactory {

    @Override
    public Marshmellow createMarshmellow() {
        return null;
    }

    @Override
    public Oreo createOreoFactory() {
        return null;
    }
}
