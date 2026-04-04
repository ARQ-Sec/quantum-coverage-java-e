package legacy.coverage;
import java.security.*;
public final class Rule001 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0068-java
        // evidence_anchor: (?s)KeyPairGenerator\.getInstance\(\s*["']RSA["']\s*\)[\s\S]…
        // regex_sample: initialize                                  (             2048
        // keywords: KeyPairGenerator | getInstance | RSA | initialize
        KeyPairGenerator
        getInstance
        RSA
        initialize
    }
}
