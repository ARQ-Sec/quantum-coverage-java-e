package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule016 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0108-java
        // evidence_anchor: SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512")
        // regex_sample: PBKDF2WithHmacSHA512
        // keywords: SecretKeyFactory.getInstance | PBKDF2WithHmacSHA512
        SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
    }
}
