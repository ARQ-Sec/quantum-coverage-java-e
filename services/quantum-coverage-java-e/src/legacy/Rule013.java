package legacy.coverage;
import java.security.*;
import javax.crypto.*;
public final class Rule013 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0105-java
        // evidence_anchor: new PBEKeySpec(...)
        // regex_sample: PBEKeySpec
        // keywords: PBEKeySpec
        SecretKeyFactory.getInstance("PBEKeySpec");
    }
}
