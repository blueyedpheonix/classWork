package Interface;

public interface OtherinterFace extends sayMyName {
    @Override
    default String sayHiTo(String name) {
       return GREET + name;
    }
}
