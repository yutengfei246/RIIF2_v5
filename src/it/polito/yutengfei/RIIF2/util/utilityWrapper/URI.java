package it.polito.yutengfei.RIIF2.util.utilityWrapper;

import java.util.ArrayList;
import java.util.List;

public class URI {
    private final String uriName;
    private final List<String> hiers ;

    public URI(String identifier) {
        this.uriName = identifier;
        this.hiers = new ArrayList<>();
    }

    public URI(URI childURI) {
        this.uriName = childURI.getUriName();
        this.hiers = new ArrayList<>();
    }

    public URI(URI childURI, String identifier) {
        this.uriName = childURI.getUriName();
        this.hiers = new ArrayList<>(childURI.getHiers());
        this.hiers.add(identifier);
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
        return new URI(childURI,identifier);
    }

    public List< String > getHiers() {
        return hiers;
    }
}
