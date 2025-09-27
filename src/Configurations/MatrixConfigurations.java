package Configurations;

public class MatrixConfigurations {
    private int Width;
    private int Height;
    private String[] Pattern; // ["013","201","002"]

    public MatrixConfigurations() {
    }

    public void setWidth(int width) {
        Width = width;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public void setPattern(String[] pattern) {
        Pattern = pattern;
    }

    public int getWidth() {
        return Width;
    }

    public int getHeight() {
        return Height;
    }

    public String[] getPattern() {
        return Pattern;
    }
}
