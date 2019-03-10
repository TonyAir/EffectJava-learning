package num1;

import java.util.Enumeration;
import java.util.NoSuchElementException;

public class Complaint implements Enumeration {
    /**
     * Tests if this enumeration contains more elements.
     *
     * @return <code>true</code> if and only if this enumeration object
     * contains at least one more element to provide;
     * <code>false</code> otherwise.
     */
    @Override
    public boolean hasMoreElements() {
        return false;
    }

    /**
     * Returns the next element of this enumeration if this enumeration
     * object has at least one more element to provide.
     *
     * @return the next element of this enumeration.
     * @throws NoSuchElementException if no more elements exist.
     */
    @Override
    public Object nextElement() {
        return null;
    }
}
