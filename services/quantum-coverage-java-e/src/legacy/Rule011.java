package legacy.coverage;
import java.security.*;
public final class Rule011 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0101-java
        // evidence_anchor: MessageDigest.getInstance("SHA3-512")
        // regex_sample: SHA3-512
        // keywords: MessageDigest.getInstance | SHA3-512
        MessageDigest.getInstance("SHA3-512");
    }
}
