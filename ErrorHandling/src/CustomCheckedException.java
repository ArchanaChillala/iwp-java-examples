import java.io.IOException;

class CustomCheckedException extends IOException {

    CustomCheckedException(String message) {
        super(message);
    }

    CustomCheckedException() {
        super();
    }
}
