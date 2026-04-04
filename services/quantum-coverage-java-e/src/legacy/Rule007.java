package legacy.coverage;
import java.security.*;
public final class Rule007 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0097-java
        // evidence_anchor: MessageDigest.getInstance("SHA-256")
        // regex_sample: SHA-256
        // keywords: MessageDigest.getInstance | SHA-256
        MessageDigest.getInstance("SHA-256");
    }
}
