class CustomUncheckedException extends RuntimeException {

    CustomUncheckedException(String message) {
        super(message);
    }

    CustomUncheckedException() {
        super();
    }
}
