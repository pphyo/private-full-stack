package tech.codoverse.orm;

import java.util.ArrayList;

public class OrmProcessor {

	public static void generateSql(Object obj) throws Exception {
		var sqlFields = new ArrayList<String>();
		String queryPrefix;

		Class<?> clzz = obj.getClass();

		if (!clzz.isAnnotationPresent(Table.class)) {
			IO.println("This class is not defined with @Table");
			IO.println("So nothing to do.");
			return;
		}

		Table tbl = clzz.getAnnotation(Table.class);
		if (tbl.name().isBlank()) {
			queryPrefix = clzz.getSimpleName();
		} else {
			queryPrefix = tbl.name();
		}

		for (var field : clzz.getDeclaredFields()) {
			String fieldDefinition;
			if (field.isAnnotationPresent(Column.class)) {

				Column column = field.getAnnotation(Column.class);

				var fieldType = generateType(field.getType(), column);

				if (column.name().isEmpty()) {
					fieldDefinition = "%s %s".formatted(field.getName(), fieldType);
				} else {
					fieldDefinition = "%s %s".formatted(column.name(), fieldType);
				}

				sqlFields.add(fieldDefinition);
			}
		}

		IO.println("create table %s (".formatted(queryPrefix));
		for (int i = 0; i < sqlFields.size(); i++) {

			IO.print("\t" + sqlFields.get(i));

			if (i != sqlFields.size() - 1) {
				IO.print(",");
			}

			IO.println();
		}
		IO.println(");");
	}

	private static String generateType(Class<?> type, Column anno) {
		String result = "";
		String unique = anno.unique() ? " unique" : "";
		String nullable = anno.nullable() ? "" : " not null";

		if (type.equals(byte.class) || type.equals(Byte.class)) {
			result = "SMALLINT%s%s";
		} else if (type.equals(short.class) || type.equals(Short.class)) {
			result = "MEDIUMINT%s%s";
		} else if (type.equals(int.class) || type.equals(Integer.class)) {
			result = "INTEGER%s%s";
		} else if (type.equals(long.class) || type.equals(Long.class)) {
			result = "BIGINT%s%s";
		} else if (type.equals(float.class) || type.equals(Float.class)) {
			result = "FLOAT%s%s";
		} else if (type.equals(double.class) || type.equals(Double.class)) {
			result = "DOUBLE%s%s";
		} else if (type.equals(boolean.class) || type.equals(Boolean.class)) {
			result = "TINYINT%s%s";
		} else if (type.equals(char.class) || type.equals(Character.class)) {
			result = "CHAR(1)%s%s";
		}

		return type.equals(String.class) ? "VARCHAR(%d)%s%s".formatted(anno.length(), nullable, unique)
				: result.formatted(nullable, unique);
	}

}
