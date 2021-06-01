public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if ("Guest".equals("Employee")) {
            dialog = new GuestUserDialog();
        } else {
            dialog = new EmployeeUserDialog();
        }
    }
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
