package legacy.coverage;
import java.security.*;
public final class Rule010 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0100-java
        // evidence_anchor: MessageDigest.getInstance("SHA3-256")
        // regex_sample: MessageDigest.getInstance
        // keywords: MessageDigest.getInstance | SHA3-256
        MessageDigest.getInstance("SHA3-256");
    }
}
