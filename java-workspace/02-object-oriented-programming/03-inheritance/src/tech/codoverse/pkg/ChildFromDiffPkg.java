package tech.codoverse.pkg;

import tech.codoverse.isa.ParentType;

public class ChildFromDiffPkg extends ParentType {

    static {
        IO.println("static block in ChildFromDiffPkg.");
    }

    {
        IO.println("instance block in ChildFromDiffPkg.");
    }

    public ChildFromDiffPkg(String name) {
        super(name);
        init();
    }

}
