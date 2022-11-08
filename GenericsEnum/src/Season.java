public enum Season {
    WINTER ("December", "February"),
    SPRING ("March", "May"),
    SUMMER ("June", "August"),
    FALL ("September", "November");

    private String startMonth;
    private String endMonth;

    private Season (String start, String end)
    {
        this.startMonth = start;
        this.endMonth = end;
    }
}
