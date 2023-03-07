package buoi4_buoi_chieu;
import java.awt.Robot;
import java.awt.event.InputEvent;
public class HinhVuong {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        int delay = 2000; // 2 seconds

        // Move mouse to desired location
        robot.mouseMove(100, 100);

        // Click left mouse button
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(100);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(delay);

        // Click right mouse button
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.delay(100);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        robot.delay(delay);
    }
}
