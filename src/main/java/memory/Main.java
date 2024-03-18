package memory;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

public class Main {

    public static void main(String[] args) {

//        separate();
//        System.out.println(VM.current().details());

        separate();
//        final Bar bar = new Bar();
        System.out.println(ClassLayout.parseClass(Bar.class).toPrintable());
    }

    private static void separate() {
        System.out.println("-".repeat(150));
    }
}

