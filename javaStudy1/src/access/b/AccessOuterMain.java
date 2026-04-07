package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    static void main() {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        data.innerAccess();
    }
}