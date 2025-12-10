package tech.codoverse.java.utils;

import tech.codoverse.java.models.domain.Student;

public class PrintTable {

    private final String ID_HEADER = "ID";
    private final String NAME_HEADER = "Name";
    private final String GENDER_HEADER = "Gender";
    private final String PHONE_HEADER = "Phone";
    private final String GRADE_HEADER = "Grade";

    private int[] lengths = new int[5];

    private Student[] list;

    {
        lengths[0] = ID_HEADER.length();
        lengths[1] = NAME_HEADER.length();
        lengths[2] = GENDER_HEADER.length();
        lengths[3] = PHONE_HEADER.length();
        lengths[4] = GRADE_HEADER.length();
    }

    public PrintTable(Student[] list) {
        this.list = list;
    }

    public void printTable() {
        // update max length
        updateMaxLength();

        var formatBuilder = new StringBuilder();
        // for id
        formatBuilder.append("| %").append(lengths[0]).append("s "); // | %2s | %-13s | %-6s | %-15s | %-5s |
        // for name
        formatBuilder.append("| %-").append(lengths[1]).append("s ");
        formatBuilder.append("| %-").append(lengths[2]).append("s ");
        formatBuilder.append("| %-").append(lengths[3]).append("s ");
        formatBuilder.append("| %-").append(lengths[4]).append("s |");

        printLine();
        // header
        printHeader(formatBuilder.toString());
        printLine();

        // rows
        printRows(formatBuilder.toString());

        printLine();

        // System.out.println();
    }

    private void printLine() {
        for (var length : lengths) {
            System.out.print("+");
            for (int i = 0; i < length + 2; i++) {
                System.out.print("-");
            }
        }
        System.out.print("+");
        System.out.println();
    }

    private void printHeader(String format) {
        System.out.println(format.formatted(ID_HEADER, NAME_HEADER, GENDER_HEADER, PHONE_HEADER, GRADE_HEADER));
    }

    private void printRows(String format) {
        for (var student : list) {
            System.out.println(format.formatted(student.getId(), student.getName(), student.getGender(),
                    student.getPhone(), student.getGrade()));
        }
    }

    private void updateMaxLength() {
        for (var student : list) {
            updateMaxLength(String.valueOf(student.getId()), ID_HEADER);
            updateMaxLength(String.valueOf(student.getName()), NAME_HEADER);
            updateMaxLength(String.valueOf(student.getGender()), GENDER_HEADER);
            updateMaxLength(String.valueOf(student.getPhone()), PHONE_HEADER);
            updateMaxLength(String.valueOf(student.getGrade()), GRADE_HEADER);
        }
    }

    private void updateMaxLength(String value, String header) {
        switch (header) {
            case "ID" -> {
                if (value.length() > lengths[0])
                    lengths[0] = value.length();
            }
            case "Name" -> {
                if (value.length() > lengths[1])
                    lengths[1] = value.length();
            }
            case "Gender" -> {
                if (value.length() > lengths[2])
                    lengths[2] = value.length();
            }
            case "Phone" -> {
                if (value.length() > lengths[3])
                    lengths[3] = value.length();
            }
            case "Grade" -> {
                if (value.length() > lengths[4])
                    lengths[4] = value.length();
            }
        }
    }

}
