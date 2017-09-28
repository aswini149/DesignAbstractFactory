package mm.com.abstactfactorydpactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import mm.com.abstactfactorydpactivity.Factory.SamsungFactory;
import mm.com.abstactfactorydpactivity.Factory.VersionFactory;
import mm.com.abstactfactorydpactivity.version.Marshmellow;
import mm.com.abstactfactorydpactivity.version.Oreo;

public class MainActivity extends AppCompatActivity {
    private Marshmellow marshmellow;
    private Oreo oreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createVersion(new VersionFactory());
    }

    private void createVersion(final VersionFactory versionFactory) {
        setMarshmellow(versionFactory.createMarshmellow());
        setOreo(versionFactory.createOreoFactory());
    }

    public Marshmellow getMarshmellow() {
        return marshmellow;
    }

    public Oreo getOreo() {
        return oreo;
    }

    public void setMarshmellow(Marshmellow marshmellow) {
        this.marshmellow = marshmellow;
    }

    public void setOreo(Oreo oreo) {
        this.oreo = oreo;
    }
}
