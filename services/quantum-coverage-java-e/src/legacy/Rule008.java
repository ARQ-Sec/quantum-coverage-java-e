package legacy.coverage;
import java.security.*;
public final class Rule008 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0098-java
        // evidence_anchor: MessageDigest.getInstance("SHA-384")
        // regex_sample: MessageDigest.getInstance
        // keywords: MessageDigest.getInstance | SHA-384
        MessageDigest.getInstance("SHA-384");
    }
}
