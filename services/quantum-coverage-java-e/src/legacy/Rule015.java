package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule015 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0107-java
        // evidence_anchor: SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256")
        // regex_sample: SecretKeyFactory.getInstance
        // keywords: SecretKeyFactory.getInstance | PBKDF2WithHmacSHA256
        SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
    }
}
