package legacy.coverage;
import java.security.*;
public final class Rule002 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0069-java
        // evidence_anchor: Signature\.getInstance\(\s*["'][A-Za-z0-9-]+withRSA["']\s*\)…
        // regex_sample: Signature     .                     getInstance       (      'Jhhq0EOFKLv2jRvc2cBnaxmfsowithRSA"
        // keywords: Signature | getInstance | withRSA
        Signature
        getInstance
        withRSA
    }
}
