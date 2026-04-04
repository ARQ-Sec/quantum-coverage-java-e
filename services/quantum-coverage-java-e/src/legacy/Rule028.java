package legacy.coverage;
import java.security.*;
public final class Rule028 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0128-java
        // evidence_anchor: KeyStore.getInstance("JCEKS")
        // regex_sample: KeyStore.getInstance
        // keywords: KeyStore.getInstance | JCEKS
        KeyStore.getInstance("JCEKS");
    }
}
