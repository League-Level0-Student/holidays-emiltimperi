import org.jointheleague.graphical.robot.Robot;

public class ValentinesDay {
public static void main(String[] args) {
	Robot heart = new Robot();
	heart.hide();
	heart.setWindowImage("hearts.jpg");
	heart.setSpeed(50);
	heart.moveTo(450, 450);
	heart.setAngle(23);
	heart.penDown();
	heart.move(300);
	heart.moveTo(450, 450);
	heart.setAngle(-22);
	heart.move(300);
	for (int j = 0; j < 2; j++) {
		
	
	heart.setAngle(0);
	for (int i = 0; i < 180; i++) {
		heart.move(1);
		heart.turn(1);
	}
}
}
}
