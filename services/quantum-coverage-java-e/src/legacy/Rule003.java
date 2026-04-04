package legacy.coverage;
import javax.crypto.*;
public final class Rule003 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0080-java
        // evidence_anchor: Mac\.getInstance\(\s*["']HmacSHA1["']\s*\)…
        // regex_sample: HmacSHA1
        // keywords: Mac | getInstance | HmacSHA1
        Mac
        getInstance
        HmacSHA1
    }
}
