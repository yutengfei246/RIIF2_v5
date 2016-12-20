package it.polito.yutengfei.RIIF2.util.utilityWrapper;

import java.util.ArrayList;
import java.util.List;

public class URI {
    private static final int HIER = 1;

    private final String uriName;
    private final List<String> hiers = new ArrayList<>();

    public URI(String identifier) {
        this.uriName = identifier;
    }

    public URI(URI childURI) {
        this.uriName = childURI.getUriName();
    }

    public URI(URI childURI, int hier, String identifier) {
        this.uriName = childURI.getUriName();
        if (hier == this.HIER) {
            this.hiers.addAll(childURI.getHiers());
            this.hiers.add(identifier);
        }
    }

    public static URI fromText(String identifier) {
        return  new URI( identifier );
    }

    public static URI fromUri(URI childURI) {
        return new URI(childURI);
    }

    public String getUriName() {
        return uriName;
    }

    public static URI uri2HierX(URI childURI, String identifier) {
        return new URI(childURI,HIER,identifier);
    }

    public List< String > getHiers() {
        return hiers;
    }
}
