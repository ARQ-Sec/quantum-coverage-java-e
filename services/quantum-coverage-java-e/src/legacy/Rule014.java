package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule014 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0106-java
        // evidence_anchor: SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")
        // regex_sample: SecretKeyFactory.getInstance
        // keywords: SecretKeyFactory.getInstance | PBKDF2WithHmacSHA1
        SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
    }
}
