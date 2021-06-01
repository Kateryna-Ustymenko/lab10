public class GuestUserDialog extends Dialog {
    @Override
    public BaseUser createUser() {
        return new GuestUser();
    }
}
