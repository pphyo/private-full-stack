package tech.codoverse;

import tech.codoverse.entity.Account;
import tech.codoverse.orm.OrmProcessor;

public class AnnotationApp {

	void main() {
		try {
			OrmProcessor.generateSql(new Account());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}