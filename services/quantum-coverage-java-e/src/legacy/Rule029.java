package legacy.coverage;
import java.security.*;
public final class Rule029 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0129-java
        // evidence_anchor: KeyStore.getInstance("JKS")
        // regex_sample: KeyStore.getInstance
        // keywords: KeyStore.getInstance | JKS
        KeyStore.getInstance("JKS");
    }
}
