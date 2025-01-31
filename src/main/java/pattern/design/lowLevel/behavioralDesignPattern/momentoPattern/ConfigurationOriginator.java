package pattern.design.lowLevel.behavioralDesignPattern.momentoPattern;

public class ConfigurationOriginator {
    int height;
    int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMomento createMomento(){
        return new ConfigurationMomento(this.height, this.width);
    }

    public void restoreMomento(ConfigurationMomento momentoToBeRestore){
        this.height = momentoToBeRestore.height;
        this.width = momentoToBeRestore.width;
    }

}
