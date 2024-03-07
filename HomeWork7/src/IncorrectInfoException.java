public class IncorrectInfoException extends Exception{
    private int age;
    private String fullName;
    public IncorrectInfoException() {
    }

    public IncorrectInfoException(String message, RuntimeException e) {
        super(message);
    }

    public IncorrectInfoException(String message, Throwable cause, int age, String fullName) {
        super(message, cause);
        this.age = age;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
