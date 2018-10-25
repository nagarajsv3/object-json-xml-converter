package com.nsv.jsmbaba.app;

import com.nsv.jsmbaba.domain.Rpan;
import com.nsv.jsmbaba.domain.Source;

public class EnumApp {

    public static void main(String[] args) {

        Rpan rpan = new Rpan("ENTERED_BY_HUMAN");
        System.out.println(rpan);

        rpan.setSource(Source.valueOf(rpan.getSource()).getSourceValue());
        System.out.println(rpan);


        String enteredbyHuman = "ENTERED_BY_HUMAN";
        String automated = "AUTOMATED";
        String unknown = "UNKNOWN";

        System.out.println(Source.valueOf(enteredbyHuman)+" "+Source.valueOf(enteredbyHuman).getClass());
        System.out.println(Source.valueOf(enteredbyHuman).getSourceValue()+" "+Source.valueOf(enteredbyHuman).getSourceValue().getClass());

        Source.valueOf(automated).setSourceValue("UNKNOWN");
        System.out.println(automated.getClass());

    }
}
