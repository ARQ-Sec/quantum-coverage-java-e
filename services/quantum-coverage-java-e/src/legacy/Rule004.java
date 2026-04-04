package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule004 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0081-java
        // evidence_anchor: \bnew\s+Random\s*\(|\bMath\.random\s*\(…
        // regex_sample: new        Random               (
        // keywords: new Random | Math.random
        new Random
        Math.random
    }
}
