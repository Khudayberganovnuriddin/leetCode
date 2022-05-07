package leetCode.WixEngineering.ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAdresses {
    public static int numUniqueEmails(String[] emails) {
        Set<String> mails = new HashSet<>();
        for(String email : emails){
            int i = email.indexOf('@');
            String local = email.substring(0,i);
            String domain = email.substring(i);
            if(local.contains("+")){
                local = local.substring(0,local.indexOf('+'));
            }
            local = local.replaceAll("\\.","");
            mails.add(local + domain);
        }
        return mails.size();
    }
}
