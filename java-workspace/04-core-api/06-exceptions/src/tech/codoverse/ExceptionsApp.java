package tech.codoverse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.Deque;

public class ExceptionsApp implements AutoCloseable {

	void main() {
		run();
	}

	void run() {
		try {
			String name = IO.readln("Enter team name: ");
			if (name.isBlank()) {
				var cause = new IllegalArgumentException("Name is empty or null.");
				throw new TeamValidationException("Name cannot be empty!", cause);
			}

			int foundedYear = Integer.parseInt(IO.readln("Enter year founded: "));
			if (foundedYear <= 0) {
				throw new TeamValidationException("Founded year must greater than zero.");
			}

			String league = IO.readln("Enter league: ");
			if (league.isBlank()) {
				throw new TeamValidationException("League cannot be empty!");
			}

			var team = new Team(1, name, foundedYear, league);
			IO.println(team);
		} catch (TeamValidationException e) {
			IO.println(e.getMessage());
		} catch (NumberFormatException e) {
			IO.println(e.getMessage());
		}
	}

	@SuppressWarnings("unused")
	void runForSuppressed() {
		try (var app = new ExceptionsApp()) {
			throw new RuntimeException("blizzard");
		} catch (Exception e) {
			IO.println(e.getMessage() + " " + e.getSuppressed().length);
		}
	}

	public void close() {
		throw new RuntimeException("flurry");
	}

	void runForAutomaticallyManageResource() {
		try (var conn = DriverManager.getConnection("null");
				var stmt = conn.createStatement();) {

			stmt.execute("null");
		} catch (SQLException _) {

		}
	}

	void runForManuallyManageResource() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("null");
		} catch (SQLException _) {

		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException _) {

			}
		}
	}

	void runForFinally() {
		try {
			return;
		} catch (Exception _) {
		} finally {
			IO.println("finally");
		}
	}

	void runForMultiCatch() {
		try {
			var file = new File("");
			file.createNewFile();
		} catch (IOException | NullPointerException e) {
		}
	}

	void runForMultiHandlers() {
		try {
			var file = new File("");
			file.createNewFile();
		} catch (IndexOutOfBoundsException _) {

		} catch (FileNotFoundException _) {

		} catch (IOException _) {

		}
	}

	void runForCheckedException() {
		IO.println("Program entry");
		try {
			var hero = new Hero();
			var copy = hero.clone();
			IO.println(hero);
			IO.println(copy);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			IO.println("Catch ends");
		}

		IO.println("Program ends");
	}

	void runForUncheckedException() {
		IO.println("Program entry");
		IO.println(3 / 0);
		IO.println("Program ends");
	}

	void runCallstack() {
		IO.println("Program entry");
		try {
			new ExceptionCallStack().callThird();
		} catch (IOException e) {
			e.printStackTrace();
		}
		IO.println("Program ends");
	}

	void runForStackMemory() {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		deque.addFirst(4);
		deque.addFirst(5);

		for (var d : deque) {
			IO.println(d);
		}
	}
}