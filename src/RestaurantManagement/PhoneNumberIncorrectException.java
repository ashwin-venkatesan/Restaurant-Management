package RestaurantManagement;

class PhoneNumberIncorrectException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PhoneNumberIncorrectException() {
        super();
    }

    public PhoneNumberIncorrectException(String e) {
        super(e);
    }
}