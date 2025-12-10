package tech.codoverse;

import tech.codoverse.data.Point;
import tech.codoverse.immutable.Circle;
import tech.codoverse.mutable.Rectangle;

public class RecordTypeApp {

	void main() {
		runForRecord();
	}

	void runForRecord() {
		var p1 = new Point(10, 20);
		var p2 = new Point(10, 20);
		var p3 = new Point(10, 21);

		IO.println(p1.equals(p2));
		IO.println(p2.equals(p3));
	}

	void runForEqualsHashCode() {

		var rect1 = new Rectangle(10, 20);
		var rect2 = new Rectangle(10, 20);

		IO.println(rect1.equals(rect2));

		var str1 = "Codoverse";
		var str2 = "Codoverse";
		var str3 = new String("Codoverse");
		var str4 = new String("Codoverse");

		IO.println(str1 == str2);
		IO.println(str2.equals(str3));
		IO.println(str1.equals(str4));

	}

	void runForImmutable() {
		var point = new Point(4, 91);
		IO.println(point.x());
		IO.println(point.y());

		var rect = new Rectangle(0, 0);
		rect.setWidth(10);

		// calculation
		IO.println("Rect width: " + rect.getWidth());

		rect.setWidth(30);
		IO.println("Rect width: " + rect.getWidth());

		var cir1 = new Circle(10);
		IO.println(cir1.toString());
		var cir2 = new Circle(20);
		IO.println(cir2.toString());

		IO.println(cir1 == cir2);
	}

}
