public abstract  class Dialog {
    public void renderWindow() {
        BaseUser baseUser = createUser();
        baseUser.login();
    }
    public abstract BaseUser createUser();
}

