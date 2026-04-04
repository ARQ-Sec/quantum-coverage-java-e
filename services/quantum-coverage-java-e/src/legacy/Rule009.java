package legacy.coverage;
import java.security.*;
public final class Rule009 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0099-java
        // evidence_anchor: MessageDigest.getInstance("SHA-512")
        // regex_sample: MessageDigest.getInstance
        // keywords: MessageDigest.getInstance | SHA-512
        MessageDigest.getInstance("SHA-512");
    }
}
