package Configurations;

public class MatrixConfigurations {
    private int Width;
    private int Height;
    private String Pattern;

    public MatrixConfigurations(int width, int height, String pattern) {
        Width = width;
        Height = height;
        Pattern = pattern;
    }

    public int getWidth() {
        return Width;
    }

    public int getHeight() {
        return Height;
    }

    public String getPattern() {
        return Pattern;
    }
}
