package lesson12;

public interface LoginForm {

    void typeLogin();
    void typePassword();
//    void submit();

default void submit() {

}
}