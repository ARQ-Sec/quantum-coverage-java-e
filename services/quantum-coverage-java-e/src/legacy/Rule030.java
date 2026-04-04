package legacy.coverage;
import java.security.*;
public final class Rule030 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0130-java
        // evidence_anchor: KeyStore.getInstance("PKCS12")
        // regex_sample: KeyStore.getInstance
        // keywords: KeyStore.getInstance | PKCS12
        KeyStore.getInstance("PKCS12");
    }
}
