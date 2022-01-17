import java.util.Collections;

public class Test {
    public enum TestEnum{
        A,B,C
    }

    public enum CategoryMemberType {
        NOT_MEMBER("f"),
        MEMBER("t"),
        PENDING("r");

        private final String name;
        CategoryMemberType(String f) {
            this.name = f;
        }
    }
    public static void main(String[] args ) {
        TestEnum a = TestEnum.A;

        System.out.println("f".equals( CategoryMemberType.NOT_MEMBER.name));

    }
}
