package legacy.coverage;
import java.security.*;
public final class Rule027 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0125-java
        // evidence_anchor: new X509EncodedKeySpec(...); KeyFactory.generatePublic(...)
        // regex_sample: X509EncodedKeySpec
        // keywords: X509EncodedKeySpec | KeyFactory.generatePublic
        X509EncodedKeySpec
        KeyFactory.generatePublic
    }
}
