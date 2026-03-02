public enum Category {
    TOXIC_RACIST(10),
    TOXIC_GENERAL(5),
    TOXIC_SEXUAL(7),
    OTHER(0),
    TOXIC_HATE(8);


    private final int severity;

    Category(int severity) {
        this.severity = severity;
    }

    public int getSeverity(){
        return severity;
    }
}
