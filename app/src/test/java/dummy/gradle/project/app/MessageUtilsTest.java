/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dummy.gradle.project.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageUtilsTest {
    @Test void testGetMessage() {
        assertEquals("Hello      World!", MessageUtils.getMessage());
    }
}
