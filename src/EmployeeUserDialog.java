public class EmployeeUserDialog extends Dialog {
    @Override
    public BaseUser createUser() {
        return new EmployeeUser();
    }
}
